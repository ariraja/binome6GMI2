package tp4;

public class Vache extends Animal {
    private String type_lait;
    public Vache(String nom, int poids, Regime r, String lait) {
        super(nom,poids,r);
        this.type_lait=lait;
    }

    public Vache(String nom, int poids, String lait) {
        super(nom,poids);
        this.type_lait=lait;
    }

    public void crier(){
        System.out.println(this.getNom()+" crie... Cette vache de "+this.getPoids()+"kg fait du lait "+this.type_lait);
    }

    public String toString() {
        return "L'animal"+this.getNom()+" pèse "+this.getPoids();
    }

    public double CalculerQuantiteNourriture() {
        double quantite=getPoids()*0.100;
        return quantite;
    }
}
