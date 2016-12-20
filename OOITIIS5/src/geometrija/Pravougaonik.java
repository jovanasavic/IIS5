package geometrija;

import java.awt.Color;
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
		return new Linija(goreLevo, new Tacka(goreLevo.getX() + getDuzinaStranice(),goreLevo.getY() + sirina));
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
	public void selektovan(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		new Linija(getGoreLevo(), new Tacka(getGoreLevo().getX()+duzinaStranice, getGoreLevo().getY())).selektovan(g);
		new Linija(getGoreLevo(), new Tacka(getGoreLevo().getX(), getGoreLevo().getY()+sirina)).selektovan(g);
		new Linija(new Tacka(getGoreLevo().getX()+duzinaStranice, getGoreLevo().getY()), dijagonala().gettKrajnja()).selektovan(g);
		new Linija(new Tacka(getGoreLevo().getX(), getGoreLevo().getY()+sirina), dijagonala().gettKrajnja()).selektovan(g);
	}
	public void crtajSe(Graphics g){
		g.setColor(pronadjiBoju(getBoja()));
		g.drawRect(goreLevo.getX(), goreLevo.getY(), duzinaStranice, sirina);
		if(isSelektovan())
			selektovan(g);
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
