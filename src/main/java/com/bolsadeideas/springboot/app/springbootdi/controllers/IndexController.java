package com.bolsadeideas.springboot.app.springbootdi.controllers;

import com.bolsadeideas.springboot.app.springbootdi.models.services.Servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private Servicio servicio;

    @Autowired
    public IndexController(Servicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping({"/", "", "/index"})
    public String index(Model model) {
        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }

}