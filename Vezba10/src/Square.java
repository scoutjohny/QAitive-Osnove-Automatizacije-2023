public class Square extends Shape {

    public double sideA;

    public Square(String name, String color, int positionX, int positionY, double sideA) {
        super(name, color, positionX, positionY);
        this.sideA = sideA;
    }

    public double area(){
        return sideA*sideA;
    }

    @Override
    public void show() {
        System.out.println("This is " + color + " "+ name +", with area of " + area() + " cm2" + " and its coordinates are X: " + positionX + " and Y: " + positionY);
    }

}