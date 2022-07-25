package mapler.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FluxogramaController {

    @GetMapping("/fluxograma")
    public String contato() {
        return "fluxograma";
    }
}
