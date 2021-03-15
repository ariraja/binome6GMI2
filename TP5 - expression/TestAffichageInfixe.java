package tp.expression;

public class TestAffichageInfixe {

    public static void main(String[] args){

        //test expression * y 3
        ExpAbstraite exp = new BinaireMult(new Variable("y"), new Constante(3));
        System.out.println(exp.toStringInfixe());

        //test expression * + x x 5
        exp=new BinaireMult(new BinairePlus(new Variable("x"),new Variable("x")),new Constante(5));
        System.out.println(exp.toStringInfixe());

        //test * -3.5 sin + a b
        exp=new BinaireMult(new Constante(-3.5),new UnaireSin(new BinairePlus(new Variable("a"),new Variable("b"))));
        System.out.println(exp.toStringInfixe());

        //Question 4 : on pourrait rajouter les claseses filles Variable et Constante en paramètre dans les classes abstraites intermédiaires
        //la visibilité abstract permet de définir des méthodes dans les classes filles sans écrire de nouvelles méthodes
        //Ici les classes filles de ExpAbstraite hérite et utilise la méthode toStringInfixe()
        //On ne peut pas instancier un objet ExpAstraite, du coup nous instancions bien les objets Constante et Variable
    }

}
