package tp4;

public class Animal {
    private String nom;
    private int poids;
    private Regime r;

    public Animal(String nom, int poids, Regime r) {//constructeur
        this.nom = nom;
        this.poids = poids;
        this.r=r;
    }
    public Animal(String nom, int poids) {//surcharge pour ne pas rendre regime obligatoire
        this.nom = nom;
        this.poids = poids;
    }

    //accesseurs
    public String getNom() {
        return nom;
    }
    public int getPoids() {
        return poids;
    }
    public Regime getR() { return r; }

    public void crier(){
        System.out.println(this.nom+" crie...");
    }

    @Override
    public String toString() {
        return "L'animal"+this.nom+" pèse "+this.poids;
    }

    //Question 8
    public double CalculerQuantiteNourriture() {//par exemple pour canard
       double quantite=getPoids();
       return quantite;
    }


}
