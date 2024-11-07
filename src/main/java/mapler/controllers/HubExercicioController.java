package mapler.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HubExercicioController {
    @GetMapping("/hubexercicios")
    public String hubExercicio(){
        return "hubexercicios";
    }
    @GetMapping("/hubexercicios/procedimentos")
    public String procedimentos(){
        return "/exercicios/procedimentos";
    }
    @GetMapping("/hubexercicios/decisoes")
    public String decisoes(){
        return "/exercicios/decisoes";
    }
    @GetMapping("/hubexercicios/repeticoes")
    public String repeticoes(){
        return "/exercicios/repeticoes";
    }
    @GetMapping("/hubexercicios/sequenciais")
    public String sequenciais(){
        return "/exercicios/sequenciais";
    }

}
