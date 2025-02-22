import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        //String Exercise
        String firstname;
        String lastname;

        String firstPart = "";
        String secondPart = "";

        Scanner keyboard = new Scanner(System.in);

        // recuperation du nom et prenom de l'utilisateur
        System.out.println("Entrer votre prenom : ");
        firstname = keyboard.nextLine();
        System.out.println("Entrer votre nom de famille : ");
        lastname = keyboard.nextLine();

        // mettre le nom en majiscule
        lastname = lastname.toUpperCase();

        // recuperation du premier caractere du prenom et transformation de ce caractère en string
        firstPart = String.valueOf(firstname.charAt(0));
        firstPart = firstPart.toUpperCase();

        //recupération du reste de prenom et le mettre en miniscule
        secondPart = firstname.substring(1).toLowerCase();

        //concatener les deux parties du prénom
        firstname = firstPart.concat(secondPart);

        //affichage
        System.out.println("Bienvenue "+ firstname + " " + lastname);

   }

}