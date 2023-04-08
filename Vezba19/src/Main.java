public class Main {
    /*
    Potrebno je kreirati tri niza: niz pojmova (String) u kome će biti bicikl, automobil i mobilni telefon,
    niz naziva (String) u kome će se nalaziti nazivi koji će odgovarati pojmovima iz prethodnog niza kao i
    niz cena (double) koji će odgovarati cenama pojmova iz prethodnih nizova. Potrebno je proći kroz sve
    nizove i prikazati sve podatke o svakom pojmu ( naziv,tip i cena):

    BMX is type Bicycle and it costs 150.55

    Renault 4 is type Car and it costs 100.0

    I-Phone is type Mobile Phone and it costs 500.0

    Create a program that will create three arrays: array of types (String) that will have "Bicycle", "Car" and
    "Mobile Phone", array of names (String) in witch there will be names that correspond to the types from the
    previous array and an array of prices that will correspond to the names and types from the previous arrays.
    The program should go trough all of the arrays and display the data about each item (name, type and price):

    BMX is type Bicycle and it costs 150.55

    Renault 4 is type Car and it costs 100.0

    I-Phone is type Mobile Phone and it costs 500.0
     */
    public static void main(String[] args) {
        String[] tip = {"Bycicle","Car","Mobile Phone"};
        String[] naziv = {"BMX","Renault 4","I-Phone"};
        double[] cena = {150.55,100,500};

        for(int i = 0;i<3;i++) {
            System.out.println(naziv[i] + " is type " + tip[i] + " and it costs " + cena[i]);
        }
    }
}