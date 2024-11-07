package mapler.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import mapler.model.Entities.QuizScore;

@Controller
public class PontuacaoController {
    @GetMapping("/pontuacao")
    public String exibirPontuacao(@ModelAttribute("score") QuizScore quizScore, Model model) {
        return "pontuacao";
    }
}
