package mapler.Controllers;

import mapler.model.Codigo;
import mapler.model.Tradutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
