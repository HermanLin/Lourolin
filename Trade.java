/*|||||||||||||||||||||||||||||||||||||
  TRADE CLASS
  Contains variables and methods that 
  allows the player to trade with other
  emigrants along the trail
  |||||||||||||||||||||||||||||||||||*/

import cs1.Keyboard;

public class Trade {

    //========================
    //===INSTANCE VARIABLES===
    //========================
    private static int itemIn;
    private static int itemOut;
    private static int emigrantWant;
    private static int emigrantTake;
    private static boolean canTrade;
    private static boolean trading;
    private static String tradeText;    

    //=============
    //===METHODS===
    //=============

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      diffNum
      pre: takes a number x
      post: returns a number different from x
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static int diffNum( int x ) {
	int rand = (int)( Math.random() * 5 ) + 1;
	while ( rand == x ) {
	    rand = (int)( Math.random() * 5 ) + 1;
	}
	return rand;
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~
      trade
      post: runs the trade blurb
      ~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void trade() {
	itemIn = (int)( Math.random() * 5 ) + 1;
	itemOut = diffNum( itemIn );
	emigrantWant = 0;
	emigrantTake = 0;
	canTrade = true;
	tradeText = "An emmigrant wants ";

	//randomizes what the emigrant wants from the player
	System.out.println( Family.getSupplies() );
	if (itemIn == 5) {
	    emigrantWant = (int)((Math.random() * 3) + 1);
	    tradeText += emigrantWant + " tongues.\n";
	    if (Family.john.getTongues() < emigrantWant){
		canTrade = false;
	    }
	}
	else if (itemIn == 4){
	    emigrantWant = (int)((Math.random() * 3) + 1);
	    tradeText += emigrantWant + " axles.\n";
	    if (Family.john.getAxles() < emigrantWant){
		canTrade = false;
	    }
	}
	else if (itemIn == 3){
	    emigrantWant = (int)((Math.random() * 3) + 1);
	    tradeText += emigrantWant + " wheels.\n";
	    if (Family.john.getWheels() < emigrantWant){
		canTrade = false;
	    }
	}
        else if (itemIn == 2){
	    emigrantWant = (int)((Math.random() * 80) + 1);
	    tradeText += emigrantWant + " bullets.\n";
	    if (Family.john.getAmmo() < emigrantWant){
		canTrade = false;
	    }
	}
        else if (itemIn <= 1){
	    emigrantWant = (int)((Math.random() * 150) + 1);
	    tradeText += emigrantWant + " pounds of food.\n";
	    if (Family.john.getFood() < emigrantWant){
		canTrade = false;
	    }
	}

	//if the player has what the emigrant wants, the emigrant
	//will offer something in return
	if (canTrade) {
	    tradeText += "The emigrant is willing to trade you ";
	    if (itemOut == 5) {
		emigrantTake = (int)((Math.random() * 2) + 1);
		tradeText += emigrantTake + " tongues.\n";
	    }
	    else if (itemOut == 4){
		emigrantTake = (int)((Math.random() * 2) + 1);
		tradeText += emigrantTake + " axels.\n";
	    }
	    else if (itemOut == 3){
		emigrantTake = (int)((Math.random() * 2) + 1);
		tradeText += emigrantTake + " wheels.\n";
	    }
	    else if (itemOut == 2){
		emigrantTake = (int)((Math.random() * 75) + 1);
		tradeText += emigrantTake + " bullets.\n";
	    }
	    else if (itemOut <= 1){
		emigrantTake = (int)((Math.random() * 250) + 1);
		tradeText += emigrantTake + " pounds of food.\n";
	    }	    
	}
	System.out.println (tradeText);

	//initiates trading
	trading = true;
	while ( trading ) {
	    if (canTrade) {
		System.out.println ("Are you willing to trade? ");
		String decision = Keyboard.readString();

		//if the player doesnt want to trade...
		if (decision.equals( "no" )) {
		    trading = false;
		    return;
		}
		
		//if the player wants to trade...
		else if (decision.equals( "yes" )) {
		    if (itemIn == 1) Family.john.subFood(emigrantWant);
		    else if (itemIn == 2) Family.john.subAmmo(emigrantWant);
		    else if (itemIn == 3) Family.john.subWheels(emigrantWant);
		    else if (itemIn == 4) Family.john.subAxles(emigrantWant);
		    else if (itemIn == 5) Family.john.subTongues(emigrantWant);

		    if (itemOut == 1) Family.john.addFood(emigrantTake);
		    else if (itemOut == 2) Family.john.addAmmo(emigrantTake);
		    else if (itemOut == 3) Family.john.addWheels(emigrantTake);
		    else if (itemOut == 4) Family.john.addAxles(emigrantTake);
		    else if (itemOut == 5) Family.john.addTongues(emigrantTake);

		    trading = false;
		}
		else { System.out.println( "Invalid input" ); }
	    }

	    //if the player doesnt have what the emigrant wants...
	    else {
		System.out.println( "You do not have enough supplies" );
		trading = false;
	    }
	}
    }
}
