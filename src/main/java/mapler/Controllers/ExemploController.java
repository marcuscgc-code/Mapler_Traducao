package mapler.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExemploController {

    @GetMapping("/exemplo")
    public String exemplo() {
        return "exemplos/estrutura-codigo";
    }

    @GetMapping("/exemplo/estrutura-codigo")
    public String exemploEstrutura() {
        return "exemplos/estrutura-codigo";
    }

    @GetMapping("/exemplo/entrada-saida")
    public String exemploEntrada(){ return  "exemplos/entrada-saida"; }

    @GetMapping("/exemplo/modulos")
    public String exemploModulos() { return "exemplos/modulos"; }

    @GetMapping("/exemplo/tipos")
    public String exemploTipos() { return "exemplos/tipos"; }

    @GetMapping("/exemplo/operacoes")
    public String exemploOperacoes() { return "exemplos/operacoes"; }

    @GetMapping("/exemplo/condicionais")
    public String exemploCondicionais() { return "exemplos/condicionais"; }

    @GetMapping("/exemplo/lacos")
    public String exemploLacos() { return "exemplos/lacos"; }

}
