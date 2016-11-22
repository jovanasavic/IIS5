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
		Krug kr1 = new Krug();
		kr1.setCentar(t1);
		System.out.println("X centra kr1: "+kr1.getCentar().getX());
		//postaviti x koordinatu centra kruga
		//na vrednost zbira x koordinata pocetne i krajnje tacke l1
		kr1.getCentar().setX(l1.gettPocetna().getX()+l1.gettKrajnja().getX());	
		System.out.println("X centra kr1: "+kr1.getCentar().getX());
		Kvadrat kv1 = new Kvadrat();
		System.out.println("Povrsina kv1: "+kv1.povrsina());
		Tacka t3 = new Tacka(5, 10);
		t2 = t3;
		Tacka t4 = new Tacka(t3.getX(), t3.getY());
		System.out.println("X t4: "+t4.getX());
		Linija l2 = new Linija(new Tacka(4, 4),new Tacka(7, 7));
		System.out.println("Duzina l2: "+l2.duzina());
		//pomeriti pocetnu tacku l2 ZA po x 3 i po y 5
		l2.gettPocetna().pomeriZa(3, 5);
		System.out.println("X pocetne l2: "+l2.gettPocetna().getX());
		System.out.println("Y pocetne l2: "+l2.gettPocetna().getY());
		Pravougaonik p2 = new Pravougaonik(l2.gettKrajnja(),50,100);
		//System.out.println("Visina p2: "+p2.getVisina());
		//Zbir udaljenosti pocetne tacke linije l1 od tacke gore levo p1 i duzine linije l2:
		System.out.println("Zbir: "+ (l1.gettPocetna().udaljenost(p1.getGoreLevo())+ l2.duzina()));
		//kreirati kvadrat kv2
		//gore levo --> pocetna tacka linije l2, pomerena za po x 15 po y 20
		//stranica = duzina l2 uvecana za vrednost povrsine p1
		Tacka tp = new Tacka(l2.gettPocetna().getX(), l2.gettPocetna().getY());
		tp.pomeriZa(15, 20);
		Kvadrat kv2 = new Kvadrat(tp, (int)(l2.duzina() + p1.povrsina()));
		//System.out.println(t1);
		//(x,y)
		System.out.println(t1);
		//(xPocetne, yPocetne)-->(xKrajnje, yKrajnje)
		System.out.println(l1);
		//"gornji levi ugao=(x,y), stranica=duzinaStranice"
		System.out.println(kv2);
		//"gornji levi ugao=(x,y), sirina=sirina, visina=visina"
		System.out.println(p2);
		//"centar=(x,y)", poluprecnik=poluprecnik"
		System.out.println(kr1);
		Tacka tn=new Tacka();
		System.out.println(tn);
		Kvadrat kn= new Kvadrat(new Tacka(),6);
		System.out.println(kn);
		System.out.println(t1);
		System.out.println(t2);
		t1.setX(t2.getX());
		t1.setY(t2.getY());
		//t1=t2;
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		System.out.println(l1);
		System.out.println(l2);
		l1.settPocetna(l2.gettPocetna());
		l1.settKrajnja(l2.gettKrajnja());
		System.out.println(l1.equals(l2));
		System.out.println("Sredisna tacka l1: "+l1.sredinaLinije());
		
		// postaviti y koordinatu centra pravougaonika p1 na vrednost
		// y koordinate sredine linije dijagonale pravougaonika p1
		//p1.centar().setY(p1.dijagonala().sredinaLinije().getY());
		//kv1.centar().setY(kv1.dijagonala().sredinaLinije().getY());
		
		Pravougaonik p4 = new Pravougaonik(new Tacka(10, 10), 100, 50);
		Kvadrat kv4 = new Kvadrat(new Tacka(10, 10), 50);
		System.out.println("Centar p4: "+p4.centar());
		System.out.println("Centar kv4: "+kv4.centar());
		
		
		
	}

}
