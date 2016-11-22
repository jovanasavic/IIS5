package geometrija;

public class Tacka extends Oblik{
	private int x;
	private int y;

	
	public Tacka(){
		
	}
	public Tacka(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Tacka(int x, int y, String boja){
		this(x, y);
		setBoja(boja);
	}	
	
	public String toString(){
		return "(" + this.x + ","+this.y+")";			
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Tacka){
			Tacka pomocna=(Tacka)obj;
			if(this.x==pomocna.getX() && this.y==pomocna.getY())
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	public void pomeriNa(int novoX, int novoY){
		x = novoX;
		setY(novoY);
	}
	public void pomeriZa(int novoX, int novoY){
		x += novoX;
		y = y + novoY;
	}
	public double udaljenost(Tacka t2){
		double dx = x - t2.getX();
		double dy = y - t2.y;
		double rezultat = Math.sqrt(dx*dx + dy*dy);
		return rezultat;
	}

	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int novoY){
		y = novoY;
	}
	

}
