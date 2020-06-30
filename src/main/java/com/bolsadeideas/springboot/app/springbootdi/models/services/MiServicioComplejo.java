package com.bolsadeideas.springboot.app.springbootdi.models.services;

//import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")
public class MiServicioComplejo implements Servicio{
    
    @Override
    public String operacion() {
        return "ejecutando algún proceso importante complicado...";
    }
}