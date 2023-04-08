import java.util.Scanner;

public class Kalkulator {

    public double operand1;
    public double operand2;
    Scanner scanner;


    public Kalkulator (){
        this.scanner = new Scanner(System.in);
        System.out.println("Unesite jedan broj: ");
        this.operand1=scanner.nextDouble();
        System.out.println("Unesite još jedan broj: ");
        this.operand2=scanner.nextDouble();
    }
    public void add(){
        System.out.println("Zbir dva uneta broja je: "+(this.operand1+this.operand2));
    }

    public void sub(){
        System.out.println("Razlika dva uneta broja je: "+(this.operand1-this.operand2));
    }

    public void mul(){
        System.out.println("Proizvod dva uneta broja je: "+(this.operand1*this.operand2));
    }

    public void div(){
        System.out.println("Količnik dva uneta broja je: "+(this.operand1/this.operand2));
    }
}
