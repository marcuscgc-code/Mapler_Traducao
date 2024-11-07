package mapler.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import mapler.model.Codigo;
import mapler.model.Tradutor;

@Controller
public class CodigoController {

    @GetMapping("/codigo")
    public String codigo(Model model) {
        model.addAttribute("codigo", new Codigo());
        model.addAttribute("tradutor", new Tradutor());
        return "codigo";
    }

    @PostMapping("/codigo")
    public String traduzir(@ModelAttribute Codigo codigo, Model model) {
        model.addAttribute("codigo", codigo);

        Tradutor tradutor = new Tradutor();
        tradutor.ativar(codigo.getTexto());
        model.addAttribute("tradutor", tradutor);
        return "codigo";
    }
}
