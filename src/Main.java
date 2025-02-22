//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        int age = 26;
        System.out.println("Mon âge est : " + age + " ans");
        System.out.println(somme(2,9));

    }

    /**
     *
     * @param nbre1 firt number that we want used to make sum
     * @param nbre2 second number that we want used to make sum
     * @return a double, sum of number 1 and number 2
     */
    static double somme(double nbre1, double nbre2){
        return nbre1 + nbre2;
    }
}