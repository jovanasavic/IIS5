package geometrija;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Crtez extends JPanel{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame prozor = new JFrame("Crtanje");
		prozor.setSize(800, 600);
		prozor.setVisible(true);
		prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Crtez c = new Crtez();
		prozor.getContentPane().add(c);

	}
	
	public void paint(Graphics g){
		Tacka t1 = new Tacka(400, 300);
		t1.crtajSe(g);
		t1.setBoja("plava");
		t1.crtajSe(g);
		Linija l1 = new Linija(new Tacka(20, 20), new Tacka(120, 30));
		l1.crtajSe(g);
		l1.gettPocetna().setBoja("plava");
		l1.gettKrajnja().setBoja("zelena");
		l1.setBoja("crvena");
		l1.gettPocetna().crtajSe(g);
		l1.gettKrajnja().crtajSe(g);
		l1.crtajSe(g);
		
		Kvadrat kv1 = new Kvadrat(new Tacka(150, 30), 100,"plava");
		Pravougaonik p1 = new Pravougaonik(new Tacka(300,30),100, 50,"crvena");
		Krug k1 = new Krug(new Tacka(550, 150), 100, "pink");
		k1.crtajSe(g);
		kv1.crtajSe(g);
		p1.crtajSe(g);
		k1.popuni(g);
		kv1.popuni(g);
		p1.popuni(g);
		
	}

}
