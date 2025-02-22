import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Structure conditionnelle


        int heure;
        Scanner clavier = new Scanner(System.in);

        System.out.println("Il est quelle heure ");
        heure = clavier.nextInt();


        switch (heure){
            case 6 : System.out.println("C'est le matin ");
            break;
            case 12 : System.out.println("C'est juste le midi !");
            break;
            case 18 : System.out.println("C'est le soir");
            break;
            default: System.out.println("Cas non prise en charge !");
        }

   }

}