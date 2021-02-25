package juego;

import entorno.Entorno;

public abstract class Posicion {
	private double x;
	private double y;
	
	Posicion(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void setX(double x){
		this.x = x;
	}
	public double getX(){
		return this.x;
	}
	public void setY(double y){
		this.y = y;
	}
	public double getY(){
		return this.y;
	}
	
	public abstract void dibujar(Entorno e);
}
