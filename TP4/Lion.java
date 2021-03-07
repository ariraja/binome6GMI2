package tp4;

public class Lion extends Animal {
	private float bruit_rugissement;
	public Lion(String nom, int poids,Regime r, float bruit) {
		super(nom,poids,r);
		this.bruit_rugissement=bruit;
	}
	public Lion(String nom, int poids,float bruit) {
		super(nom,poids);
		this.bruit_rugissement=bruit;
	}
	
	public void crier(){
        System.out.println(this.getNom()+" crie... Ce lion d'un puissant rugissement à plus de 70 décibels!");
    }
	
	public String toString() {
        return "L'animal "+this.getNom()+" pèse "+this.getPoids()+"kg et mange pour "+this.getR().prix_au_kg+"€ de "+this.getR().nom;
    }
	public double CalculerQuantiteNourriture() {
		double quantite=getPoids()*0.5;
		return quantite;
	}
}
