package tp.expression;

public abstract class ExpAbstraite {
    public String toStringInfixe() {
        return "Je suis une expression et me voilà en notation infixée : ";
    }

    public double evaluer(Env e){
        return 0.0;
    }
}
