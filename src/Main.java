import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Structure conditionnelle


        int age;
        Scanner clavier = new Scanner(System.in);

        System.out.println("veuillez entrer votre âge :");
        age = clavier.nextInt();

        if(age < 18){
            System.out.println("Vous êtes encore mineur");
        }else  if(age > 18 ){
            System.out.println("Vous êtes majeur");
        }else{
            System.out.println("Vous venez juste de devenir majeur !");
        }


   }

}