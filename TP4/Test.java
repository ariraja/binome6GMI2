package tp4;

public class Test {
    public static void main(){
        //        Zoo test=new Zoo("EISTI");
//
//        Lion lion=new Lion("Catherine",66,72);
//        Tigre tigre=new Tigre("Julie",66,72);
//        Vache vache=new Vache("Sarah",100,"concentré");
//        Canard canard=new Canard("Benoit",3, "azures");
//
//        test.ajouterAnimal(lion);
//        test.ajouterAnimal(tigre);
//        test.ajouterAnimal(vache);
//        test.ajouterAnimal(canard);
//
//        lion.crier();
//        tigre.crier();
//        vache.crier();
//        canard.crier();
//
        Zoo test=new Zoo("EISTI");
        Lion lion=new Lion("Catherine",66,72);
        Tigre tigre=new Tigre("Julie",66,72);
        Vache vache=new Vache("Sarah",100,"concentré");
        Canard canard=new Canard("Benoit",3, "azures");
        test.ajouterAnimal(lion);
        test.ajouterAnimal(tigre);
        test.ajouterAnimal(vache);
        test.ajouterAnimal(canard);
        double total_nourriture;
        total_nourriture=test.CoutGlobalNourriture();
        System.out.println("Le zoo devra "+total_nourriture+"kg de nourriture pour tous les animaux");
    }
}
