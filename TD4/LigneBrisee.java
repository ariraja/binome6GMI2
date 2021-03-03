package td4;

import java.util.Arrays;


public class LigneBrisee {
	private Point[] l_points;
	private static int taille=3;//minimum 2 points au départ 
	
	public LigneBrisee(Point[] points) {// fonction constructeur enfant 
		super();//utile pour appeler méthodes de la classe père Point
		//c'est une superclasse, on appelle la fonction constructeur parent Point
		
		if(points==null) {//si liste vide
			this.l_points=new Point[taille];//on crée une liste de taille 3
		}
		else {//sinon on prend la liste en param
			this.l_points=points;
		}
		
	}
	//accesseurs - getter
	public Point[] getPoints() {
		return l_points;
	}
	//mutateurs - setter
	public Point[] setPoints(Point[] points) {
		return this.l_points=points;
	}
	//toString
	@Override
    public String toString() {
        return "Liste des points de la ligne = " + Arrays.toString(l_points) + "";
    }
	
	public boolean contientPoint(Point pt) {
		for(Point p : l_points) {//foreach : on compare notre point en param avec les points de notre liste
			if(pt.equals(p)) {
				return true;
			}
		}
		return false;//c'est notre else 
	}
	
	public void addPoint(Point p) {	
		for(Point pnt : l_points){
			if(contientPoint(p)==false) {//ce point n'est pas dans la liste
				if(pnt==null) {//qd on trouve une place libre
					pnt=p;//on ajoute le point
					break;
				}
			}
			else {
				System.out.println("Point déjà dans la liste");
				break;
			}
		}
	}
	
	public void nbPoints() {
		int nb_points=0;
		for(Point p :l_points) {
			if(p.equals(null)) {
				break;
			}
			else {
				nb_points++;
			}
		}
		System.out.println("Il y a "+nb_points+" points dans ligne brisée");
	}
	
	public void nbMaxPoints() {
		int max=0;
		for(Point p : l_points) {
			if(p==null) {
				max++;
			}
		}
		System.out.println("Il reste "+max+" points possibles à mettre dans la liste");
	}
	
	public void deletePoint(Point p) {//on met en paramètre le point à supp
		int pos=0;//position de l'élément à supp
		for(Point pnt:l_points) {//on supp l'élément
			if(pnt.equals(p)) {
				pnt=null;
				break;
			}
			else {
				pos++;
			}
		}
		if(pos==taille) {
			System.out.println("Point non trouvé dans la liste");
		}
		else {
			Point[] tmp_l = new Point[taille-1];//liste vide de taille n-1
			int j=0;//index pour la liste
			for(int i=0;i<taille-1;i++) {
				if(l_points[i].equals(null)) {//si on trouve le point qu'on a supp
					j=i+1;//on décale l'indice
				}
				tmp_l[i]=l_points[j];
			}
		}
	}
	
	public static void main(String[] args) {
		Point p1=new Point(0,0);
		
		Point[] liste1= {p1};
		
		LigneBrisee test=new LigneBrisee(null);//création
		test.setPoints(liste1);
		System.out.println(test.toString());
		
		Point p2=new Point(2,3);
		test.addPoint(p2);//ajout marche pas?? Ou problème d'affichage??
		//TODO Voir pq ça marche pas
		System.out.println(test.toString());
		
		test.deletePoint(p1);//suppression marche pas??Ou problème d'affichage??
		//TODO Voir pq ça marche pas
		System.out.println(test.toString());
	} 

}
