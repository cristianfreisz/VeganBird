package juego;

import java.awt.Color;

import entorno.Entorno;

public class Disparo extends Posicion {

	Disparo(double x, double y){
		super(x, y);
	}

	public void dibujar(Entorno e){
		e.dibujarCirculo(getX(),getY(), 10, Color.MAGENTA);
	}
	
	public boolean colision(Comida c) {
		if((c.getX()-25 < getX()+5 && c.getX()+25 > getX()-5) 
				&& (c.getY()-25 < getY()+5 && c.getY()+25 > getY()-5)){
					return true;
				}
				return false;
	}

	void mover() {
		
		setX(getX()+5);
	}

}
