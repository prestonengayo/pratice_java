import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // tableau


        String[] jourSemaine = new String[7];

        Scanner clavier = new Scanner(System.in);
        String[] mois = {"Janvier", "fevrier", "Mars", "Avril"};


        System.out.println(jourSemaine.length);
        for(int i = 0; i < jourSemaine.length ; i++){
            System.out.println("Entrer le jour n°"+ (i+1));
            jourSemaine[i] = clavier.nextLine();
        }


        for (String jour : jourSemaine){
            System.out.println(jour);
        }



   }

}