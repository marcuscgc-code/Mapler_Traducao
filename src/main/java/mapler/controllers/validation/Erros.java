package mapler.controllers.validation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Erros {

    @GetMapping("/error")
    public String error(){
        return "error";
    }


}
