import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Structure conditionnelle


        int age;
        Scanner clavier = new Scanner(System.in);

        System.out.println("veuillez entrer votre âge :");
        age = clavier.nextInt();


        if(age <= 0){
            System.out.println("Veuillez entrer un âge valide");
        }else{
            System.out.print("vous avez " + age + " an");
            System.out.println((age != 1) ? "s" : "");
        }

   }

}