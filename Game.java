import cs1.Keyboard;

public class Game {

    //========================
    //===INSTANCE VARIABLES===
    //========================
    private String strName;
    private int difficulty;
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

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      chooseStartMonth
      post: sets starting month of the game
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void chooseStartMonth() {
	String monthChoose = "It is 1848. Your jumping off place for Oregon is Independence, Missouri. You must decide which month to leave Independence.\n\n";
	monthChoose += "1.\tMarch\n";
	monthChoose += "2.\tApril\n";
	monthChoose += "3.\tMay\n";
	monthChoose += "4.\tJune\n";
	monthChoose += "5.\tJuly\n";
	monthChoose += "6.\tAsk for advice\n\n";

	monthChoose += "What is your choice? ";
	System.out.print (monthChoose);

	int answer = Keyboard.readInt();
	if (answer > 6 || answer < 1)
	    System.out.println ("Out of range, please pick a month or choice #s 1 - 6.");
	if (answer == 6){
	    System.out.println ("You attend a public meeting held for ''folks with the California - Oregon fever.'' You're told:\n\n" + "If you leave too early, there won't be any grass for your oxen to eat. If you leave too late, you may not get to Oregon before winter comes. If you leave at just the right time, there will be green grass and the weather will still be cool.\n");
	    chooseStartMonth();
	    return;
	}
	setMonth(answer);
    }

    public void setMonth(int x) {
	currentMonth = x;
    }

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
	while ( Travel.getMilesTraveled() < 830 ) {

	    String choiceText = "";
	    choiceText += "Miles Traveled: " + Travel.getMilesTraveled() + "\n";
	    choiceText += "Next Landmark: " + Travel.nextDestination() + "\n";
	    choiceText += "Miles till Landmark: " + Travel.getNextMiles() + "\n";
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
		Travel.travelTrail();
		Travel.runGameChecks();
	    }
	    else if ( storeInt == 2 ) {
		System.out.println( Family.getSupplies() );
	    }
	    else if ( storeInt == 3 ) {
		System.out.println( Family.getHealth() );
	    }
	    else if ( storeInt == 4 ) {
		rest();
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

    private void rest() {       
	if (Family.john.isAlive()) {
	    Family.john.subFood(1);
	    Family.john.addHP(5);
	    if (Family.john.getHP() > 100)
		Family.john.setHP(100);
	}
	if (Family.member1.isAlive()) {
	    Family.john.subFood(1);
	    Family.member1.addHP(5);
	    if (Family.member1.getHP() > 100)
		Family.member1.setHP(100);
	    Travel.becomeHealed(Family.member1);
	}
	if (Family.member2.isAlive()) {
	    Family.john.subFood(1);
	    Family.member2.addHP(5);
	    if (Family.member2.getHP() > 100)
		Family.member2.setHP(100);
	    Travel.becomeHealed(Family.member2);
	}
	if (Family.member3.isAlive()) {
	    Family.john.subFood(1);
	    Family.member3.addHP(5);
	    if (Family.member3.getHP() > 100)
		Family.member3.setHP(100);
	    Travel.becomeHealed(Family.member3);
	}
	if (Family.member4.isAlive()) {
	    Family.john.subFood(1);
	    Family.member4.addHP(5);
	    if (Family.member4.getHP() > 100)
		Family.member4.setHP(100);
	    Travel.becomeHealed(Family.member4);
	}
    }
}
