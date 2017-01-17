import cs1.Keyboard;

public class Game {

    //========================
    //===INSTANCE VARIABLES===
    //========================
    private String strName;
    private int difficulty;
    private int milesTraveled = 0;
    private int nextMiles;
    private int storeInt;
    private boolean storeBool;

    //=======================   
    //===MAIN GAME METHODS===
    //=======================

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
		System.out.println( Family.getSupplies() );
	    }
	    else if ( storeInt == 3 ) {
	    }
	    else if ( storeInt == 4 ) {
		Trade.trade();
	    }
	    else if ( storeInt == 5 ) {
	    }
	    else {
		System.out.println( "Invalid input" );
	    }
	}
    }
}
