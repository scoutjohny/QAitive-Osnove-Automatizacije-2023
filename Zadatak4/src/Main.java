import java.util.Scanner;

public class Main {

    /*Zadatak4
     *Potrebno je napraviti klasu "Product" koja će pretstavljati osnovu za dalje nasleđivanje i neće se moći
     *instancirati. Ovu klasu nasleđuju dve klase koje pretstavljaju konkretne grupe proizvoda: "Chocolate" i
     *"Wine". Svaki proizvod poseduje određene osobine: naziv proizvoda, bar kod, osnovnu cenu i porez.
     * Takođe, svaki proizvod poseduje i metodu za računanje cene, koje se izračinava kada se osnovna cena uveća
     * za iznos poreza. Porez (PDV) za svaki proizvod je 20% i ovo je podatak koji je konstantan i  neće se
     * menjati. Ipak, proizvodi iz grupe vina, imaju i dodatni porez, pošto spadaju u grupu alkoholnih pića,
     * i on iznosi 10% od cene već uvećane za iznos PDV-a. I ovo je podatak koji je konstantan i neće se menjati.
     * Zbog ovoga je potrebno redefinisati metodu za računanje cene u okviru klase "Wine".
     * Pored ovoga, klasa "Wine" bi trebalo da poseduje atribut koji definiše zapreminu boce, a klasa "Chocolate"
     * atribut koji definiše težinu.
     * U klasama "Chocolate" i "Wine" je potrebno napraviti parametrizovane konstruktore za kreiranje objekata.
     * Potrebno je, takođe, u klasama redefinisati metodu "toString" za prikaz informacija o objektu.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dobro došli u program za unošenje artikala!");
        System.out.println("Molimo Vas da odaberete redosled artikala koje bi ste želeli da unesete");
        System.out.println("Pritisnite 1 da bi ste uneli prvo čokoladu pa vino ili 2 da bi ste prvo uneli vino pa čokoladu!");
        int a = scanner.nextInt();
        if (a == 1) {
            scanner.nextLine();
            System.out.println("Unesite naziv proizvoda (čokolade):");
            String productName = scanner.nextLine();
            System.out.println("Unesite barcode proizvoda:");
            String barCode = scanner.nextLine();
            System.out.println("Unesite osnovnu cenu proizvoda (din):");
            double basicPrice = scanner.nextDouble();
            System.out.println("Unesite težinu proizvoda (g):");
            int packageWeight = scanner.nextInt();
            scanner.nextLine();
            Chocolate chocolate = new Chocolate(productName, barCode, basicPrice, packageWeight);
            System.out.println();
            System.out.println("Unesite naziv proizvoda (vina):");
            String productName1 = scanner.nextLine();
            System.out.println("Unesite barcode proizvoda:");
            String barCode1 = scanner.nextLine();
            System.out.println("Unesite osnovnu cenu proizvoda (din):");
            double basicPrice1 = scanner.nextDouble();
            System.out.println("Unesite zapreminu boce (l):");
            double bottleVolume = scanner.nextDouble();
            Wine wine = new Wine(productName1, barCode1, basicPrice1, bottleVolume);
            System.out.println();
            System.out.println("Da li želite da pogledate podatke o unetim proizvodima? Pritisnite 1 za DA ili bilo koji drugi taster za NE");
            int b = scanner.nextInt();
            if (b == 1) {
                //Ovde računamo finalnu cenu čokolade, prebacujemo sve podatke o proizvodu u string i štampamo ih
                chocolate.priceCalc();
                System.out.println("Cena čokolade sa PDV-om je: "+chocolate.price+" din");
                String c = chocolate.toString();
                System.out.println(c);
                System.out.println();

                //Ovde računamo finalnu cenu vina, prebacujemo sve podatke o proizvodu u string i štampamo ih
                wine.priceCalc();
                System.out.println("Cena flaše vina sa PDV-om i porezom je: "+wine.price+" din");
                String d = wine.toString();
                System.out.println(d);
            }
        } else if (a == 2) {
            scanner.nextLine();
            System.out.println("Unesite naziv proizvoda (vina):");
            String productName1 = scanner.nextLine();
            System.out.println("Unesite barcode proizvoda:");
            String barCode1 = scanner.nextLine();
            System.out.println("Unesite osnovnu cenu proizvoda (din):");
            double basicPrice1 = scanner.nextDouble();
            System.out.println("Unesite zapreminu boce (l):");
            double bottleVolume = scanner.nextDouble();
            scanner.nextLine();
            Wine wine = new Wine(productName1, barCode1, basicPrice1, bottleVolume);
            System.out.println();
            System.out.println("Unesite naziv proizvoda (čokolade):");
            String productName = scanner.nextLine();
            System.out.println("Unesite barcode proizvoda:");
            String barCode = scanner.nextLine();
            System.out.println("Unesite osnovnu cenu proizvoda (din):");
            double basicPrice = scanner.nextDouble();
            System.out.println("Unesite težinu proizvoda (g):");
            int packageWeight = scanner.nextInt();
            scanner.nextLine();
            Chocolate chocolate = new Chocolate(productName, barCode, basicPrice, packageWeight);
            System.out.println();
            System.out.println("Da li želite da pogledate podatke o unetim proizvodima? Pritisnite 1 za DA ili bilo koji drugi taster za NE");
            int b = scanner.nextInt();
            if (b == 1) {
                //Ovde računamo finalnu cenu vina, prebacujemo sve podatke o proizvodu u string i štampamo ih
                wine.priceCalc();
                System.out.println("Cena flaše vina sa PDV-om i porezom je: "+wine.price+" din");
                String e = wine.toString();
                System.out.println(e);
                System.out.println();

                //Ovde računamo finalnu cenu čokolade, prebacujemo sve podatke o proizvodu u string i štampamo ih
                chocolate.priceCalc();
                System.out.println("Cena čokolade sa PDV-om je: "+chocolate.price+" din");
                String f = chocolate.toString();
                System.out.println(f);
                System.out.println();
            }
        } else {
            System.out.println("Niste odabrali ni jednu od ponuđenih opcija! Molomo Vas da ponovo pokrenete program!");


        }
        System.out.println("Hvala što se koristili naš program. Prijatan dan!!!");
    }
}
