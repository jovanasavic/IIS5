package geometrija;

public class Tacka {
	private int x;
	private int y;
	
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
