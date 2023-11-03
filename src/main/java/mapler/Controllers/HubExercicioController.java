package mapler.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HubExercicioController {
    @GetMapping("/hubexercicios")
    public String hubExercicio(){
        return "hubexercicios";
    }
}
