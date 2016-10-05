package mx.itson.clima.nucleo.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mx.itson.clima.nucleo.interfaces.interfaceCiudad;
import mx.itson.clima.nucleo.negocio.implementacionCiudad;

public class Main {

	public static void main(String[] args) {
		
		List<Clima> climas = new ArrayList();
		
	
		Date fecha = new Date();
		
		
		Clima climaActual = new Clima(0,23.0,19.0,31.3, 44, fecha);
		Clima climaManana = new Clima(1,29.0,24.0,33.3, 35, fecha);
		Clima climaPasado = new Clima(2,25.0,22.0,35.3, 29, fecha);
		
		climas.add(climaActual);
		climas.add(climaManana);
		climas.add(climaPasado);
		
		Ciudad ciudad1 = new Ciudad(0,"Guaymas", climas);
		
		interfaceCiudad impCiudad = new implementacionCiudad();
		
		
		List<Ciudad> ciudades = new ArrayList();
		ciudades.add(ciudad1);
		impCiudad.obtenerCiudad(ciudades);
		
	}

}
