package tp4;

public class Tigre extends Animal {
    private float longueur_griffe;
    public Tigre(String nom, int poids, Regime r, float griffe) {
        super(nom,poids,r);
        this.longueur_griffe=griffe;
    }
    public Tigre(String nom, int poids, float griffe) {
        super(nom,poids);
        this.longueur_griffe=griffe;
    }

    public void crier(){
        System.out.println(this.getNom()+" crie... Ce tigre de "+this.getPoids()+" a des grandes griffes de "+this.longueur_griffe);
    }

    public String toString() {
        return "L'animal "+this.getNom()+" pèse "+this.getPoids();
    }

    public double CalculerQuantiteNourriture() {
        double quantite=getPoids()*0.4;
        return quantite;
    }
}