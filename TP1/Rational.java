package TP1;

import java.util.Scanner;

public class Rational {
    //2 attributs de Rational
    int num;
    int denom;// différent de 0 faire une vérif ap

    public String toString(){
        return this.num+"/"+this.denom;
    }

    public static Rational createFrac(Scanner sc){// méthode qui crée un rationnel
        Rational frac=new Rational();
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
        this.num=this.num*f2.denom+f2.num*this.num;
        this.denom*=f2.denom;
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

//Question 7
class RationalReduced extends Rational{

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
        Rational res=new Rational();
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
    public static void affiche_Frac(Rational f,Scanner sc){
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

        Rational new_frac=new Rational();// on crée un objet de la classe Rational
        new_frac=createFrac(sc);
        System.out.print(new_frac.num+"/"+new_frac.denom+" = ");
        new_frac=Irreductible_Frac(new_frac);
        affiche_Frac(new_frac,sc);*/
    }
}

class Vector{//Question 8
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

    public void get(int i){//Question 9.b
        this.vecteur[i]=r;
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
        Rational a=Rational.createFrac(sc);
        Vect.set(0,a);
        System.out.println("<-V"+Vect.toString());
        Rational b=Rational.createFrac(sc);
        a.mult(b);
        System.out.println("a ="+a);
        System.out.println("<-V"+Vect.toString());
        //On obtient a=6/6 ainsi <-V( 6/6, 0/1 ) la valeur de la première composante a changée
        //Le seul pb que je vois c'est qu'il faut afficher 6/6 en entier 1
        //il suffit de faire des conditions d'affichage
    }
}
