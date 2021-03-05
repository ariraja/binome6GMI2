package td4;


public class Main {
	
	public static void main(String[] args) {
		/*Point p=new Point(0,0);
		//System.out.println(p.x+""+p.y);
		//il ne voit pas le point x et y
		//pour corriger on va va faire une methode get (getter) dans notre fichier Point.java
		/*p.setX(4);
		p.setY(2);
		int x=p.getX();
		int y=p.getY();
		System.out.println(x+""+y);
		Point point = new Point(4,4);//constructeur classe
		System.out.println(point.toString());
		
		//8.
		
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		System.out.println(p1==p2);//true
		System.out.println(p1==p3);//false
		//On en déduit que p1 et p3 sont <> par rapport à leur adresse alors qu'ils ont les mm coordonnées
		System.out.println(p1.equals(p3));*/
		
		
		//9.b)
		/*Point p1=new Point(1,2);
		System.out.println("Nombre de points créés :"+Point.getCompteur());
		Point p2=p1;
		System.out.println("Nombre de points créés :"+Point.getCompteur());//1
		Point p3=new Point(1,2);
		System.out.println("Nombre de points créés :"+Point.getCompteur());//2
		System.out.println(p1==p2);//true
		System.out.println("Nombre de points créés :"+Point.getCompteur());
		System.out.println(p1==p3);//false
		System.out.println("Nombre de points créés :"+Point.getCompteur());*/
		//On constate que qu'il y a bien 2 points qui ont été créé car p2 n'a pas été créé via le constructeur
		
		//Question 10
		Point p1=new Point(0,0);
		Point p2=new Point(1,4);
		Point p3=new Point(3,2);
		LigneBrisee lb = new LigneBrisee(new Point[3]);
		System.out.println(lb.toString());
		lb.addPoint(p1);
		lb.addPoint(p2);
		lb.addPoint(p3);
		System.out.println(lb.toString());
		lb=lb.deletePoint(p2);
		System.out.println(lb.toString());
		
	}
}
