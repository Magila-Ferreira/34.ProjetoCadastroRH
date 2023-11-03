package fatec.rh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FuncionarioController {
    @GetMapping("/Funcionario/inserir")
    public String inserirFuncionario() {
        return "/Funcionario/inserir";
    }

    @GetMapping("/Funcionario/listar")
    public String listarFuncionario() {
        return "/Funcionario/listar";
    }
}
