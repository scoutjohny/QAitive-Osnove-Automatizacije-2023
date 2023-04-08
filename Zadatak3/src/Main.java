import java.util.Scanner;

public class Main {

    /*Zadatak3
    * Za potrebe pravljenja igre neophodno je kreirati abstraktnu klasu "BaseHero" i u njoj polja koja sadrže podatke
    * o zdravlju, količini mane (magijski resurs) i o tome da li je heroj živ ili mrtav. Takođe, trebalo bi da
    * sadrži i apstraktne metode koje pokazuju šta se događa kada heroj biva pogođen ("recieveHit"), kada
    * upotrebi primarno oružje ("primaryFire") i kada upotrebi sekundarno oružje ("secondaryFire"). Takođe bi
    * trebalo napraviti metodu koja pokazuje šta se dešava ako protivnik izvede napad koji svoju štetu
    * pravi na određenoj površini ("areaOfEffect"). Trebalo bi napraviti i klase "DwarfWarrior" i "ElfMage" koje
    * nasleđuju klasu "BaseHero" ali imaju i potencijalno neka svoja specifična polja. Važno je napomenuti da
    * Dwarf Warrior pri udarcu gubi 10 zdravlja a da troši 5 rage-a korišćenjem primarnog oružja (10 rage-a
    * korišćenjem sekundarnog oružja), dok Elf Mage pri udarcu gubi 30 zdravlja a da troši 15 mane korišćenjem
    * primarnog oružja (50 mane korišćenjem sekundarnog oružja). Takođe, trebalo bi prepisati metodu "show" u
    * svakoj od nasleđenih klasa kako bi se prikazalo trenutno stanje podataka o herojima. Neophodno je i napraviti
    * nasleđenu klasu negativnog heroja po izboru. Klase "DwarfWarrior" i "ElfMage" moraju imati parametrizovane
    * konstruktore, koji bi omogućili korisniku da podesi osnovne startne parametre heroja.
    *
    * In order to make a game, create abstract class "BaseHero" and within fields with information about health,
    * mana (magic resource) and weather the hero is dead or alive. Also, the class should have abstract methods
    * that describe what happens when a hero receives a hit ("recieveHit"), when he uses primary attack
    * ("primaryFire") and when he uses secondary attack ("secondaryFire"). In addition, there should also be
    * present a method that describes how heroes stats are changing when a hero is under attack with area of effect
    * ("areaOfEffect"). Two more classes should be created that inherit the "BaseHero" class ("DwarfWarrior" and
    * "ElfMage") that potentially have their own specific fields. It is important to mention that Dwarf Warrior,
    * when receives a hit, looses 30 health and expends 15 mana using primary attack (50 rage for the secondary
    * attack), while Elf Mage looses 10 health and expends 5 rage using primary attack (10 rage for the secondary
     * attack). The method "show" should be overridden in each of the child classes so it shows current hero stats.
     * It is also necessary to create a negative hero class of your choosing. Classes "DwarfWarrior" and "ElfMage"
     * must have parametrized constructor methods which will enable the end user to set the starting hero stats.
    */
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dobro došli u rpg simulator!");
        System.out.println("Imate mogućnost da prisustvujete spektakularnoj borbi u kojoj se Dwarf Warrior i Elf Mage suočavaju sa zloglasnom Hidrom");

        //Unos podataka za heroja Dwarf Warrior
        //Data entry for the hero Dwarf Warrior
        System.out.println("Molimo vas da unesete početne podatke za heroja Dwarf Warrior!");
        System.out.println("Health (1-100):");
        double dwHp = scanner.nextDouble();
        System.out.println("Rage (1-100):");
        double dwRg = scanner.nextDouble();

        //Kreiranje heroja Dwarf Warrior
        //Creation of the hero
        DwarfWarrior dwarfWarrior = new DwarfWarrior(dwHp,dwRg);

        //Unos podataka za heroja Elf Mage
        //Data entry for the hero Elf Mage
        System.out.println("Molimo vas da unesete početne podatke za heroja Elf Mage!");
        System.out.println("Health (1-100):");
        double emHp = scanner.nextDouble();
        System.out.println("Mana (1-100):");
        double emMn = scanner.nextDouble();

        //Kreiranje heroja Dwarf Warrior
        //Creation of the hero
        ElfMage elfMage = new ElfMage(emHp,emMn);

        //Kreiranje heroja Hydra
        //Creation of the antihero
        Hydra hydra = new Hydra();

        //Simulator borbe počinje i obavlja se po rundama
        //Fight simulator is starting and goes in rounds
        System.out.println("Unesite broj jedan za početak prve runde");
        int first = scanner.nextInt();
        if (first ==1) {
            System.out.println();
            System.out.println("Round one! FIGHT!");
            dwarfWarrior.primaryFire();
            hydra.recieveHit();
            Thread.sleep(3000);
            System.out.println();
            elfMage.primaryFire();
            hydra.recieveHit();
            System.out.println();
            Thread.sleep(3000);
            System.out.println("Hydra is fighting back!");
            hydra.primaryFire();
            dwarfWarrior.areaOfEffect();
            Thread.sleep(3000);
            System.out.println();
            hydra.secondaryFire();
            elfMage.areaOfEffect();
            System.out.println();
            System.out.println("Unesite broj dva za početak druge runde");
            int second = scanner.nextInt();
            if (second ==2) {
                if (!dwarfWarrior.isDead && !elfMage.isDead) {
                    if (!hydra.isDead) {
                        System.out.println("Round Two! FIGHT!");
                        dwarfWarrior.primaryFire();
                        hydra.recieveHit();
                        Thread.sleep(3000);
                        System.out.println();
                        elfMage.primaryFire();
                        hydra.recieveHit();
                        System.out.println();
                        Thread.sleep(3000);
                        System.out.println("Hydra is fighting back!");
                        hydra.primaryFire();
                        dwarfWarrior.areaOfEffect();
                        Thread.sleep(3000);
                        System.out.println();
                        hydra.secondaryFire();
                        elfMage.areaOfEffect();
                    } else {
                        System.out.println();
                        System.out.println("Simulacija borbe je završena! Naši heroji su pobedili");
                    }
                } else {
                    System.out.println();
                    System.out.println("Simulacija borbe je završena!Naši heroji su poraženi");
                }
                System.out.println();
                System.out.println("Unesite broj tri za početak treće runde");
                int third = scanner.nextInt();
                if (third ==3) {
                    System.out.println();
                    if (!dwarfWarrior.isDead && !elfMage.isDead) {
                        if (!hydra.isDead) {
                            System.out.println("Round Three! FIGHT!");
                            dwarfWarrior.primaryFire();
                            hydra.recieveHit();
                            Thread.sleep(3000);
                            System.out.println();
                            elfMage.primaryFire();
                            hydra.recieveHit();
                            System.out.println();
                            Thread.sleep(3000);
                            System.out.println("Hydra is fighting back!");
                            hydra.primaryFire();
                            dwarfWarrior.areaOfEffect();
                            Thread.sleep(3000);
                            System.out.println();
                            hydra.secondaryFire();
                            elfMage.areaOfEffect();
                        } else {
                            System.out.println();
                            System.out.println("Simulacija borbe je završena! Naši heroji su pobedili");
                        }
                    } else {
                        System.out.println();
                        System.out.println("Simulacija borbe je završena!Naši heroji su poraženi");
                    }
                    System.out.println();
                    System.out.println("Unesite broj četiri za početak četvrte runde");
                    int fourth = scanner.nextInt();
                    if (fourth ==4) {
                        if (!dwarfWarrior.isDead && !elfMage.isDead) {
                            if (!hydra.isDead) {
                                System.out.println("Round Four! FIGHT!");
                                dwarfWarrior.primaryFire();
                                hydra.recieveHit();
                                Thread.sleep(3000);
                                System.out.println();
                                elfMage.primaryFire();
                                hydra.recieveHit();
                                System.out.println();
                                Thread.sleep(3000);
                                System.out.println("Hydra is fighting back!");
                                hydra.primaryFire();
                                dwarfWarrior.areaOfEffect();
                                Thread.sleep(3000);
                                System.out.println();
                                hydra.secondaryFire();
                                elfMage.areaOfEffect();
                            } else {
                                System.out.println();
                                System.out.println("Simulacija borbe je završena! Naši heroji su pobedili");
                            }
                        } else {
                            System.out.println();
                            System.out.println("Simulacija borbe je završena!Naši heroji su poraženi");
                        }
                        if (!dwarfWarrior.isDead && !elfMage.isDead) {
                            if (!hydra.isDead) {
                                System.out.println();
                            } else {
                                System.out.println();
                                System.out.println("Simulacija borbe je završena! Naši heroji su pobedili");
                            }
                        } else {
                            System.out.println();
                            System.out.println("Simulacija borbe je završena!Naši heroji su poraženi");

                        }
                    }else {
                        System.out.println();
                        System.out.println("Uneli ste nedozvoljenu cifru, molimo vas da pokrenete simulaciju ponovo!");
                    }
                }else {
                    System.out.println();
                    System.out.println("Uneli ste nedozvoljenu cifru, molimo vas da pokrenete simulaciju ponovo!");
                }
            }else{
                System.out.println();
                System.out.println("Uneli ste nedozvoljenu cifru, molimo vas da pokrenete simulaciju ponovo!");
            }
        }else{
            System.out.println();
            System.out.println("Uneli ste nedozvoljenu cifru, molimo vas da pokrenete simulaciju ponovo!");
        }

    }
}
