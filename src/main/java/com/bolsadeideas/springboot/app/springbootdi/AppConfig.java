package com.bolsadeideas.springboot.app.springbootdi;

import java.util.Arrays;
import java.util.List;

import com.bolsadeideas.springboot.app.springbootdi.models.domain.ItemFactura;
import com.bolsadeideas.springboot.app.springbootdi.models.domain.Producto;
import com.bolsadeideas.springboot.app.springbootdi.models.services.MiServicio;
import com.bolsadeideas.springboot.app.springbootdi.models.services.MiServicioComplejo;
import com.bolsadeideas.springboot.app.springbootdi.models.services.Servicio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    
    @Bean("miServicioSimple")
	@Primary
	public Servicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	public Servicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}

    @Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Camara Sony", 100);
		Producto producto2 = new Producto("Bicicleta Bianchi aro 26", 200);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		
		return Arrays.asList(linea1, linea2);
	}
}