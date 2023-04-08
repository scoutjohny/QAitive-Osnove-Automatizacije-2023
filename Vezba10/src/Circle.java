import java.util.Scanner;
public class Circle extends Shape{
    public double r=8;
    public final double PI=3.14;

    public Circle(){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite poluprečnik kruga: ");
        this.r = scanner.nextDouble();
        perimeter();
        area();
    }
    /* Naredne metode predstavljaju slučajeve polimorfizma. @Override metode prepisuju metodu iz
    roditeljske klase, ponovo koriste isto ime metode ali uglavnom imaju potpuno drugačiju strukturu
    unutar metode (prve dve metode). Treća, četvrta i peta metoda pretstavljaju preopterećenje metode,
    gde se koristi isto ime metode ali sa drugačijim potpisom (parametrima).

    Following methods represent the code polymorphism. @Override simply overrides the method from
    the parent class and reuses its name but usually has different inner code (first two methods).
    The third, fourth and fifth method represent the method overload, where we use the same method
    name but with different signature (parameters).
    */
    @Override
    public void perimeter() {
        System.out.println("Obim kruga čiji je poluprečnik "+this.r+" je: "+(2*this.r*this.PI));
    }

    @Override
    public void area() {
        System.out.println("Površina kruga čiji je poluprečnik "+this.r+" je: "+(this.r*this.r*this.PI));
    }

    public void show(){
        System.out.println("Ovo je krug!");
    }

    public void show(String color){
        System.out.println("Ovo je krug u boji: "+color);
    }

    public void show(String color, String name){
        System.out.println("Ovo je krug u boji "+color+" i zove se: "+name);
    }

}
