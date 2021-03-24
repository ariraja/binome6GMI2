package td7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class EcritFichier {
    public static void EcrireFichier(){
        try {
            FileWriter fw = new FileWriter("h:\\Documents\\Cours ING1 GM\\Semestre 2\\APOO\\Java\\TD7\\src\\td7\\fichier.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("C'est un fichier");
            bw.newLine();
            bw.write("sympathique");
            bw.close();
        }
        catch (Exception e){
            System.out.println("Erreur"+e);
        }
    }
}
