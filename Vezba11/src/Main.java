import java.util.Scanner;

public class Main {

    /*
    Potrebno je kreirati program koji će prikazati rezultat računske operacije na osnovu tri
    informacije koje u njega ulaze: String operator, double operand1 i double operand2

    Create a progrma that displays the result of the arithmetic operation based on three input information:
    String operator, double operand1 i double operand2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        double operand1 = Integer.parseInt(sc.nextLine());

        System.out.println("Unesite drugi broj: ");
        double operand2 = Integer.parseInt(sc.nextLine());

        System.out.println("Unesite zeljenu racunsku operaciju: ");
        String operator = sc.nextLine();

        if(operator.equals("*")){
            System.out.println("Rezultat je: "+(operand1*operand2));
        } else if(operator.equals("/")){
            System.out.println("Rezultat je: "+(operand1/operand2));
        } else if(operator.equals("+")){
            System.out.println("Rezultat je: "+(operand1+operand2));
        } else if(operator.equals("-")){
            System.out.println("Rezultat je: "+(operand1-operand2));
        } else {
            System.out.println("Uneli ste nedozvoljeni karakter");
        }
    }
}
