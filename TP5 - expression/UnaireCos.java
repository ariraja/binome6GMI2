package tp.expression;

public class UnaireCos extends ExpUnaire{
    public UnaireCos(ExpAbstraite operande) {
        super(operande);
    }
    public String toStringInfixe(){
        String s = null;
        s+="cos(";
        s+=getOperande().toStringInfixe();
        s+= ")";
        return s;
    }
}
