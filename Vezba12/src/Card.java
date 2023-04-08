public class Card {
    public double balance;

    public Card (double balance){
        this.balance = balance;
    }
    public void charge(double charge){
        if(this.balance>=charge){
            this.balance -= charge;
            System.out.println("Uspešno naplaćeno: "+charge+" dinara.");
        } else {
            System.out.println("Nedovoljno sredstava na računu, naplata otkazana.");
        }
    }
}