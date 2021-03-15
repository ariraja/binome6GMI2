package tp.expression;

public class BinaireMult extends ExpBinaire {


    public BinaireMult(ExpAbstraite opGauche, ExpAbstraite opDroit) {
        super(opGauche, opDroit);
    }

    public String toStringInfixe(){
        return "* "+getOpGauche().toStringInfixe()+" "+getOpDroit().toStringInfixe();
    }

    public double evaluer(Env e) {
        if(getOpGauche() instanceof BinairePlus) {//si l'opérande de gauche est une addition
            double variable = getOpGauche().evaluer(e);
            double constante = Double.parseDouble(getOpDroit().toStringInfixe());
            return variable * constante;
        }
        else if(getOpDroit() instanceof UnaireSin){//si l'opérande de droite est un sinus
            double constante = Double.parseDouble(getOpGauche().toStringInfixe());
            double sin = getOpDroit().evaluer(e);
            return constante*sin;
        }
        else {
            double variable = e.obtenirValeur(getOpGauche().toStringInfixe());
            double constante = Double.parseDouble(getOpDroit().toStringInfixe());
            return variable * constante;
        }
    }
}
