package geometrija;

import java.awt.Graphics;

public class Linija extends Oblik{
	private Tacka tPocetna;
	private Tacka tKrajnja;
	
	
	public Linija(){
		
	}
	public Linija(Tacka tPocetna, Tacka tKrajnja){
		this.tPocetna = tPocetna;
		this.tKrajnja = tKrajnja;
	}
	public Linija(Tacka tPocetna, Tacka tKrajnja,String boja){
		super(boja);
		this.tPocetna = tPocetna;
		this.tKrajnja = tKrajnja;
		
	}
	public Tacka sredinaLinije(){
		int sredinaX = (tPocetna.getX() + tKrajnja.getX()) / 2;
		int sredinaY = (tPocetna.getY() + tKrajnja.getY()) / 2;
		return new Tacka(sredinaX, sredinaY);
	}
	public String toString(){
		return "("+tPocetna.getX()+"," +tPocetna.getY()+") --> (" + tKrajnja.getX()+","+ tKrajnja.getY() + ")";
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Linija){
			Linija pomocna=(Linija)obj;
			if(this.tPocetna.equals(pomocna.tPocetna) && this.tKrajnja.equals(pomocna.tKrajnja))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	
	public double duzina(){
		return tPocetna.udaljenost(tKrajnja);
	}
	
	public void pomeriZa(int x, int y){
		tPocetna.setX(tPocetna.getX()+x);
		tPocetna.setY(tPocetna.getY()+y);
		tKrajnja.setX(tKrajnja.getX()+x);
		tKrajnja.setY(tKrajnja.getY()+y);
	}
	public void crtajSe(Graphics g){
		g.setColor(pronadjiBoju(getBoja()));
		g.drawLine(tPocetna.getX(), tPocetna.getY(), tKrajnja.getX(), tKrajnja.getY());
	}
	public Tacka gettPocetna(){
		return tPocetna;
	}
	public Tacka gettKrajnja(){
		return tKrajnja;
	}
	public void settPocetna(Tacka tPocetna){
		this.tPocetna = tPocetna;
	}
	public void settKrajnja(Tacka tKrajnja){
		this.tKrajnja = tKrajnja;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
