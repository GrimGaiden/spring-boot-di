package com.bolsadeideas.springboot.app.springbootdi.models.services;

//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;

//@Component("miServicioSimple")
//@Primary
public class MiServicio implements Servicio{
    
    @Override
    public String operacion() {
        return "ejecutando algún proceso importante simple...";
    }
}