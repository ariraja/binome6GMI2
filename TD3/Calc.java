package td3;

import java.util.Scanner;

public class Calc
{
	public static void main(String[] args)
	{
		Scanner sc;
		 sc = new Scanner(System.in);
        	System.out.print("Saisir un entier : ");
        	int value1 = sc.nextInt();  // saisie d'un premier entier avec le Scanner
        	System.out.print("Saisir un deuxième entier : ");
        	int value2= sc.nextInt();  // saisie d'un deuxième entier avec le Scanner

        	System.out.println("La somme = " + (value1+value2));
        	
        	System.out.println("La différence = " + (value1-value2));
        	System.out.println("Le produit = " + (value1*value2));
        	System.out.println("Le quotient = " + (value1/value2));
        	System.out.println("Le reste = " + (value1%value2));

        	sc.close() ; // fermeture de l’entrée
	}
}
