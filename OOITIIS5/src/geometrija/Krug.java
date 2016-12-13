package geometrija;

import java.awt.Graphics;

public class Krug extends PovrsinskiOblik implements Pomerljiv{
	private Tacka centar;
	private int r;
	
	public Krug(){

	}
	public Krug(Tacka centar, int r){
		this.centar = centar;
		this.r = r;
	}
	public Krug(Tacka centar, int r, String boja){
		this(centar, r);
		setBoja(boja);
	}
	
	public String toString(){
		return "centar " + centar + ", poluprecnik=" + r;
	}
	public void crtajSe(Graphics g){
		g.setColor(pronadjiBoju(getBoja()));
		g.drawOval(centar.getX()-r, centar.getY()-r, 2*r, r*2);
	}
	public void popuni(Graphics g){
		g.setColor(pronadjiBoju(getBojaUnutrasnjosti()));
		g.fillOval(centar.getX()-r+1, centar.getY()-r+1, 2*r-2, r*2-2);
	}
	
	public boolean equals(Object obj){
		if (obj instanceof Krug)
		{
			Krug pomocni=(Krug)obj;
			if(this.centar.equals(pomocni.centar) && this.r==pomocni.r)
				return true;
			else
				return false;
		}
		else
			return false;	
	}
	

	public void pomeriNa(int x, int y){
		centar.setX(x);
		centar.setY(y);
	}
	public void pomeriZa(int x, int y){
		centar.setX(centar.getX()+x);
		centar.setY(centar.getY()+y);
	}
	public double povrsina(){
		return r * r * Math.PI;
	}
	public double obim(){
		return 2 * r * Math.PI;
	}
	public int compareTo(Object o) {
		if(o instanceof Krug){
			Krug pomocni  = (Krug) o;
			return this.r - pomocni.r;
		}
		else
			return 0;
	}
	public Tacka getCentar() {
		return centar;
	}
	public int getR() {
		return r;
	}
	public void setCentar(Tacka centar) {
		this.centar = centar;
	}
	public void setR(int r) {
		this.r = r;
	}
	

}
