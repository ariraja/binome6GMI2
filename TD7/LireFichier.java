package td7;

import java.io.BufferedReader;
import java.io.FileReader;

public class LireFichier {
    public static void main(String args[]){
        EcritFichier();
        LireFichier();
    }
    public static void LireFichier(){
        try {
            FileReader fr = new FileReader("h:\\Documents\\Cours ING1 GM\\Semestre 2\\APOO\\Java\\TD7\\src\\td7\\fichier.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        }
        catch (Exception e){
                System.out.println("Erreur"+e);
        }

    }
}
