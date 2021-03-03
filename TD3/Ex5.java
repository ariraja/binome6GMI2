package td3;

import java.util.Arrays; //importation d'une classe

public class Ex5 {

    public static int[] Convert_StrtoInt(String[] tab) {//méthode de conversion

        int[] res = new int[tab.length];//initialise tableau d'entiers et taille
        
        for(int i =0; i < tab.length; i++) { 
            res[i] = Integer.parseInt(tab[i]);// éléments string convertis en éléments d'entiers
        }
        return res;// renvoie tableau d'entier
    }
    
    public static int SommeTab(int[] tab) {
        int res = 0;
        for (int x : tab)  { 
            res += x; // 
        }
        return res; 
    }
    
    public static void Affiche1_Tab(int[] tab) {
    	for(Integer nb:tab) {//1ère méthode affichage foreach
        	System.out.println(nb);//ou System.out.println(nb.toString());
        }
    }
    
    public static void Affiche2_Tab(int[] tab) {//2ème méthode affichage arrays
        	System.out.println(Arrays.toString(tab));
    }
  
  
    public static void main(String[] args) {
        String [] argu_str = { "1","2","3","4"}; //équivalent à aller dans run configuration et mettre en argument
        int[] argu_int= new int[argu_str.length];
        argu_int=Convert_StrtoInt(argu_str);
        Affiche1_Tab(argu_int);
        Affiche2_Tab(argu_int);
        
        int somme=SommeTab(argu_int);
        System.out.println("la somme du tableau d'entiers vaut "+somme);
    }
}
