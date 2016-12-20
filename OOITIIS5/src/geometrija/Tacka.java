package geometrija;

import java.awt.Graphics;

public class Tacka extends Oblik implements Pomerljiv{
	private int x;
	private int y;


	public Tacka(){

	}
	public Tacka(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Tacka(int x, int y, String boja){
		this(x, y);
		setBoja(boja);
	}	

	public String toString(){
		return "(" + this.x + ","+this.y+")";			
	}

	public boolean equals(Object obj){
		if(obj instanceof Tacka){
			Tacka pomocna=(Tacka)obj;
			if(this.x==pomocna.getX() && this.y==pomocna.getY())
				return true;
			else
				return false;
		}
		else
			return false;
	}

	public void pomeriNa(int novoX, int novoY){
		x = novoX;
		setY(novoY);
	}
	public void pomeriZa(int novoX, int novoY){
		x += novoX;
		y = y + novoY;
	}
	public double udaljenost(Tacka t2){
		double dx = x - t2.getX();
		double dy = y - t2.y;
		double rezultat = Math.sqrt(dx*dx + dy*dy);
		return rezultat;
	}
	public void selektovan(Graphics g){
		g.setColor(pronadjiBoju("plava"));
		g.drawRect(x-3, y-3, 6, 6);
	}
	public void crtajSe(Graphics g) {
		g.setColor(pronadjiBoju(getBoja()));
		g.drawLine(x-2, y, x+2, y);
		g.drawLine(x, y-2, x, y+2);
		if(isSelektovan())
			selektovan(g);
	}
	
	public int compareTo(Object o) {
		Tacka nula = new Tacka(0,0);
		Tacka nova  = (Tacka) o;
		return (int) (this.udaljenost(nula) - nova.udaljenost(nula));
	}

	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int novoY){
		y = novoY;
	}
	




}
