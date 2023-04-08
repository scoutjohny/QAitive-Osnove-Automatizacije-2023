public class Hydra extends BaseHero {

    //Konstruktor za klasu Hydra
    //Constructor for the Hydra hero
    public Hydra (){
        this.health=100;
        this.mana=100;
        this.isDead=false;
        System.out.println("Kreiran je protivnik Hydra sledećih karakteristika:");
        show();
        System.out.println();
    }

    //metoda koja definiše kako se menjaju stat-ovi za Hydra-u kada pretrpi štetu tj. udarac
    //method that describes how heroes stats are changing when a hero is under attack
    @Override
    public void recieveHit() {
        if (this.isDead==false) {
            this.health -= 15;
            System.out.println("Hydra suffers damage!!!");
            this.mana += 10;
            this.isDead = this.health <= 0;
            show();
        }
    }

    //metoda koja definiše ponašanje kada Hydra upotrebi primarni udarac
    //method that describes the primary weapon attack
    @Override
    public void primaryFire() {
        if (this.isDead==false) {
            System.out.println("Hydra uses her jaws of fury!");
            this.mana -= 15;
            this.health += 5;
            show();
        }
    }

    //metoda koja definiše ponašanje kada Hydra upotrebi sekundarnu magiju
    //method that describes the primary magic attack
    @Override
    public void secondaryFire() {
        if (this.isDead==false) {
            System.out.println("Hydra uses her socks of death and destruction!");
            this.mana -= 20;
            this.health += 5;
            show();
        }
    }
    //metoda koja prikazuje podatke o trenutnom stanju statova Hydra-e
    //method that displays the current hero stats
    @Override
    public void show() {
        System.out.println("Hydra> Health: "+this.health+" Mana: "+this.mana+" is dead?: "+this.isDead);
    }
}

