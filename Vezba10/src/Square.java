import java.util.Scanner;

public class Square extends Shape{
    public double a;

    public Square(){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite stranicu kvadrata: ");
        this.a = scanner.nextDouble();
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
        System.out.println("Obim kvadrata čija je stranica "+this.a+" je: "+(4*this.a));
    }

    @Override
    public void area() {
        System.out.println("Površina kvadrata čija je stranica "+this.a+" je: "+(this.a*this.a));
    }
}
