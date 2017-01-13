

public class Player extends Character {

    //========================
    //===Instance Variables===
    //========================
    private int food;
    private int ammo;
    private int wheels;
    private int axels;
    private int tongues;
    private int money;

    //==================
    //===Constructors===
    //==================
    public Player(String x) {
	name = x;
	HP = 100;
	condition = 0;
	money = 1600;
    }

    //======================
    //===Accessor Methods===
    //======================
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
    
    //=====================
    //===Mutator Methods===
    //=====================
    public void setFood( int input ) {
	food = input;
    }
    public void setAmmo( int input ) {
	ammo = input;
    }
    public void setWheels( int input ) {
	wheels = input;
    }
    public void setAxels( int input ) {
	axels = input;
    }
    public void setTongues( int input ) {
	tongues = input;
    }
    public void setMoney( int input ) {
	money = input;
    }
}
