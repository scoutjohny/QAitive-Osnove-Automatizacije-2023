public abstract class Product{

    public String productName,barCode;
    public double basicPrice,price;
    public final double pdv=0.2;

    //Metoda za računanje cene
    public void priceCalc(){
        this.price=(1+pdv)*this.basicPrice;
    }

}
