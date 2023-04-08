import java.util.Scanner;

public class Main {

//    Napraviti program koji će na izlazu prikazati da li je vrednost promenljive koju je korisnik
//    uneo parna. Takodje treba da bude prikazana uneta vrednost.
//
//    Create a program that can display the information weather the value of the variable inputted by the
//    user is and odd or even number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite vrednost promenljive: ");
        int x = scanner.nextInt();
        if(x%2==0){
            System.out.println("Promenljiva je parna");
        } else {
            System.out.println("Promenljiva nije parna");
        }
    }
}