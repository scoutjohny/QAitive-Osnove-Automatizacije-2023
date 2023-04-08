public abstract class BaseHero {

    public double health, mana;
    public boolean isDead;

    //metoda za opis ponašanja kada heroj biva napadnut i trpi štetu koja je raspoređena na određenoj površini
    //method that describes what happens when a hero is under attack with area of effect
    public void areaOfEffect(){
        recieveHit();
    }

    //abstraktna metoda za opis ponašanja kada heroj biva napadnut i trpi štetu
    //abstract method that describes what happens when a hero is under attack
    public abstract void recieveHit();

    //abstraktna metoda za opis ponašanja kada heroj napada primarnim oružjem ili veštinom
    //abstract method that describes the primary weapon attack
    public abstract void primaryFire();

    //abstraktna metoda za opis ponašanja kada heroj napada sekindarnim oružjem ili veštinom
    //abstract method that describes the secondary weapon attack
    public abstract void secondaryFire();

    //abstraktna metoda koja ispisuje trenutne parametre heroja
    //abstract method that displays the hero stats
    public abstract void show();


}
