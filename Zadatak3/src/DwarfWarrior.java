public class DwarfWarrior extends BaseHero {

    //klasa warrior nema manu kao resurs već troši rage
    //Dwarf Warrior instead of mana uses rage
    public double rage;

    //Konstruktor za klasu Dwarf Warrior
    //Constructor for the Dwarf Warrior hero
    public DwarfWarrior (double health, double rage){
        this.health=health;
        this.rage=rage;
        this.isDead=false;
        System.out.println("Kreiran je heroj Dwarf Warrior sledećih karakteristika:");
        show();
        System.out.println();
    }

    //metoda koja definiše kako se menjaju stat-ovi za dwarf warrior-a kada pretrpi štetu tj. udarac
    //method that describes how heroes stats are changing when a hero is under attack
    @Override
    public void recieveHit() {
        this.health -=10;
        System.out.println("Warrior suffers damage and enrages!!!");
        this.rage +=15;
        this.isDead=this.health<=0;
        show();
    }

    //metoda koja definiše ponašanje kada warrior zamahne primarnim oružjem
    //method that describes the primary weapon attack
    @Override
    public void primaryFire() {
        if (this.isDead==false){
            System.out.println("Warrior swinging his primary weapon!");
            this.rage -= 5;
            show();
        }

    }

    //metoda koja definiše ponašanje kada warrior zamahne sekundarnim oružjem
    //method that describes the secondary weapon attack
    @Override
    public void secondaryFire() {
        if (this.isDead==false){
            System.out.println("Warrior swinging his secondary weapon!");
            this.rage -= 10;
            show();
        }

    }
    //metoda koja prikazuje podatke o trenutnom stanju statova warrior-a
    //method that displays the current hero stats
    @Override
    public void show() {
        System.out.println("Dwarf Warrior> Health: "+this.health+" Rage: "+this.rage+" is dead?: "+this.isDead);
    }
}
