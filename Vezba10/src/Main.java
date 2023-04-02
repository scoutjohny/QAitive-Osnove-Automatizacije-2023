public class Main {

    /*Vežba10
*Potrebno je napraviti klasu Shape koja bi sadržala neke podatke o geometrijskom obliku:
* - poziciju (x, y)
* - boju i naziv.
* Potrebno je napraviti tri klase koje nasleđuju ovu klasu , jednu za krug, jednu za kvadrat i jednu
* za pravougaonik.
* Svaka klasa bi trebalo da sadrži metodu za izračunavanje površine, kao i sopstvene atribute koji su
* neophodni za ovo izračunavanje. (strane za pravougaonik i kvadrat i poluprečnik za krug)
* Krug, takođe, trba da poseduje i konstantu pi.
*/
    public static void main(String[] args) {

        Circle circle = new Circle("Circle", "blue",6,9,3);
        Rectangle rectangle = new Rectangle("Rectangle", "red",8,11,5,3);
        Square square = new Square("Square", "yellow", -3,17,4);

        circle.show();
        rectangle.show();
        square.show();

    }
}
