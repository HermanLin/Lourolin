

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
	money = 1500;
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
    public void addFood( int input ) {
	food += input;
    }
    public void addAmmo( int input ) {
	ammo += input;
    }
    public void addWheels( int input ) {
	wheels += input;
    }
    public void addAxels( int input ) {
	axels += input;
    }
    public void addTongues( int input ) {
	tongues += input;
    }
    public void addMoney( int input ) {
	money += input;
    }

    public void subFood( int input ) {
	food -= input;
    }
    public void subAmmo( int input ) {
	ammo -= input;
    }
    public void subWheels( int input ) {
	wheels -= input;
    }
    public void subAxels( int input ) {
	axels -= input;
    }
    public void subTongues( int input ) {
	tongues -= input;
    }
    public void subMoney( int input ) {
	money -= input;
    }
}
