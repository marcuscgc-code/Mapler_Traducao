package mapler.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExemploController {

    @GetMapping("/exemplo")
    public String exemplo() {
        return "exemplos/exemplo";
    }

    //----------------------------------------- PORTUGOL -----------------------------------------
    @GetMapping("/exemplo/portugol/estrutura-codigo")
    public String exemploEstrutura() {
        return "exemplos/portugol/estrutura-codigo";
    }

    @GetMapping("/exemplo/portugol/entrada-saida")
    public String exemploEntrada(){ return  "exemplos/portugol/entrada-saida"; }

    @GetMapping("/exemplo/portugol/modulos")
    public String exemploModulos() { return "exemplos/portugol/modulos"; }

    @GetMapping("/exemplo/portugol/tipos")
    public String exemploTipos() { return "exemplos/portugol/tipos"; }

    @GetMapping("/exemplo/portugol/operacoes")
    public String exemploOperacoes() { return "exemplos/portugol/operacoes"; }

    @GetMapping("/exemplo/portugol/condicionais")
    public String exemploCondicionais() { return "exemplos/portugol/condicionais"; }

    @GetMapping("/exemplo/portugol/lacos")
    public String exemploLacos() { return "exemplos/portugol/lacos"; }

    //-----------------------------------------  FIM PORTUGOL -----------------------------------------

    //-----------------------------------------  FLUXOGRAMA -----------------------------------------

    @GetMapping("/exemplo/fluxograma/estrutura-fluxograma")
    public String exemploEstruturaFluxograma() {
        return "exemplos/fluxograma/estrutura-fluxograma";
    }

    @GetMapping("/exemplo/fluxograma/entrada-saida")
    public String exemploEntradaFluxograma(){ return  "exemplos/fluxograma/entrada-saida"; }

    @GetMapping("/exemplo/fluxograma/associacao")
    public String exemploAssociacao() { return "exemplos/fluxograma/associacao"; }


    @GetMapping("/exemplo/fluxograma/operacoes")
    public String exemploOperacoesFluxograma() { return "exemplos/fluxograma/operacoes"; }

    @GetMapping("/exemplo/fluxograma/condicionais")
    public String exemploCondicionaisFluxograma() { return "exemplos/fluxograma/condicionais"; }

    @GetMapping("/exemplo/fluxograma/lacos")
    public String exemploLacosFluxograma() { return "exemplos/fluxograma/lacos"; }

    //----------------------------------------  FIM FLUXOGRAMA ---------------------------------------
}
