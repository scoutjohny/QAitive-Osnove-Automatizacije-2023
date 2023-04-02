public class Circle extends Shape {

    public final double pi = 3.141592654;
    public double circumference;

    public Circle(String name, String color, int positionX, int positionY, double circumference) {
        super(name, color, positionX, positionY);
        this.circumference = circumference;
    }

    public double area(){
        return circumference*circumference*pi;
    }

    @Override
    public void show() {
        System.out.println("This is " + color + " "+ name +", with area of " + area() + " cm2" + " and its coordinates are X: " + positionX + " and Y: " + positionY);
    }

}
