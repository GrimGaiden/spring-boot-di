package com.bolsadeideas.springboot.app.springbootdi.models.services;

import org.springframework.stereotype.Component;

@Component
public class MiServicio {
    
    public String operacion() {
        return "ejecutando algún proceso importante...";
    }
}