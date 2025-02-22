import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        //declaration des variable largeur, longeur et surface
        float lenght, width, area;

        //création d'un objet scanner pour recuperer la saisie de l'utilisateur
        Scanner keybaord = new Scanner(System.in);

        System.out.println("Entrer la largeur du rectangle");

        //recuperation de la largeur
        width = keybaord.nextFloat();

        System.out.println("Entrer la longeur du rectangle");

        //recuperation de la longeur
        lenght = keybaord.nextFloat();

        //calcul de la surface
        area = lenght * width;

        System.out.println("La surface du rectangle est "+ area);
    }

}