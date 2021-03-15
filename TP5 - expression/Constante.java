package tp.expression;

public class Constante extends ExpAbstraite {
    private double valeur;

    public Constante(double valeur) {
        this.valeur = valeur;
    }

    public double getValeur() {
        return valeur;
    }

    @Override
    public String toStringInfixe() {
       return String.valueOf(valeur);
    }

    @Override
    public double evaluer(Env e) {
        return this.valeur;
    }
}
