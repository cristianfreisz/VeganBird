package juego;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

import entorno.Entorno;

public class Comida extends Posicion{
	private Image i;
	private String tipo;
	private Image verdura = new ImageIcon(getClass().getResource("broccoli.png")).getImage();
	private Image carne = new ImageIcon(getClass().getResource("carne.png")).getImage();
	
	Comida(double x, double y){
		super(x, y);
		setTipoComida();
	}
	
	public void dibujar(Entorno e){
		e.dibujarImagen(this.i,getX(),getY(),0);
	}
	
	void mover() {
		setX(getX()-1.5);
	}
	
	void recibirDisparo() {
		this.tipo = "verdura";
		this.i = verdura;
	}
	
	private void setTipoComida(){
		Random r = new Random();
		if(r.nextInt(350)%2 ==0){
			this.tipo = "verdura";
			this.i = this.verdura;
		}else{
			this.tipo = "carne";
			this.i = this.carne;
		}
	}
	
	public void reset(double x,double y) {

		setX(x);
		setY(y);
		setTipoComida();
	}

	public void setImagen(Image i){
		this.i = i;
	}
	public Image getImagen(){
		return this.i;
	}
	public void setTipo(String t){
		this.tipo = t;
	}
	public String getTipo(){
		return this.tipo;
	}
	

}
