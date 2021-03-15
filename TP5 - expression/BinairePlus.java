package tp.expression;

public class BinairePlus extends ExpBinaire {


    public BinairePlus(ExpAbstraite opGauche, ExpAbstraite opDroit) {
        super(opGauche, opDroit);
    }

    public String toStringInfixe(){
        return "+ "+getOpGauche().toStringInfixe()+" "+getOpDroit().toStringInfixe();
    }

    public double evaluer(Env e) {
        double variable1 =e.obtenirValeur(getOpGauche().toStringInfixe());
        double variable2=e.obtenirValeur(getOpDroit().toStringInfixe());
        return variable1+variable2;
    }
}

