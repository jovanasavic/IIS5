package geometrija;

public class Pravougaonik {
	private Tacka goreLevo;
	private int visina;
	private int sirina;
	private String boja;

	public Pravougaonik(){

	}
	public Pravougaonik(Tacka goreLevo, int visina, int sirina){
		this.goreLevo = goreLevo;
		this.visina = visina;
		this.sirina = sirina;
	}
	public Pravougaonik(Tacka goreLevo, int visina, int sirina, String boja){
		this(goreLevo, visina, sirina);
		this.boja = boja;
	}

	public int obim(){
		return 2 * (sirina + visina);
	}
	public int povrsina(){
		return sirina * visina;
	}
	public void pomeriNa(int x, int y){
		goreLevo.setX(x);
		goreLevo.setY(y);
	}
	public void pomeriZa(int x, int y){
		goreLevo.setX(goreLevo.getX()+x);
		goreLevo.setY(goreLevo.getY()+y);
	}

	public Tacka getGoreLevo() {
		return goreLevo;
	}
	public int getVisina() {
		return visina;
	}
	public int getSirina() {
		return sirina;
	}
	public void setGoreLevo(Tacka goreLevo) {
		this.goreLevo = goreLevo;
	}
	public void setVisina(int visina) {
		this.visina = visina;
	}
	public void setSirina(int sirina) {
		this.sirina = sirina;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}


}
