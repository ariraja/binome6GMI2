package tp4;
import java.util.LinkedList;

public class Zoo {
    private String nom;
    private LinkedList<Animal> animaux;

    public Zoo(String nom){
        this.nom=nom;
        animaux=new LinkedList<Animal>();//liste chainée contenant les éléments éléments de la classe Animal
    }

    public int getNbAnimaux(){
        return animaux.size();
    }

    public void ajouterAnimal(Animal animal){
        animaux.add(animal);
    }

    public void crier(){//Question 2 : pour chaque élément de la liste chainée, on va appeler la méthode crier() de la classe Animal
        for(Animal a : animaux){
            a.crier();
        }
    }

    public String toString(){
        return "Le zoo"+nom+" contient : "+animaux;
    }

    public double CoutGlobalNourriture(){//Question 9
        double cout_total=0;
        for(Animal a : this.animaux){
            cout_total+=a.CalculerQuantiteNourriture();
        }
        return cout_total;
    }
}


