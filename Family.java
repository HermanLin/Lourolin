import cs1.Keyboard;

public class Family {

    protected static Player john;
    protected static Character member1;
    protected static Character member2;
    protected static Character member3;
    protected static Character member4;

    private static String strName;
    
    public static void makeChars() {
	//Player creation
	System.out.println( "What is the name of the wagon leader? " );
	strName = Keyboard.readString();
	john = new Player(strName);

	//Member1 creation
	System.out.println( "What is the name of your first family member? " );
	strName = Keyboard.readString();
	member1 = new Character(strName);

	//Member2 creation
	System.out.println( "What is the name of your second family member? " );
	strName = Keyboard.readString();
   	member2 = new Character(strName);

	//Member3 creation
	System.out.println( "What is the name of your third family member? " );
	strName = Keyboard.readString();
	member3 = new Character(strName);

	//Member4 creation
	System.out.println( "What is the name of your fourth family member? " );
	strName = Keyboard.readString();
	member4 = new Character(strName);

	String outputChars = "";
	outputChars += "These are the names you chose:\n";
	outputChars += "1:\t" + john.getName() + "\n";
	outputChars += "2:\t" + member1.getName() + "\n";
	outputChars += "3:\t" + member2.getName() + "\n";
	outputChars += "4:\t" + member3.getName() + "\n";
	outputChars += "5:\t" + member4.getName() + "\n";
	System.out.println(outputChars);
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
    
}
