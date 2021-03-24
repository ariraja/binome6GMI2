package td7;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class CopieFichier {

    public static String LireFichier(){
        try {
            FileReader fr = new FileReader("h:\\Documents\\Cours ING1 GM\\Semestre 2\\APOO\\Java\\TD7\\src\\td7\\fichier.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                return line;
            }
            br.close();
        }
        catch (Exception e){
            return "Erreur"+e;
        }
        return null;
    }

    public static void EcrireFichier(String carac){
        try {
            FileWriter fw = new FileWriter("h:\\Documents\\Cours ING1 GM\\Semestre 2\\APOO\\Java\\TD7\\src\\td7\\Copie.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Copie : -------------");
            bw.newLine();
            bw.write(carac);
            bw.newLine();
            bw.close();
        }
        catch (Exception e){
            System.out.println("Erreur"+e);
        }
    }


    public static void main(String args[]){
        String contain_file=LireFichier();
        EcrireFichier(contain_file);
    }
}
