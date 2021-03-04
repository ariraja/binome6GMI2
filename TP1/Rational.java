package TP1;

import java.util.Scanner;

public class Rational {
    //2 attributs de Rational
    int num;
    int denom;// différent de 0 faire une vérif ap

    public Rational(int n, int d){
        this.num=n;
        this.denom=d;
    }

    public String toString(){
        return this.num+"/"+this.denom;
    }

    public static Rational createFrac(Scanner sc){// méthode qui crée un rationnel
        Rational frac=new Rational(0,0);
        System.out.print("Saisir numérateur : ");
        frac.num=sc.nextInt();
        System.out.print("Saisir dénominateur : ");
        frac.denom=sc.nextInt();
        while(frac.denom==0){//Question 4 : vérification denom non nul
            System.out.print("Vous avez rentré un dénominateur nul, Veuillez ressaisir : ");
            frac.denom=sc.nextInt();
        }
        return frac;
    }

    public void mult(Rational f2){
        this.num*=f2.num;
        this.denom*=f2.denom;
    }
    public void add(Rational f2){
        if (this.denom==f2.denom){
            this.num+=f2.num;
        }
        else {
            this.num = this.num * f2.denom + f2.num * this.num;
            this.denom *= f2.denom;
        }
    }

    public static void main(String[] args){//compilation javac
        //Programme Test création fraction

      /*  Scanner sc;// utile pour saisir des nb via la console
        sc = new Scanner(System.in);

        Rational new_frac=new Rational();// on crée un objet de la classe Rational
        new_frac=createFrac(sc);
        //System.out.println("La fraction s'écrit : "+new_frac.num+"/"+new_frac.denom);

        //2.b
        //String test=new_frac.num+"/"+new_frac.denom;
        System.out.println(new_frac.toString());

        //Question 3 : C'est possible d'afficher oui mais mathématiquement c'est faux car un dénominateur ne peut être nul


        //Question 5
        Rational new_frac2=new Rational();
        new_frac2=createFrac(sc);

        System.out.print(new_frac.num+"/"+new_frac.denom+" * "+new_frac2.num+"/"+new_frac2.denom+" = ");
        new_frac.mult(new_frac2);
        System.out.println(+new_frac.num+"/"+new_frac.denom);

        //Question 6
        System.out.print(new_frac.num+"/"+new_frac.denom+" + "+new_frac2.num+"/"+new_frac2.denom+" = ");
        new_frac.add(new_frac2);
        System.out.println(+new_frac.num+"/"+new_frac.denom);     */
    }
}

