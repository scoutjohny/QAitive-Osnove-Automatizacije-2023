public class Wine extends Product{

    //U poljima nam se čuvaju informacije o zapremini ambalaže kao i porezu na alkoholna pića
    //Fields contain information about the bottle volume and alcohol tax
    public double bottleVolume;
    public final double alcocholeTax=0.1;

    //Parametrizovani konstruktor koji omogućava kreiranje proizvoda sa svim potrebnim informacijama
    //Parametrized constructor method which enables product creation with all necessary information
    public Wine (String productName, String barCode, double basicPrice, double bottleVolume){
        this.productName = productName;
        this.barCode = barCode;
        this.basicPrice = basicPrice;
        this.bottleVolume = bottleVolume;
    }

    //Prepisivanje metode priceCalc kako bi nam se uračunao i porez na alkoholna pića koji iznosi 10% na cenu sa PDV-om
    //Override of the priceCalc method to include 10% alcohol tax
    @Override
    public void priceCalc() {
        this.price=(1+alcocholeTax)*((1+pdv)*this.basicPrice);
    }

    //Prepisivanje metode toString kako bi nam se sastavila potpuna informacija o proizvodu
    //Override of the toString method so it displays the complete product info
    @Override
    public String toString() {
        return "Product name: "+productName+" Product type: Wine, Barcode: "+barCode+", Price including VAT: "+price+" din , Volume "+bottleVolume+" l";
    }
}
