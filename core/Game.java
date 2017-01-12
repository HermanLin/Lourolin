import cs1.Keyboard;

public class Game {

    //===INSTANCE VARIABLES===
    private Player john;
    private Character member1;
    private Character member2;
    private Character member3;
    private Character member4;
    
    private String strName;
    private int difficulty;    
    private int milesTraveled;
    private int nextMiles;

    //===Main Game Loop===
    public void makeChars() {
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
    
    public void runGame() {
	while ( milesTraveled < 100 ) {

	    String choiceText = "";
	    choiceText += "1:\tContinue on the Trail\n";
	    choiceText += "2:\tCheck on supplies\n";
	    choiceText += "3:\tRest\n";
	    choiceText += "4:\tTry to trade with someone\n";
	    choiceText += "5:\tGo to the store\n";
	    System.out.println(choiceText);

	    if ( Keyboard.readInt() == 1 ) {
		milesTraveled += (int)(Math.random() * 15) + 5;
	    }
	    else if ( Keyboard.readInt() == 2 ) {
	    }
	    else if ( Keyboard.readInt() == 3 ) {
	    }
	    else if ( Keyboard.readInt() == 4 ) {
	    }
	    else if ( Keyboard.readInt() == 5 ) {
	    }
	    else {
		System.out.println( "Invalid input" );
	    }
	}
    }
}
