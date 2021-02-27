package TP1;

import java.util.Scanner;

public class Rational {
    //2 attributs de Rational
    int num;
    int denom;// différent de 0 faire une vérif ap

    public String toString(){
        return this.num+"/"+this.denom;
    }

    public static void main(String[] args){//compilation javac
        //Programme Test création fraction

        Scanner sc;// utile pour saisir des nb via la console
        sc = new Scanner(System.in);

        Rational new_frac=new Rational();// on crée un objet de la classe Rational
        System.out.print("Saisir numérateur : ");
        new_frac.num=sc.nextInt();
        System.out.print("Saisir dénominateur : ");
        new_frac.denom=sc.nextInt();
        while(new_frac.denom==0){//vérification denom non nul
            System.out.print("Vous avez rentré un dénominateur nul, Veuillez ressaisir : ");
            new_frac.denom=sc.nextInt();
        }
        System.out.println("La fraction s'écrit : "+new_frac.num+"/"+new_frac.denom);

        //2.b
        String test=new_frac.num+"/"+new_frac.denom;
        System.out.println(test.toString());

        //Question 3 : C'est possible d'afficher oui mais mathématiquement c'est fauc car un dénominateur ne peut être nul



    }

}
