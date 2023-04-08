public class ElfMage extends BaseHero {

    //Konstruktor za klasu Elf Mage
    //Constructor for the Elf Mage hero
    public ElfMage (double health, double mana){
        this.health=health;
        this.mana=mana;
        this.isDead=false;
        System.out.println("Kreiran je heroj Elf Mage sledećih karakteristika:");
        show();
        System.out.println();
    }

    //metoda koja definiše kako se menjaju stat-ovi za Elf Mage-a kada pretrpi štetu tj. udarac
    //method that describes how heroes stats are changing when a hero is under attack
    @Override
    public void recieveHit() {
        if (this.isDead==false){
            this.health -=30;
            System.out.println("Mage sufferes damage!!!");
            this.isDead=this.health<=0;
        }

        show();
    }

    //metoda koja definiše ponašanje kada Elf Mage upotrebi primarnu magiju
    //method that describes the primary magic attack
    @Override
    public void primaryFire() {
        if (this.isDead==false) {
            System.out.println("Mage uses his primary spell!");
            this.mana -= 15;
            show();
        }
    }

    //metoda koja definiše ponašanje kada Elf Mage upotrebi sekundarnu magiju
    //method that describes the secondary magic attack
    @Override
    public void secondaryFire() {
        if (this.isDead==false) {
            System.out.println("Mage uses his secondary spell!");
            this.mana -= 50;
            show();
        }
    }
    //metoda koja prikazuje podatke o trenutnom stanju statova Elf Mage-a
    //method that displays the current hero stats
    @Override
    public void show() {
        System.out.println("Elf Mage> Health: "+this.health+" Mana: "+this.mana+" is dead?: "+this.isDead);
    }
}

