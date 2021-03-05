package td4;

import java.util.Arrays;


public class LigneBrisee {
	private Point[] l_points;
	private int taille=3;//minimum 2 points au départ 
	
	public LigneBrisee(Point[] points) {// fonction constructeur enfant 
		super();//utile pour appeler méthodes de la classe père Point
		//c'est une superclasse, on appelle la fonction constructeur parent Point
		
		if(points==null) {//si liste vide
			this.l_points=new Point[this.taille];//on crée une liste de taille 3
		}
		else {//sinon on prend la liste en param
			this.l_points=points;
		}
		
	}
	//accesseurs - getter
	public Point[] getPoints() {
		return this.l_points;
	}
	//mutateurs - setter
	public Point[] setPoints(Point[] points) {
		return this.l_points=points;
	}
	//toString
	@Override
    public String toString() {
        return "Liste des points de la ligne = " + Arrays.toString(this.l_points);
    }
	
	public boolean contientPoint(Point pt) {
		for(Point p : this.l_points) {//foreach : on compare notre point en param avec les points de notre liste
			if(pt.equals(p)) {
				return true;
			}
		}
		return false;//c'est notre else 
	}
	
	public void addPoint(Point p) {	
		int nb_places=0;
		int dim=this.l_points.length;
		int i=0;
		if(this.contientPoint(p)==false) {
			while(i<dim) {//boucle infinie
				if(this.l_points[i] == null) {
                    this.l_points[i] = p;
                    break;
				}
				i++;
			}
		}
		else {
			System.out.println("Point déjà dans la liste");
		}
		
		if(nb_places==this.taille) {
			System.out.println("Ligne pleine");
		}
	}
	
	public void nbPoints() {
		int nb_points=0;
		for(Point p :this.l_points) {
			if(p==null) {
				break;
			}
			else {
				nb_points++;
			}
		}
		System.out.println("Il y a "+nb_points+" points dans la ligne brisée");
	}
	
	public void nbMaxPoints() {
		int max=0;
		for(Point p : this.l_points) {
			if(p==null) {
				max++;
			}
		}
		System.out.println("Il reste "+max+" points possibles à mettre dans la liste");
	}
	
	public LigneBrisee deletePoint(Point p) {//on met en paramètre le point à supp
		
		int dim=this.l_points.length;
		int i=0;
		if(this.contientPoint(p)==true) {
			while(i<dim) {
				if((this.l_points[i]).equals(p)) {
					this.l_points[i]=null;
					break;
				}
				i++;
			}
			while(i<dim) {//on décale les éléments de la liste
				if(this.l_points[i]==null) {
					this.l_points[i]=this.l_points[i+1];
				}
				i++;
			}
			LigneBrisee new_ligne = new LigneBrisee(new Point[dim-1]);
			for(int k=0;k<dim-1;k++) {
				if(new_ligne.contientPoint(this.l_points[k])==false) {
					new_ligne.l_points[k]=this.l_points[k];
				}
			}
			return new_ligne;
		}
		else{
			System.out.println("Point non trouvé dans la liste");
			return this;
		}
	}
}
