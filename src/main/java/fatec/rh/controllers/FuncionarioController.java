package fatec.rh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import fatec.rh.models.Funcionario;
import fatec.rh.services.funcionario.FuncionarioService;

@Controller
public class FuncionarioController {
    private FuncionarioService fs; 

    public FuncionarioController(FuncionarioService fs) {
        this.fs = fs;
    }

    @GetMapping(value = "/Funcionario/inserir")
    public ModelAndView inserirFuncionario() {
        ModelAndView mv = new ModelAndView("Funcionario/inserir");
        Funcionario novo = new Funcionario();
        mv.addObject("Funcionario", novo);
        return mv;
    }

    @PostMapping("/Funcionario/inserir")
    public String cadastrarFuncionario(Funcionario funcionario) {
        fs.inserir(funcionario);
        return "redirect:/Funcionario/listar";
    }

    @GetMapping(value = "/Funcionario/listar")
    public ModelAndView listarFuncionario() {
        ModelAndView mv = new ModelAndView("Funcionario/listar");
        mv.addObject("Funcionarios", fs.listarFuncionario());
        return mv;
    }
    
    @GetMapping("/Funcionario/editar")
    public String editarFuncionario() {
        return "/Funcionario/editar";
    }
}
