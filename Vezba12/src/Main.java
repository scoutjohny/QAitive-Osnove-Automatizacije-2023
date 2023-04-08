public class Main {

    /*  Potrebno je kreirati program za naplatu kreditnih kartica. U programu postoji metod koji prihvata objekat
        klase Card. Klasa Card ima konstruktor koji kao parametar prihvata inicijalno stanje na računu. Klasa Card
        ima polje balance i metod charge. Metod charge proverava da li na kartici ima dovoljno novca i ukoliko ima
        izvršava naplatu. Ukoliko nema, prikazuje korisniku da ne postoji dovoljno sredstava na računu i otkazuje
        naplatu.

        Create a program for credit card charging. Within a program there should be a method that takes in an
        object of class "Card". Class "Card" should have a constructor method that has initial account balance as
        a parameter and a method "charge". Said method should check weather the credit card has enough funds for
        the transaction (charging) to take place and if it does, charges the appropriate amount. If not, it should
        display the message to the user, stating that there are not enough funds in the account and cancel the
        charging process.

     */
    public static void main(String[] args) {
        Card c = new Card(1000);
        naplati(c,500);
        naplati(c,500);
        naplati(c,100);

    }
    public static void naplati(Card c,double iznos){
        c.charge(iznos);

    }
}