import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        //Type casting

        //integer to double
        int age = 25;
        double age1 = age;
        System.out.println(age1);

        //double to integer
        double somme = 625.20;
        int somme1 = (int)somme;
        System.out.println(somme1);

        //byte to int
        byte taille = 125;
        int taille1 = taille;
        taille1 = taille1 + 500;
        System.out.println(taille1);

        //int to byte
        int ageAdulte = 200;
        byte ageAdulte1 = (byte) ageAdulte;
        System.out.print(ageAdulte1);

    }

}