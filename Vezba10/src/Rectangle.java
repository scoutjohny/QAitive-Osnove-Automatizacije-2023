public class Rectangle extends Shape {

    public double sideA;
    public double sideB;

    public Rectangle(String name, String color, int positionX, int positionY, double sideA, double sideB) {
        super(name, color, positionX, positionY);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double area(){
        return sideA*sideB;
    }

    @Override
    public void show() {
        System.out.println("This is " + color + " "+ name +", with area of " + area() + " cm2" + " and its coordinates are X: " + positionX + " and Y: " + positionY);
    }

}