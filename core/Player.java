public class Player extends Character {
    
    //===Instance Variables===
    private int food;
    private int ammo;
    private int wheels;
    private int axels;
    private int tongues;
    private int money;

    //===Constructors===
    public Player(String x) {
	name = x;
	HP = 100;
	condition = 0;
    }

    //===Methods===
    public int getFood() {
	return food;
    }
    public int getAmmo() {
	return ammo;
    }
    public int getWheels() {
	return wheels;
    }
    public int getAxels() {
	return axels;
    }
    public int getTongues() {
	return tongues;
    }
    public int getMoney() {
	return money;
    }
}
