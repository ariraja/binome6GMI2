package td3;

public class PrintArgs {

    public static void main(String[] args) {
         //System.out.println(args[0].toString()); // afficher premier argument
      
        // 10)
       /* for (int i=0; i<args.length; i++) {
				System.out.println( "Argument"+(i+1)+" : "+ args[i]);
        }*/
        
        // 11)
        /*for(String argument : args) {
				System.out.println(argument.toString());
        }*/
        
        // exemple
        String [] names = { "Le", "langage", "Java", "me", "plait", "beaucoup"}; // liste d'argument revient à faire run configurations
        for (String mot : names) { // for chaque 'mot' dans 'names'
            System.out.println(mot.toString());// afficher le mot
        }

    }
}
