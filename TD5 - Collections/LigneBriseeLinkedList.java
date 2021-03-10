package td5.ligneBrisee;
import java.util.LinkedList;

public class LigneBriseeLinkedList {
    LinkedList<Point> list;
    public static int taille = 2;//au moins 2 points

    public LigneBriseeLinkedList(LinkedList<Point> list) {
        this.list = list;
    }

    public LinkedList<Point> getList() {
        return list;
    }

    public void setList(LinkedList<Point> list) {
        this.list = list;
    }

    public static int getTaille() {
        return taille;
    }

    public static void setTaille(int taille) {
        LigneBriseeLinkedList.taille = taille;
    }

    @Override
    public String toString() {
        return "LigneBriseeLinkedList{" +
                "list=" + list +
                '}';
    }

    public boolean contientPoint(Point p){
        return this.list.contains(p);
    }

    public void addPoint(Point p){
        this.list.add(p);
    }
    public void nbPoints(){
        int n=this.list.size();
        System.out.println("Cette ligne brisée contient "+n+" points");
    }

    public void deletePoint(Point p){
        if(contientPoint(p)){
            this.list.remove(p);
        }
        else{
            System.out.println("Ce point n'est pas dans la ligne brisée");
        }
    }
}
