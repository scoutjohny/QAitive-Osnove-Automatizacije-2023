public abstract class BaseHero {

    public double health, mana;
    public boolean isDead;

    //metoda za opis ponašanja kada heroj biva napadnut i trpi štetu koja je raspoređena na određenoj površini
    public void areaOfEffect(){
        recieveHit();
    }

    //abstraktna metoda za opis ponašanja kada heroj biva napadnut i trpi štetu
    public abstract void recieveHit();

    //abstraktna metoda za opis ponašanja kada heroj napada primarnim oružjem ili veštinom
    public abstract void primaryFire();

    //abstraktna metoda za opis ponašanja kada heroj napada sekindarnim oružjem ili veštinom
    public abstract void secondaryFire();

    public abstract void show();


}
