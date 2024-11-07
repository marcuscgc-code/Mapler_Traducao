package mapler.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DesenvolvimentoController {

    @GetMapping("/desenvolvimento")
    public String desenvolvimento() {
        return "desenvolvimento";
    }

}
