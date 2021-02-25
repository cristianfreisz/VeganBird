package juego;

import entorno.Entorno;
import java.awt.Image;

public class Tubo extends Posicion {
	private Image imagen;
	private String orientacion;
	private double estado = 0;

	
	Tubo(double x, double y, Image c, String t){
		super(x, y);
		this.imagen=c;
		this.orientacion = t;
	}
	
	public void dibujar(Entorno e){
		e.dibujarImagen(this.imagen,getX(),getY(),0);
	}
	
	void mover(){
		setX(getX()-1.5);
	}
	
	public void resetX() {
		setX(2750);
	}
	
	public void resetY(double y) {
		setY(getY()+y);
	}
	
	public void setOrientacion(String orientacion){
		this.orientacion = orientacion;
	}
	public String getOrientacion(){
		return this.orientacion;
	}
	public void setEstado(double e){
		this.estado = e;
	}
	public double getEstado(){
		return this.estado;
	}
}
