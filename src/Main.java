import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Boucle
        String reponse;


        Scanner clavier = new Scanner(System.in);

/*
        do {
            System.out.println("Voulez vous continuer à jouer oui ou non ? ");
            reponse = clavier.nextLine().toLowerCase();


            if(reponse.equals("oui")){
                System.out.println("vous avez decidé de continuer!");
            }else if(reponse.equals("non")) {
                System.out.println("vous avez decidé de ne pas continuer!");
                break;
            }else{
                System.out.println("Veuillez taper oui ou non");
            }

        }while (reponse.equals("oui") || reponse.equals("non"));
*/


        for (int i = 0 ; i <= 10; i++ ){
            if( i == 4){
                break;
            }
            System.out.println("nous sommes à la position : "+ (i));

        }
   }

}