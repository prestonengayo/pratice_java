import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        //Data type
        final int PRIX_UNITAIRE = 125;
        final  String DEVISE = "CFA";
        int nbreArticle;
        double total;

        Scanner clavier = new Scanner(System.in);

        System.out.println("Combien d'oeufs voulez vous prendre ?");
        nbreArticle = clavier.nextInt();

        total = nbreArticle * PRIX_UNITAIRE;

        System.out.println("Vous devez payé : "+ total + " "+DEVISE);


    }

}