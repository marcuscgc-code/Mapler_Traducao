package mapler.Controllers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import mapler.Repositories.QuizRepository;
import mapler.model.Entities.Quiz;
import mapler.model.Entities.QuizScore;
@Controller
public class QuizController {
    @Autowired
    private QuizRepository quizRepository = new QuizRepository();
    
    private List<Quiz> quizzes;
    private Quiz currentQuiz;
    private boolean read = false;
    private QuizScore quizScore;

    @GetMapping(value = "/quiz")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("quiz");

        if (quizzes == null || quizzes.isEmpty()) {
            if (!read){
                quizzes = quizRepository.findAll("quiz.json");
                Collections.shuffle(quizzes);

                for (Quiz quiz : quizzes) {
                    Collections.shuffle(quiz.getAnswers());
                }

                read = true;
                quizScore = QuizScore.builder().
                score(0).
                mistakes(0).
                questionsQuantity(quizzes.size()).
                percentScore(0.0).
                wrongAnswers(new ArrayList<Quiz>()).
                build();
            }
        }
        try{
            this.currentQuiz = quizzes.remove(0);
            mv.addObject("quiz", this.currentQuiz);
        }catch (IndexOutOfBoundsException e){
            this.read = false;
            this.quizScore.resolveQuizScore();
            return new ModelAndView("pontuacao").addObject("score", this.quizScore);
        }
        return mv;  
    }

    @RequestMapping(value = "/quiz/verify", method = RequestMethod.POST)
    public String verifyAnswer(@RequestParam("correct") String correct,
    @RequestParam("userAnswer") String userAnswer, Model model, RedirectAttributes redirectAttributes){
        if (userAnswer != null){
            if (userAnswer.equals(correct)) {
                this.quizScore.increaseScore();
                redirectAttributes.addFlashAttribute("message", "A resposta está correta Pontuaçao = " + this.quizScore.getScore());
            } else {
                redirectAttributes.addFlashAttribute("message", "A resposta está incorreta Pontuaçao = " + this.quizScore.getScore());
                redirectAttributes.addFlashAttribute("correct", correct);
                this.quizScore.add(currentQuiz);
            }
        }
        
        return "redirect:/quiz";
    }
}
