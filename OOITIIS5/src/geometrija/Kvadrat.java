package geometrija;

public class Kvadrat {
	private Tacka goreLevo;
	private int duzinaStranice;
	private String boja;
	
	public Kvadrat(){

	}
	public Kvadrat(Tacka goreLevo, int duzinaStranice){
		this.goreLevo = goreLevo;
		this.duzinaStranice = duzinaStranice;
	}
	public Kvadrat(Tacka goreLevo, int duzinaStranice, String boja){
		this(goreLevo, duzinaStranice);
		this.boja = boja;
	}
	public void pomeriNa(int x, int y){
		goreLevo.setX(x);
		goreLevo.setY(y);
	}

	public void pomeriZa(int x, int y){
		goreLevo.setX(goreLevo.getX()+x);
		goreLevo.setY(goreLevo.getY()+y);
	}

	public int obim(){
		return 4 * duzinaStranice;
	}
	public int povrsina(){
		return duzinaStranice * duzinaStranice;
	}

	public Tacka getGoreLevo() {
		return goreLevo;
	}
	public int getDuzinaStranica() {
		return duzinaStranice;
	}
	public void setGoreLevo(Tacka goreLevo) {
		this.goreLevo = goreLevo;
	}
	public void setDuzinaStranica(int duzinaStranica) {
		this.duzinaStranice = duzinaStranica;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}


}