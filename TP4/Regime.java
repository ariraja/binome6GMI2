package tp4;

public class Regime {
    String nom;
    double prix_au_kg;

    public Regime(String nom, double prix_au_kg) {
        this.nom = nom;
        this.prix_au_kg = prix_au_kg;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix_au_kg() {
        return prix_au_kg;
    }

}
