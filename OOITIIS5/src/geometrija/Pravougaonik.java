package geometrija;

import java.awt.Graphics;

public class Pravougaonik extends Kvadrat{
	private int sirina;
	
	public Pravougaonik(){

	}
	public Pravougaonik(Tacka goreLevo, int visina, int sirina){
		super(goreLevo, visina);
		this.sirina = sirina;
	}
	public Pravougaonik(Tacka goreLevo, int visina, int sirina, String boja){
		this(goreLevo, visina, sirina);
		setBoja(boja);
	}
	public Linija dijagonala(){
		return new Linija(goreLevo, new Tacka(goreLevo.getX() + sirina,goreLevo.getY() + getDuzinaStranice()));
	}
	public Tacka centar(){
		return dijagonala().sredinaLinije();
	}
	public boolean equals(Object obj){
		if(obj instanceof Pravougaonik){
			Pravougaonik pomocni=(Pravougaonik) obj;
			if(this.goreLevo.equals(pomocni.goreLevo) && this.sirina==pomocni.sirina && this.getDuzinaStranice()==pomocni.getDuzinaStranice())
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	public String toString(){
		return "Gornji levi ugao="+goreLevo+",sirina="+sirina+",getDuzinaStranica()="+getDuzinaStranice();
	}

	public int obim(){
		return 2 * (sirina + getDuzinaStranice());
	}
	public int povrsina(){
		return sirina * getDuzinaStranice();
	}
	public void crtajSe(Graphics g){
		g.setColor(pronadjiBoju(getBoja()));
		g.drawRect(goreLevo.getX(), goreLevo.getY(), duzinaStranice, sirina);
	}
	public void popuni(Graphics g){
		g.setColor(pronadjiBoju(getBojaUnutrasnjosti()));
		g.fillRect(goreLevo.getX()+1, goreLevo.getY()+1, duzinaStranice-1, sirina-1);
	}
		
	public int getSirina() {
		return sirina;
	}
	
	
	public void setSirina(int sirina) {
		this.sirina = sirina;
	}
	


}
