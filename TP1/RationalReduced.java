package TP1;

import java.util.Scanner;

//Question 7
public class RationalReduced{

    //PGCD
    private static int PGCD(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return PGCD(b,a%b);
        }
    }

    //Irréductible
    public static Rational Irreductible_Frac(Rational f){
        Rational res=new Rational(0,0);
        int pgcd=PGCD(f.num,f.denom);
        if(pgcd==1){//la fraction est de base irréductible
            return f;
        }
        else {//on réduit la fraction
            res.num=f.num/pgcd;
            res.denom=f.denom/pgcd;
            return res;
        }
    }
    public static void affiche_Frac(Rational f, Scanner sc){
        if(f.denom==1){
            System.out.print(+f.num);
        }
        else {
            System.out.print(+f.num + "/" +f.denom);
        }
    }
    public static void main(String[] args){
        /*Scanner sc;// utile pour saisir des nb via la console
        sc = new Scanner(System.in);

        Rational new_frac=new Rational(0,0);// on crée un objet de la classe Rational
        new_frac=Rational.createFrac(sc);
        System.out.print(new_frac.num+"/"+new_frac.denom+" = ");
        new_frac=Irreductible_Frac(new_frac);
        affiche_Frac(new_frac,sc);*/
    }
}
