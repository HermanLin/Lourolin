import cs1.Keyboard;

public class Family {

    protected static Player john;
    protected static Character member1;
    protected static Character member2;
    protected static Character member3;
    protected static Character member4;

    private static String strName;
	
    public static void makeChars() {
	boolean charBool = true;
	String procede;

	john = new Player();
	member1 = new Character();
	member2 = new Character();
	member3 = new Character();
	member4 = new Character();

	while( charBool == true ) {    
	
	    //Player creation
	    System.out.println( "What is the name of the wagon leader? " );
	    strName = Keyboard.readString();
	    john.setName(strName);

	    //Member1 creation
	    System.out.println( "What is the name of your first family member? " );
	    strName = Keyboard.readString();
	    member1.setName(strName);

	    //Member2 creation
	    System.out.println( "What is the name of your second family member? " );
	    strName = Keyboard.readString();
	    member2.setName(strName);

	    //Member3 creation
	    System.out.println( "What is the name of your third family member? " );
	    strName = Keyboard.readString();
	    member3.setName(strName);

	    //Member4 creation
	    System.out.println( "What is the name of your fourth family member? " );
	    strName = Keyboard.readString();
	    member4.setName(strName);

	    String outputChars = "";
	    outputChars += "These are the names you chose:\n";
	    outputChars += "1:\t" + john.getName() + "\n";
	    outputChars += "2:\t" + member1.getName() + "\n";
	    outputChars += "3:\t" + member2.getName() + "\n";
	    outputChars += "4:\t" + member3.getName() + "\n";
	    outputChars += "5:\t" + member4.getName() + "\n";
	    outputChars += "\nProcede?\n";
	    System.out.println(outputChars);

	    procede = Keyboard.readString();

	    while( procede.equals( "yes" ) != true && procede.equals( "no" ) != true ) {
		System.out.println( "Invalid input. Please enter 'yes' or 'no'\n" );
		System.out.println(outputChars);
		
		procede = Keyboard.readString();
	    }
	    if( procede.equals( "yes" ) ) {
		charBool = false;
	    } else {
	    }
	}
    }

    public static String getSupplies() {
	String retStr = "";
	retStr += "Food:\t\t" + john.getFood() + " pounds\n";
	retStr += "Ammunition:\t" + john.getAmmo() + " bullets\n";
	retStr += "Wheels:\t\t" + john.getWheels() + " wheels\n";
	retStr += "Axles:\t\t" + john.getAxles() + " axles\n";
	retStr += "Tongues:\t" + john.getTongues() + " tongues\n";
	retStr += "Money:\t\t" + john.getMoney() + " dollars\n";
	return retStr;
    }

    public static String getHealth() {
	String retStr = "";
	retStr += john.getName() + " :: HP = " + john.getHP() + "\n";
	retStr += member1.getName() + " :: HP = " + member1.getHP() + ", Condition = " + member1.getCondition() + "\n";
	retStr += member2.getName() + " :: HP = " + member2.getHP() + ", Condition = " + member2.getCondition() + "\n";
	retStr += member3.getName() + " :: HP = " + member3.getHP() + ", Condition = " + member3.getCondition() + "\n";
	retStr += member4.getName() + " :: HP = " + member4.getHP() + ", Condition = " + member4.getCondition() + "\n";	
	return retStr;
    }
}
