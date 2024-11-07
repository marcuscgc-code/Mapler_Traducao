package mapler.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComecaQuizController {
    @GetMapping(value = "/comecaquiz")
    public String comecaQuiz(){
        return "bemvindoquiz";
    }
}
