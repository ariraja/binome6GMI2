package tp.expression;
import java.lang.Math;

public class UnaireSin extends ExpUnaire {

    public UnaireSin(ExpAbstraite operande) {
        super(operande);
    }

    public String toStringInfixe(){
        String s="sin(";
        s+=getOperande().toStringInfixe();
        s+= ")";
        return s;
    }

    public double evaluer(Env e) {
            return Math.sin(getOperande().evaluer(e));
    }

}
