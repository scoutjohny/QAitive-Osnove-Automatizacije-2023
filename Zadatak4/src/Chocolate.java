public class Chocolate extends Product{
    //u polju se čuva podatak o težini pakovanja
    public int packageWeight;

    //Parametrizovani konstruktor koji omogućava kreiranje proizvoda sa svim potrebnim informacijama
    //Parametrized constructor method which enables product creation with all necessary information
    public Chocolate (String productName, String barCode, double basicPrice, int packageWeight){
        this.productName = productName;
        this.barCode = barCode;
        this.basicPrice = basicPrice;
        this.packageWeight = packageWeight;
    }

    //Prepisivanje metode toString kako bi nam se sastavila potpuna informacija o proizvodu
    //Override of the toString method so it displays the complete product info
    @Override
    public String toString() {
        return "Product name: "+productName+" Product type: chocolate, Barcode: "+barCode+", Price including VAT: "+price+" din , Package weight "+packageWeight+"g";
    }
}
