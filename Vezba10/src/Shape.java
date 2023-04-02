public class Shape {

    public int positionX;
    public int positionY;
    public String color;
    public String name;

    public Shape(String name, String color, int positionX, int positionY){
        this.name = name;
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void show(){
        System.out.println("This is " + color + " "+ name +" and its coordinates are X: " + positionX + " and Y: " + positionY );
    }
}
