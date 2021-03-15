package tp.expression;

import java.util.HashMap;
import java.util.Map;

public class Env extends ExpAbstraite{
    private Map<String, Double> t_var =new HashMap<>();
    private int taille;

    public Env(Map<String, Double> t_var, int taille) {
        this.t_var = t_var;
        this.taille = taille;
    }

    public Env(int taille) {
        this.taille = taille;
    }

    public void associer(String nom, Double valeur){
        t_var.put(nom, valeur);
    }

    public double obtenirValeur(String nom){
        return t_var.get(nom);
    }

    public double obtenirValeur(BinairePlus Bp) {
        String v1 = Bp.getOpGauche().toStringInfixe();
        return t_var.get(v1);
    }

    @Override
    public String toString() {
        return "Env{" +
                "t_var=" + t_var +
                '}';
    }


}
