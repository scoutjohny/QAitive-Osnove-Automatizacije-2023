import java.util.Scanner;
public class Main {
//    Napraviti program koji pita koisnika za unos jednog broja , zatim za unos drugog broja
//    i ispisuje njihov zbir u konzoli
//
//    Create a program that is asking the user to input one number, then the nex one and displays
//    the result in the console
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Unesite prvi broj: ");
            int prviBroj = sc.nextInt();

            System.out.println("Unesite drugi broj: ");
            int drugiBroj = sc.nextInt();

            int rezultat = prviBroj+drugiBroj;
            System.out.println("Zbir je: "+rezultat);
        }
}
