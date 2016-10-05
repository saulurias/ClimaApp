package mx.itson.clima.nucleo.negocio;

import java.util.List;

import mx.itson.clima.nucleo.entidades.Ciudad;
import mx.itson.clima.nucleo.entidades.Clima;
import mx.itson.clima.nucleo.interfaces.interfaceCiudad;

public class implementacionCiudad implements interfaceCiudad {
	public void obtenerCiudad(List<Ciudad> ciudades){
		for(int i = 0; i < ciudades.size(); i++){
			
			List<Clima> climas = ciudades.get(i).getClimas();
			
			String ciudadNombre = ciudades.get(i).getNombre();			
			for (int j = 0; j < 3; j++){ 
			System.out.println("Ciudad: "+ ciudadNombre);
			System.out.println("Fecha: "+ climas.get(j).getFecha());
			System.out.println("Temperatura Actual: " + climas.get(j).getTempActual());
			System.out.println("Temperatura Máxima: " + climas.get(j).getTempMaxima());
			System.out.println("Temperatura Minima: " + climas.get(j).getTempMinima());
			System.out.println("Humedad: " + climas.get(j).getHumedad());
			}
		}
	}
}
