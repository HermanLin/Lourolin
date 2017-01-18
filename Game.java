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
    private int currentMonth;
    private int currentDate;

    public void setupMonths() {
	Month January = new Month( 31, 1 );
	Month February = new Month( 28, 2 );
	Month March = new Month( 31, 3 );
	Month April = new Month( 30, 4 );
	Month May = new Month( 31, 5 );
	Month June = new Month( 30, 6 );
	Month July = new Month( 31, 7 );
	Month August = new Month( 31, 8 );
	Month September = new Month( 30, 9 );
	Month October = new Month( 31, 10 );
	Month November = new Month( 30, 11 );
	Month December = new Month( 31, 12 );
    }

    public void chooseStartMonth() {
    }


    private String[] _disease = {"exhaustion", "cholera", "dysntery", "measles", "typhoid", "fever"};

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
	    
	    if( diffChoice > 0 && diffChoice < 4 ) {
		if( diffChoice == 1 ) {
		    Family.john.setMoney(250);
		} else if( diffChoice == 2 ) {
		    Family.john.setMoney(200);
		} else {
		    Family.john.setMoney(150);
		}
		diffBool = false;
	    } else {
		System.out.println( "Invalid input. Please enter a number from 1-3" );
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
	    choiceText += "3:\tCheck on the family\n";
	    choiceText += "4:\tRest\n";
	    choiceText += "5:\tTry to trade with someone\n";
	    choiceText += "6:\tGo to the store\n";
	    System.out.println(choiceText);

	    storeInt = Keyboard.readInt();
	    
	    if ( storeInt == 1 ) {
		milesTraveled += (int)(Math.random() * 15) + 5;
		int random = (int)( Math.random() * 4 ) + 1;
		if (random == 1)
		    becomeSick( Family.member1 );
		else if (random == 2)
		    becomeSick( Family.member2 );
		else if (random == 3)
		    becomeSick( Family.member3 );
		else if (random == 4)
		    becomeSick( Family.member4 );
	    }
	    else if ( storeInt == 2 ) {
		System.out.println( Family.getSupplies() );
	    }
	    else if ( storeInt == 3 ) {
		System.out.println( Family.getHealth() );
	    }
	    else if ( storeInt == 4 ) {
	    }
	    else if ( storeInt == 5 ) {
		Trade.trade();
	    }
	    else if ( storeInt == 6 ) {
	    }
	    else {
		System.out.println( "Invalid input" );
	    }
	}
    }

    private void becomeSick( Character character ) {
	int rand = (int)( Math.random() * 100 ) + 1;
	int randCond = (int)( Math.random() * 6 );
	int randHeal = (int)( Math.random() * 100 ) + 1;
	if ( character.getCondition() == 0 ) {
	    if ( rand >= 95 ) {
		character.setCondition( randCond );
		System.out.println( character.getName() + " has " + _disease[randCond] );
	    }
	}
	else {
	    if (randHeal >= 80) {     
		System.out.println( character.getName() + " no longer has " + _disease[character.getCondition()] );
		character.setCondition(0);
	    }
	}				    
    }
}
