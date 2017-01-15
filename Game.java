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
		trade();
	    }
	    else if ( storeInt == 5 ) {
	    }
	    else {
		System.out.println( "Invalid input" );
	    }
	}
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      trade()
      post: Player decides whether to 
      trade or not with random person
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void trade() {
	System.out.println (Family.getSupplies());
	int itemIn = (int)(Math.random() * 6) + 1;
	int itemCheckIn = 0;
	int itemCheckOut = 0;
        int itemOut = (int)(Math.random() * 6) + 1;
	boolean canTrade = true;
	String choiceTrade = "";
	choiceTrade += "You meet another immigrant who wants ";

	if (itemIn == 5) {
	    itemCheckIn = (int)((Math.random() * 3) + 1);
	    choiceTrade += itemCheckIn + " tongues.\n";
	    if (Family.john.getTongues() < itemCheckIn){
		choiceTrade += "You don't have this.\n";
		canTrade = false;
	    }
	}
	else if (itemIn == 4){
	    itemCheckIn = (int)((Math.random() * 3) + 1);
	    choiceTrade += itemCheckIn + " axels.\n";
	    if (Family.john.getAxels() < itemCheckIn){
	        choiceTrade += "You don't have this.\n";
		canTrade = false;
	    }
	}
	else if (itemIn == 3){
	    itemCheckIn = (int)((Math.random() * 3) + 1);
	    choiceTrade += itemCheckIn + " wheels.\n";
	    if (Family.john.getWheels() < itemCheckIn){
	        choiceTrade += "You don't have this.\n";
		canTrade = false;
	    }
	}
        else if (itemIn == 2){
	    itemCheckIn = (int)((Math.random() * 100) + 1);
	    choiceTrade += itemCheckIn + " bullets.\n";
	    if (Family.john.getAmmo() < itemCheckIn){
	        choiceTrade += "You don't have this.\n";
		canTrade = false;
	    }
	}
        else if (itemIn <= 1){
	    itemCheckIn = (int)((Math.random() * 1000) + 1);
	    choiceTrade += itemCheckIn + " pounds of food.\n";
	    if (Family.john.getFood() < itemCheckIn){
	        choiceTrade += "You don't have this.\n";
		canTrade = false;
	    }
	}
	
	if (canTrade) {
	    choiceTrade += "The immigrant is willing to trade you ";
	    if (itemOut == 5) {
		itemCheckOut = (int)((Math.random() * 2) + 1);
		choiceTrade += itemCheckOut + " tongues.\n";
	    }
	    else if (itemOut == 4){
		itemCheckOut = (int)((Math.random() * 2) + 1);
		choiceTrade += itemCheckOut + " axels.\n";
	    }
	    else if (itemOut == 3){
		itemCheckOut = (int)((Math.random() * 2) + 1);
		choiceTrade += itemCheckOut + " wheels.\n";
	    }
	    else if (itemOut == 2){
		itemCheckOut = (int)((Math.random() * 75) + 1);
		choiceTrade += itemCheckOut + " bullets.\n";
	    }
	    else if (itemOut <= 1){
		itemCheckOut = (int)((Math.random() * 500) + 1);
		choiceTrade += itemCheckOut + " pounds of food.\n";
	    }	    
	}
	    System.out.println (choiceTrade);

	    if (canTrade) {
		System.out.println ("Are you willing to trade? ");
		String decision = Keyboard.readString();
		if (decision.substring(0,1).equals("n"))
		    return;
		else {
		    if (itemIn == 1) Family.john.subFood(itemCheckIn);
		    else if (itemIn == 2) Family.john.subAmmo(itemCheckIn);
		    else if (itemIn == 3) Family.john.subWheels(itemCheckIn);
		    else if (itemIn == 4) Family.john.subAxels(itemCheckIn);
		    else if (itemIn == 5) Family.john.subTongues(itemCheckIn);

		    if (itemOut == 1) Family.john.addFood(itemCheckOut);
		    else if (itemOut == 2) Family.john.addAmmo(itemCheckOut);
		    else if (itemOut == 3) Family.john.addWheels(itemCheckOut);
		    else if (itemOut == 4) Family.john.addAxels(itemCheckOut);
		    else if (itemOut == 5) Family.john.addTongues(itemCheckOut);
		}
	    }
    }
}
