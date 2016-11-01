package geometrija;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tacka t1 = new Tacka();
		System.out.println(t1.getX());
		t1.setY(10);
		System.out.println("Y="+t1.getY());
		Linija l1 = new Linija();
		Tacka t2 = new Tacka();
		l1.settPocetna(t1);
		l1.settKrajnja(t2);
		System.out.println("X koordinata pocetne tacke l1: "+l1.gettPocetna().getX());
		l1.gettPocetna().setX(15);
		//postaviti vrednost y koordinate pocetne tacke l1 na vrednost
		// x koordinate krajnje tacke linije l1
		l1.gettPocetna().setY(l1.gettKrajnja().getX());
		System.out.println("Y pocetne tacke l1: "+l1.gettPocetna().getY());
		System.out.println(t1.getX());
		System.out.println("Udaljenost t1 do t2: "+t1.udaljenost(t2));
		System.out.println("Duzina l1: "+l1.duzina());
		//postaviti x koordinatu krajnje tacke l1 na vrednost duzine linije l1 umanjene za 
		//vrednost zbira x i y koordinate pocetne tacke linije.
		t2.setY(50);
		l1.gettKrajnja().setX((int) l1.duzina()-(l1.gettPocetna().getX()+l1.gettPocetna().getY()));
		System.out.println(l1.gettKrajnja().getX());;
		Pravougaonik p1 = new Pravougaonik();
		p1.setGoreLevo(l1.gettKrajnja());
		System.out.println("X gore levo p1: "+p1.getGoreLevo().getX());
		
		
	}

}
