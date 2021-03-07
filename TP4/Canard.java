package tp4;

public class Canard extends Animal {
    String type_plume;
    public Canard(String nom, int poids, Regime r ,String plume) {
        super(nom,poids,r);
        this.type_plume=plume;
    }
    public Canard(String nom, int poids,String plume) {
        super(nom,poids);
        this.type_plume=plume;
    }

    public void crier(){
        System.out.println(this.getNom()+" crie... Ce canard de "+this.getPoids()+"kg possède des plumes "+this.type_plume);
    }

    public String toString() {
        return "L'animal"+this.getNom()+" pèse "+this.getPoids();
    }

    public double CalculerQuantiteNourriture() {//par exemple pour canard
        double quantite=getPoids();
        return quantite;
    }
}