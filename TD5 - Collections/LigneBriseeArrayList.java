package td5.ligneBrisee;

import java.util.ArrayList;

public class LigneBriseeArrayList {
    //1.
    ArrayList<Point> list;
    public static int taille = 2;//au moins 2 points


    public LigneBriseeArrayList(ArrayList<Point> al, int n) {
        super();
        this.list = al;
        this.taille=n;
    }

    public ArrayList<Point> getList() {
        return list;
    }

    public void setList(ArrayList<Point> list) {
        this.list = list;
    }

    public static int getTaille() {
        return taille;
    }

    public static void setTaille(int taille) {
        LigneBriseeArrayList.taille = taille;
    }

    @Override
    public String toString() {
        return "LigneBriseeArrayList{" +
                "list=" + list +
                '}';
    }

    //2.
    public boolean contientPoint(Point p){
        if(this.list.contains(p)) {
            return true;
        }
        else{
            return false;
        }
    }

    //3.
    public void addPoint(Point p){
        if(!this.contientPoint(p)){
            this.list.add(p);
        }
    }

    //4.
    public void nbPoints(){
        /*int i=0;
        for(Point p : this.list){
            i++;
        }*/
        int i=this.list.size();
        System.out.println("Nous avons "+i+" points dans la ligne brisée");
    }

    //5.
    public void deletePoint(Point p){
        if(this.contientPoint(p)){
            this.list.remove(p);
        }
        else{
            System.out.println("Ce point n'est pas dans la ligne brisée");
        }
    }


}
