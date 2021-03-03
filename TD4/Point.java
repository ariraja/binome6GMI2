package td4;

import java.lang.Object;

public class Point {
	private int x;
	private int y;
	private static int compteur=0;
	
	//accesseurs - getter
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	//mutateurs - setter
	public int setX(int nb) {
		return x=nb;
	}
	public int setY(int nb) {
		return y=nb;
	}
	
	//Constructeur
	Point(int x, int y){
		this.x=x;
		this.y=y;
		compteur++;
	}
	@Override
	//@Override : définir une méthode qui est héritée de la classe parente, cad dans le cas de l'héritage
	//Ici c'est utile car Main hérite de Point
	public String toString() {
		return "Point ("+x+","+y+")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Point))
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	//on ne crée pas de mutateurs car on ne va pas choisir cb de points on a créé.
	public static int getCompteur() {
		return compteur;
	}
	@Override
	protected void finalize() throws Throwable {
		compteur --; 
	} 
	
	/*public static void main(String[] args) {
		Point p=new Point();
		System.out.println(p.x+""+p.y);
		//ca affiche 00
	}*/
}
