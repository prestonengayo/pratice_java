import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Boucle
        String prenom;
        final String VOYELLE = "aeuioy";
        int nombreVoyelle = 0;
        String voyelletrouve = "";

        String[] jourSemaine = {"lundi", "mardi", "mercredi", "jeudi", "vedredi", "samedi"};

        Scanner clavier = new Scanner(System.in);


        for(String jour : jourSemaine){
            System.out.println(jour);
        }

        System.out.println("entrer votre prénom svp : ");
        prenom = clavier.nextLine().toLowerCase();

        for (int index = 0; index < prenom.length(); index++){
            char caractere = prenom.charAt(index);

            for (int index1 = 0; index1 < VOYELLE.length(); index1 ++){
                if (caractere == VOYELLE.charAt(index1)){
                   voyelletrouve = voyelletrouve.concat(String.valueOf(caractere));
                    nombreVoyelle++;
                }
            }
        }



        System.out.println("Votre prenom contient : "+ nombreVoyelle + " voyelle"+ ((nombreVoyelle > 1) ? "s" : ""));
        System.out.println("Les voyelles trouvées sont : "+ voyelletrouve);

   }

}