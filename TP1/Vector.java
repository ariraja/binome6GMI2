package TP1;

import java.util.Scanner;

public class Vector{//Question 8
    Rational[] vecteur=new Rational[5];

    public static Vector createVector(Vector V,int N, Scanner sc){
        for(int i=0;i<N;i++){
            V.vecteur[i]=Rational.createFrac(sc);
            V.vecteur[i]=RationalReduced.Irreductible_Frac(V.vecteur[i]);
        }
        return V;
    }
    public static void afficheVector(Vector V, int N,Scanner sc){// affiche fraction sans afficher dénominateur==1
        System.out.print("( ");
        for (int i=0;i<N;i++){
            RationalReduced.affiche_Frac(V.vecteur[i],sc);
            if(i<N-1){
                System.out.print(", ");
            }
        }
        System.out.println(" )");
    }

    public String toString(){//Question 8.b
        return "( "+this.vecteur[0]+", "+this.vecteur[1]+" )";
    }

    //Question 9
    public void set(int i, Rational r){//Question 9.a
        this.vecteur[i]=r;
    }
    //9.c
    public Rational get(int i){//Question 9.c
        return this.vecteur[i];
    }

    //Question 10
    //10.a
    public void mult_byRational(Rational r){
        for(int i=0;i<2;i++) {
            this.vecteur[i].mult(r) ;
        };
    }

    public void add(Vector v2){//surcharge correcte
        for(int i=0;i<2;i++){
            this.vecteur[i].add(v2.vecteur[i]);
        }
    }


    public static void main(String[] args){
        Scanner sc;//saisir via la console
        sc = new Scanner(System.in);

        Vector Vect=new Vector();
        int dim=2;//dimension fixée des vecteurs
        Vect=createVector(Vect, dim, sc);
        //afficheVector(Vect,dim,sc);
        System.out.println(Vect.toString());

        //9.b TEST
       /* Rational a=Rational.createFrac(sc);
        Vect.set(0,a);
        System.out.println("<-V"+Vect.toString());
        Rational b=Rational.createFrac(sc);
        a.mult(b);
        System.out.println("a ="+a);
        System.out.println("<-V"+Vect.toString());*/
        //On obtient a=6/6 ainsi <-V( 6/6, 0/1 ) la valeur de la première composante a changée
        //Le seul pb que je vois c'est qu'il faut afficher 6/6 en entier 1
        //il suffit de faire des conditions d'affichage

        //9.d TEST2
       /* System.out.println("<-V"+Vect.toString());
        Rational a=Vect.get(0);
        Rational b=Rational.createFrac(sc);//on prend b=1/3
        a.mult(b);
        System.out.println("a ="+a);
        System.out.println("<-V"+Vect.toString());*/
        //On obtient a =1/6 et <-V( 1/6, 1/2 ) aucun pb R.A.S


        //10
        //Rational r=new Rational(1,3);
        //Vect.mult_byRational(r);

        Vector V2=new Vector();
        V2=createVector(V2,2,sc);
        System.out.println(Vect.toString()+"+"+V2.toString());
        Vect.add(V2);
        System.out.println(Vect.toString());

    }
}
