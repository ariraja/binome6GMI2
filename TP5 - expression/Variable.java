package tp.expression;

public class Variable extends ExpAbstraite{
    private String nom;

    public Variable(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toStringInfixe() {
        return this.nom;
    }

    @Override
    public double evaluer(Env e) {
        return e.obtenirValeur(this.nom);
    }

}
