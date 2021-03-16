package td5.ligneBrisee;
import java.util.*;

public class LigneBriseeTreeSet {
    TreeSet<Point> t;

    public LigneBriseeTreeSet(TreeSet<Point> tp) {
        super();
        this.t = tp;
    }
    public TreeSet<Point> getArbre() {
        return t;
    }
    public void setArbre(TreeSet<Point> tp) {
        this.t = tp;
    }

    @Override
    public String toString() {
        return "ligneBriseeTreeSet [arbre=" + t + "]";
    }

    public boolean contientPoint(Point p) {
        if(this.t.contains(p)) {
            System.out.println("Le point "+p.toString()+"appartient à l'arbre");
            return true;
        }
        else {
            System.out.println("Le point "+p.toString()+"n'appartient pas à l'arbre");
            return false;
        }

    }

    public void addPoint(Point p) {
        this.t.add(p);
    }

    public void nbPoints() {
        System.out.println("taille de"+this.t+" = "+this.t.size());
    }

    public void deletePoint(Point p) {
        if(this.t.contains(p)) {
            this.t.remove(p);
        }
        else {
            System.out.println("Impossible de supprimer le point, il nest pas dans l' arbre");
        }
    }

}
