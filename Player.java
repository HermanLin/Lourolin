public class Player extends Character {

    //========================
    //===Instance Variables===
    //========================
    private int food;
    private int ammo;
    private int wheels;
    private int axles;
    private int tongues;
    private int money;
    private int difficulty;

    //==================
    //===Constructors===
    //==================
    public Player() {
	HP = 100;
	condition = 0;
        if( difficulty == 1 ) {
	    money = 250;
	} else if( difficulty == 2 ) {
	    money = 200;
	} else {
	    money = 150;
	}
    }
    public Player(String x) {
	this();
	name = x;        
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
    public int getAxles() {
	return axles;
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
    public void addAxles( int input ) {
	axles += input;
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
    public void subAxles( int input ) {
	axles -= input;
    }
    public void subTongues( int input ) {
	tongues -= input;
    }
    public void subMoney( int input ) {
	money -= input;
    }

    public void setName( String input ) {
	name = input;
    }
    public void setMoney( int input ) {
	money = input;
    }
}
