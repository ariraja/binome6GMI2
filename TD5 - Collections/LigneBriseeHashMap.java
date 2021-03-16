package td5.ligneBrisee;

import java.util.HashMap;
import java.util.Map;


public class LigneBriseeHashMap {
    HashMap<Integer,Point> l;
    public static int taille = 2;//au moins 2 points

    public LigneBriseeHashMap(HashMap<Integer, Point> l) {
        this.l = l;
    }

    public HashMap<Integer, Point> getL() {
        return l;
    }

    public void setL(HashMap<Integer, Point> l) {
        this.l = l;
    }

    public static int getTaille() {
        return taille;
    }

    public static void setTaille(int taille) {
        LigneBriseeHashMap.taille = taille;
    }

    @Override
    public String toString() {
        return "LigneBriseeMap{" +
                "l=" + this.l +
                '}';
    }

    public boolean contientPoint(Point p){
        boolean b=false;
        for(Map.Entry<Integer,Point> element: this.l.entrySet()){
            if (element.getValue()==p){
                b=true;
                break;
            }
        }
        return b;
    }

    public void addPoint(Point p,int index){
        if(!contientPoint(p)){
            this.l.put(index,p);
        }
    }

    public void nbPoints(){
        System.out.println("taille de"+this.l+" = "+this.l.size());
    }

    public void deletePoint(Point p)
    {
        this.l.remove(p);

    }
}
