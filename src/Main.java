import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int numberMagic1 = (int) (Math.random() * 10) + 1 ;
        int numberMagic2 = (int) (Math.random() * 100) + 1;
        int numberMagic3 = (int) (Math.random() * 1000) + 1;
        int numberMagic4 = (int) (Math.random() * 10000) + 1;
        int numberLevel = 0;
        int numberDev = 0;
        String choice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selectionnez le niveau : 1,2,3 ou 4");
        System.out.println("1 : niveau facile");
        System.out.println("2 : niveau intermédiaire");
        System.out.println("3 : niveau moyen");
        System.out.println("4 : niveau diffile");
        numberLevel = scanner.nextInt();

       while (true){
           if (numberLevel == 1){
               System.out.println("Devinez un nombre compris en 1 et 10 : ");
               numberDev = scanner.nextInt();
               scanner.nextLine();

               if (numberDev < numberMagic1){
                   System.out.println("Le nombre entrer est trop petit");
               } else if (numberDev > numberMagic1) {
                   System.out.println("Le nombre entrer est trop grand");
               } else if (numberDev == numberMagic1){
                   System.out.println("Félicitations !!! Vous avez gagnés");

                   System.out.println("Voulez-vous continuer : Oui ou Non ?");
                   choice = scanner.nextLine();

                       if (choice.equalsIgnoreCase("oui")){
                           System.out.println("1 : niveau facile");
                           System.out.println("2 : niveau intermédiaire");
                           System.out.println("3 : niveau moyen");
                           System.out.println("4 : niveau diffile");
                           numberLevel = scanner.nextInt();
                       } else if (choice.equalsIgnoreCase("non")){
                           System.out.println("A très bientôt");
                           break;
                       } else {
                           System.out.println("Réponse invalide");
                           break;
                       }
               } else {
                   System.out.println("Le nombre entrer est invalide");
               }

           } else if (numberLevel == 2) {
               System.out.println("Devinez un nombre compris en 1 et 100 : ");
               numberDev = scanner.nextInt();
               scanner.nextLine();

               if (numberDev < numberMagic2){
                   System.out.println("Le nombre entrer est trop petit");
               } else if (numberDev > numberMagic2) {
                   System.out.println("Le nombre entrer est trop grand");
               } else if (numberDev == numberMagic2){
                   System.out.println("Félicitations !!! Vous avez gagnés");

                   System.out.println("Voulez-vous continuer : Oui ou Non ?");
                   choice = scanner.nextLine();

                   if (choice.equalsIgnoreCase("oui")){
                       System.out.println("1 : niveau facile");
                       System.out.println("2 : niveau intermédiaire");
                       System.out.println("3 : niveau moyen");
                       System.out.println("4 : niveau diffile");
                       numberLevel = scanner.nextInt();
                   } else if (choice.equalsIgnoreCase("non")){
                       System.out.println("A très bientôt");
                       break;
                   } else {
                       System.out.println("Réponse invalide");
                       break;
                   }
               } else {
                   System.out.println("Le nombre entrer est invalide");
               }
           } else if (numberLevel == 3) {
               System.out.println("Devinez un nombre compris en 1 et 1000 : ");
               numberDev = scanner.nextInt();
               scanner.nextLine();

               if (numberDev < numberMagic3){
                   System.out.println("Le nombre entrer est trop petit");
               } else if (numberDev > numberMagic3) {
                   System.out.println("Le nombre entrer est trop grand");
               } else if (numberDev == numberMagic3){
                   System.out.println("Félicitations !!! Vous avez gagnés");

                   System.out.println("Voulez-vous continuer : Oui ou Non ?");
                   choice = scanner.nextLine();

                   if (choice.equalsIgnoreCase("oui")){
                       System.out.println("1 : niveau facile");
                       System.out.println("2 : niveau intermédiaire");
                       System.out.println("3 : niveau moyen");
                       System.out.println("4 : niveau diffile");
                       numberLevel = scanner.nextInt();
                   } else if (choice.equalsIgnoreCase("non")){
                       System.out.println("A très bientôt");
                       break;
                   } else {
                       System.out.println("Réponse invalide");
                       break;
                   }
               } else {
                   System.out.println("Le nombre entrer est invalide");
               }
           } else if (numberLevel == 4) {
               System.out.println("Devinez un nombre compris en 1 et 10000 : ");
               numberDev = scanner.nextInt();
               scanner.nextLine();

               if (numberDev < numberMagic4){
                   System.out.println("Le nombre entrer est trop petit");
               } else if (numberDev > numberMagic4) {
                   System.out.println("Le nombre entrer est trop grand");
               } else if (numberDev == numberMagic4){
                   System.out.println("Félicitations !!! Vous avez gagnés");

                   System.out.println("Voulez-vous continuer : Oui ou Non ?");
                   choice = scanner.nextLine();

                   if (choice.equalsIgnoreCase("oui")){
                       System.out.println("1 : niveau facile");
                       System.out.println("2 : niveau intermédiaire");
                       System.out.println("3 : niveau moyen");
                       System.out.println("4 : niveau diffile");
                       numberLevel = scanner.nextInt();
                   } else if (choice.equalsIgnoreCase("non")){
                       System.out.println("A très bientôt");
                       break;
                   } else {
                       System.out.println("Réponse invalide");
                       break;
                   }
               } else {
                   System.out.println("Le nombre entrer est invalide");
               }
           }

       }

    }

}


