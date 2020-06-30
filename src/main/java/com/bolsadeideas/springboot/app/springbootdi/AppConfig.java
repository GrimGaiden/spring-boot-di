package com.bolsadeideas.springboot.app.springbootdi;

import java.util.Arrays;
import java.util.List;

import com.bolsadeideas.springboot.app.springbootdi.models.domain.ItemFactura;
import com.bolsadeideas.springboot.app.springbootdi.models.domain.Producto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean("itemsFactura")
    public List<ItemFactura> registrarItem() {
        Producto producto1 = new Producto("Camara Sony", 100);
        Producto producto2 = new Producto("Bicicleta Bianchi aro 26", 200);
        
        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);

        return Arrays.asList(linea1, linea2);
    }
}