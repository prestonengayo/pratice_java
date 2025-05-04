import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Person gloire = new Person("NGAYO", 1.75, 60.0, "Brown", 'F', 22);

        System.out.println("Le nom de gloire est : " + gloire.getName());
        System.out.println("L'âge de gloire est : " + gloire.getAge());

        System.out.println("==========================================");

        Person prestone = new Person("NZAMBI", 1.75, 85, "Brown", 'M', 26);

        System.out.println("Le nom de prestone est : " + prestone.getName());
        System.out.println("L'âge de prestone est : " + prestone.getAge());

        System.out.println("==========================================");

        Livre livre1 = new Livre("Père riche père pauvre", "Robert", 2010, false);
        Livre livre2 = new Livre("La chèvre de ma mère", "Kiyossaki", 1988, true);
        Livre livre3 = new Livre("La lois de la richesse", "Gloire", 2000, true);

        livre1.afficherInfos();
        livre2.afficherInfos();
        livre3.afficherInfos();

        System.out.println("==========================================");
        livre1.emprumter();
        livre2.emprumter();
        livre3.emprumter();


        System.out.println("==========================================");
        livre1.retouner();

    }


}


