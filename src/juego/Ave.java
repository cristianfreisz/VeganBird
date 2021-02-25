package juego;

import entorno.Entorno;
import java.awt.Image;


public class Ave extends Posicion{
	private Image imagen;
	private Disparo tiro;
	
	Ave(double x, double y,Image c){
		super(x, y);
		this.imagen=c;
	}
	
	public void dibujar(Entorno e){
		e.dibujarImagen(this.imagen,getX(),getY(),0);
	}

	void caer(){
		setY(getY()+2.2);
	}
	
	void saltar(){
		setY(getY()-4);
	}
	
	public Disparo disparar() {
		this.tiro = new Disparo(getX(),getY());
		return tiro;
	}
	
	
	public void setImagen(Image c){
		this.imagen = c;
	}
	public Image getImagen(){
		return this.imagen;
	}
	
	
}
