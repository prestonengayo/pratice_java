import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // tableau

        int[][] nomber = {{2,4,6}, {1,3,5} };

        System.out.println(nomber[0][2]);

        System.out.println(nomber.length);

        for (int i = 0 ; i < nomber.length; i++){
            for (int j = 0; j < nomber[i].length; j++){
                System.out.println("L'enfant se trouvant à la position n°"+(j+1) + " du tableau "+(i+1)+" est : "+nomber[i][j]);
            }
        }

   }

}