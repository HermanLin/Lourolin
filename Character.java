

public class Character {

    //========================
    //===Instance Variables===
    //========================
    protected int HP;
    protected String name;
    protected int condition;


    //==================
    //===Constructors===
    //==================
    public Character() {
	HP = 100;
	condition = 0;
    }
    public Character(String x) {
	this();
	name = x;
    }

    //=============
    //===Methods===
    //=============
    public boolean isAlive() {
	return HP > 0;
    }
    public String getName() {
	return name;
    }
    public int getHP() {
	return HP;
    }
    public int getCondition() {
	return condition;
    }

    public void setName( String input ) {
	name = input;
    }
}
