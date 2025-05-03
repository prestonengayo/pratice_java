import java.util.Locale;
import java.util.Scanner;

public class Main {
    static int age = 26;

    public static void main(String[] args) {

        say_hello();
        System.out.println(sum(2,3));
        System.out.println(sum(2.5, 3.5));

        System.out.println(age);

    }
    
    static void say_hello(){
        System.out.println("Hello i'm in a function !");
    }

    static int sum(int nbre1, int nbre2){
        return nbre1 + nbre2;
    }


    static double sum(double nbre1, double nbre2){
        return nbre1 + nbre2;
    }


}


