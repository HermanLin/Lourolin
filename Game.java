import cs1.Keyboard;

public class Game {

    //========================
    //===INSTANCE VARIABLES===
    //========================
    private Player john;
    private Character member1;
    private Character member2;
    private Character member3;
    private Character member4;
    
    private String strName;
    private int difficulty;
    private int milesTraveled = 0;
    private int nextMiles;
    private int storeInt;
    private boolean storeBool;

    //=======================   
    //===MAIN GAME METHODS===
    //=======================

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     makeChars
     post: creates characters based on player-inputted names
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
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

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     chooseSupplies
     post: sets the Player's supplies to whatever they bought
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void chooseSupplies() {
	System.out.println( "In order to make it to Oregon City, you'll need supplies" );
	System.out.print( "\nYou head to a store nearby to gather some necessities\n" );
	
	String initStore = "";
	initStore += "Welcome to the General Store! What would you like to buy?\n";
	initStore += "1:\tFood\n";
	initStore += "2:\tAmmunition\n";	    
	initStore += "3:\tWheels\n";
	initStore += "4:\tAxels\n";
	initStore += "5:\tTongues\n";
	initStore += "\n6:\tLeave the store";	

	storeBool = true;
	while ( storeBool == true ) {
	    System.out.println( initStore );
	    storeInt = Keyboard.readInt();
	    if ( storeInt == 1 ) {
	    }
	    else if ( storeInt == 2 ) {
	    }
	    else if ( storeInt == 3 ) {
	    }
	    else if ( storeInt == 4 ) {
	    }
	    else if ( storeInt == 5 ) {
	    }
	    else if ( storeInt == 6 ) {
	        storeBool = false;
	    }
	    else {
		System.out.println( "Invalid input" );
	    }
	}
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      runGame
      post: runs the main game loop
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void runGame() {
	while ( milesTraveled < 100 ) {

	    String choiceText = "";
	    choiceText += "Miles Traveled: " + milesTraveled;
	    choiceText += "\nWhat would you like to do?\n";
	    choiceText += "1:\tContinue on the Trail\n";
	    choiceText += "2:\tCheck on supplies\n";
	    choiceText += "3:\tRest\n";
	    choiceText += "4:\tTry to trade with someone\n";
	    choiceText += "5:\tGo to the store\n";
	    System.out.println(choiceText);

	    storeInt = Keyboard.readInt();
	    
	    if ( storeInt == 1 ) {
		milesTraveled += (int)(Math.random() * 15) + 5;
	    }
	    else if ( storeInt == 2 ) {
	    }
	    else if ( storeInt == 3 ) {
	    }
	    else if ( storeInt == 4 ) {
	    }
	    else if ( storeInt == 5 ) {
	    }
	    else {
		System.out.println( "Invalid input" );
	    }
	}
    }
}
