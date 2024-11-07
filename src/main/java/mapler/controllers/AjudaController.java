package mapler.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AjudaController {
    @GetMapping("/ajuda")
    public String ajuda() {
        return "ajuda";
    }
    @GetMapping("/ajuda/fluxograma/geral")
    public String geral() {
        return "/fluxograma/geral";
    }
    @GetMapping("/ajuda/fluxograma/entrada-saida")
    public String entradaSaida() {
        return "/fluxograma/entrada-saida";
    }
    @GetMapping("/ajuda/fluxograma/eventos")
    public String eventos() {
        return "/fluxograma/eventos";
    }
    @GetMapping("/ajuda/fluxograma/figuras")
    public String figuras() {
        return "/fluxograma/figuras";
    }
    @GetMapping("/ajuda/fluxograma/lacos")
    public String lacos() {
        return "/fluxograma/lacos";
    }
    @GetMapping("/ajuda/fluxograma/pontoscontrole")
    public String pontosControle() {
        return "/fluxograma/pontoscontrole";
    }
    @GetMapping("/ajuda/manuais")
    public String manual() {
        return "manuais";
    }
}
