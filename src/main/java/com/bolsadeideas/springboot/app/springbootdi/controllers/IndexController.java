package com.bolsadeideas.springboot.app.springbootdi.controllers;

import com.bolsadeideas.springboot.app.springbootdi.models.services.MiServicio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private MiServicio servicio = new MiServicio();

    @GetMapping({"/", "", "/index"})
    public String index(Model model) {
        model.addAttribute("objecto", servicio.operacion());
        return "index";
    }
}