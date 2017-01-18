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
      setDifficulty
      post: sets difficulty, which affects starting money
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setDifficulty() {
	boolean diffBool = true;
	int diffChoice;
	String diffText = "Many kinds of people made the trip to Oregon.\n\nYou may:\n\n";
	diffText += "1.\t Be a banker from Boston\n";
	diffText += "2.\t Be a carpenter from Ohio\n";
	diffText += "3.\t Be a farmer from Illinois\n";
	while( diffBool == true ) {
	    System.out.println( diffText );
	    
	    diffChoice = Keyboard.readInt();
	    
	    if( diffChoice > 0 && diffChoice > 4 ) {
		if( diffChoice == 1 ) {
		    Family.john.setMoney(150);
		} else if( diffChoice == 2 ) {
		    Family.john.setMoney(200);
		} else {
		    Family.john.setMoney(250);
		}
		diffBool = false;
	    } else {
		System.out.println( "Invalid input. Please enter a number from 1-4" );
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
