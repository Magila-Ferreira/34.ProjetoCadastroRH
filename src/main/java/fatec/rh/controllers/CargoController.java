package fatec.rh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CargoController {

    @GetMapping("/Cargo/inserir")
    public String inserirCargo() {
        return "/Cargo/inserir";
    }

    @GetMapping("/Cargo/listar")
    public String listarCargo() {
        return "/Cargo/listar";
    }
}
