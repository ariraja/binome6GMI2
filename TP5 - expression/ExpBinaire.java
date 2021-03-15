package tp.expression;

public abstract class ExpBinaire extends ExpAbstraite{
    private ExpAbstraite opGauche;
    private ExpAbstraite opDroit;

    public ExpBinaire(ExpAbstraite opGauche, ExpAbstraite opDroit) {
        this.opGauche = opGauche;
        this.opDroit = opDroit;
    }

    public ExpAbstraite getOpGauche() {
        return opGauche;
    }

    public ExpAbstraite getOpDroit() {
        return opDroit;
    }
}
