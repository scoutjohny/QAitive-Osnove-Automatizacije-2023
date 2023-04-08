import java.util.Scanner;

public class Rectangle extends Shape{
    public double a;
    public double b;

    public Rectangle(){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite stranicu a pravougaonika: ");
        this.a = scanner.nextDouble();
        System.out.println("Unesite stranicu b pravougaonika: ");
        this.b = scanner.nextDouble();
        perimeter();
        area();
    }

    /* Naredne metode predstavljaju slučajeve polimorfizma. @Override metode prepisuju metodu iz
        roditeljske klase, ponovo koriste isto ime metode ali uglavnom imaju potpuno drugačiju strukturu
        unutar metode (prve dve metode).

        Following methods represent the code polymorphism. @Override simply overrides the method from
        the parent class and reuses its name but usually has different inner code (first two methods).
    */
    @Override
    public void perimeter() {
        System.out.println("Obim pravougaonika čije su stranice "+this.a+" i "+b+" je: "+(2*this.a+2*this.b));
    }

    @Override
    public void area() {
        System.out.println("Površina pravougaonika čije su stranice "+this.a+" i "+b+" je: "+(this.a*this.b));
    }
}
