package mx.itson.clima.nucleo.entidades;

import java.util.Date;

public class Clima {
	int id;
	double tempActual;
	double tempMinima;
	double tempMaxima;
	double humedad;
	Date fecha;
	
	
	
	public Clima(int id, double tempActual, double tempMinima, double tempMaxima, double humedad, Date fecha) {
		super();
		this.id = id;
		this.tempActual = tempActual;
		this.tempMinima = tempMinima;
		this.tempMaxima = tempMaxima;
		this.humedad = humedad;
		this.fecha = fecha;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTempActual() {
		return tempActual;
	}
	public void setTempActual(double tempActual) {
		this.tempActual = tempActual;
	}
	public double getTempMinima() {
		return tempMinima;
	}
	public void setTempMinima(double tempMinima) {
		this.tempMinima = tempMinima;
	}
	public double getTempMaxima() {
		return tempMaxima;
	}
	public void setTempMaxima(double tempMaxima) {
		this.tempMaxima = tempMaxima;
	}
	public double getHumedad() {
		return humedad;
	}
	public void setHumedad(double humedad) {
		this.humedad = humedad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
