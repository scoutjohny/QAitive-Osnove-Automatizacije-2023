import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
    Program zamišlja broj i pita nas koji je broj zamislio, zatim nam nudi unos sa tastature.
    Ukoliko pogodimo zamišljeni broj, računar nam potvrđuje da zamišlja novi broj i ponavlja proceduru.
    Ukoliko ne pogodimo, program nas obaveštava da nismo pogodili i nudi mogućnost unosa novog broja.

    Create a program that selects a random number and offers us to input one number from the keyboard.
    If we guess the selected number, the program should confirm it and repeat the procedure.
    If we don't guess the number, the program should display a message that we didn't guess the number
    and should offer the input of another number.
     */
    public static void main(String[] args) {
        while (true) {
            Random r = new Random();
            System.out.println("Ја ću zamisliti jedan broj!");
            int zamisljeniBroj = r.nextInt(3);
            System.out.println("...Zamišljam...");
            System.out.println("...(ovo je teže nego što sam mislio)...");
            System.out.println("Evo ga!");
            System.out.println("Koji broj sam zamislio?");
            Scanner sc = new Scanner(System.in);
            int pokusajPogodka = sc.nextInt();
            if (pokusajPogodka == zamisljeniBroj) {
                System.out.println("Bravo pogodili ste, zamišljeni broj je bio: " + zamisljeniBroj + " !");
                continue;
            } else {
                System.out.println("Više sreće drugi put!");
            }
        }
    }
}