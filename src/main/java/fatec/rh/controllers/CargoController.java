package fatec.rh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import fatec.rh.models.Cargo;
import fatec.rh.services.cargo.CargoService;

@Controller
public class CargoController {
    private CargoService cs;

    public CargoController(CargoService cs) {
        this.cs = cs;
    } 
    
    @GetMapping(value = "/Cargo/inserir")
    public ModelAndView inserirCargo() {
        ModelAndView mv = new ModelAndView("Cargo/inserir");
        Cargo novo = new Cargo();
        mv.addObject("Cargo", novo);
        return mv;
    }

    @PostMapping("/Cargo/inserir")
    public String cadastrarCargo(Cargo cargo) {
        cs.inserir(cargo);
        return "redirect:/Cargo/listar";
    }

    @GetMapping(value = "/Cargo/listar")
    public ModelAndView listarCargo() {
        ModelAndView mv = new ModelAndView("Cargo/listar");
        mv.addObject("Cargos", cs.listarCargo());
        return mv;
    }
}

