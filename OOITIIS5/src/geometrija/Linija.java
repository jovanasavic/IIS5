package geometrija;

public class Linija {
	private Tacka tPocetna;
	private Tacka tKrajnja;
	private String boja;
	
	public Linija(){
		
	}
	public Linija(Tacka tPocetna, Tacka tKrajnja){
		this.tPocetna = tPocetna;
		this.tKrajnja = tKrajnja;
	}
	public Linija(Tacka tPocetna, Tacka tKrajnja,String boja){
		this(tPocetna, tKrajnja);
		this.boja = boja;
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
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}

}
