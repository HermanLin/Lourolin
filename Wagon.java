import cs1.Keyboard;

public class Wagon {

    private static boolean wheelBroke = false;
    private static boolean axleBroke = false;
    private static boolean tongueBroke = false;
    private static int storeInt; 

    public static void wagonBreak() {
	int rand = (int)(Math.random() * 100) + 1;
	int randPart = (int)(Math.random() * 3) + 1;
	if (rand >= 95) {
	    if (randPart == 1) {
		if (Family.john.getWheels() > 0) {
		    Family.john.subWheels(1);
		    System.out.println("A wheel broke, but you replaced it with a spare");
		}
		else {
		    System.out.println("A wheel broke, but you have no spare wheels");
		    wheelBroke = true;
		}
	    }
	    if (randPart == 2) {
		if (Family.john.getAxles() > 0) {
		    Family.john.subAxles(1);
		    System.out.println("An axle broke, but you replaced it with a spare");
		}
		else {
		    System.out.println("An axle broke, but you have no spare axles");
		    axleBroke = true;		    
		}
	    }
	    if (randPart == 3) {
		if (Family.john.getTongues() > 0) {
		    Family.john.subTongues(1);
		    System.out.println("The tongue broke, but you replaced it with a spare");
		}
		else {
		    System.out.println("The tongue broke, but you have no spare tongues");
		    axleBroke = true;
		}
	    }
	}
    }

    public static void wagonFix() {
	if ((Family.john.getWheels() > 0) &&
	    (Family.john.getAxles() > 0) &&
	    (Family.john.getTongues() > 0)) {
	    wheelBroke = false;
	    axleBroke = false;
	    tongueBroke = false;
	}
    }

    public static void wagonCheck() {
	while (wheelBroke || axleBroke || tongueBroke) {
	    if (wheelBroke)
		System.out.println("You need a wheel to continue");
	    if  (axleBroke)
		System.out.println("You need an axle to continue");
	    if (tongueBroke)
		System.out.println("You need a tongue to continue");

	    String choiceText = "";
	    choiceText += "\nWhat would you like to do?\n";
	    choiceText += "1:\tCheck on supplies\n";
	    choiceText += "2:\tCheck on the family\n";
	    choiceText += "3:\tRest\n";
	    choiceText += "4:\tTry to trade with someone\n";
	    System.out.println(choiceText);

	    storeInt = Keyboard.readInt();
	    if ( storeInt == 1 ) {
		System.out.println( Family.getSupplies() );
	    }
	    else if ( storeInt == 2 ) {
		System.out.println( Family.getHealth() );
	    }
	    else if ( storeInt == 3 ) {
		Game.rest();
	    }
	    else if ( storeInt == 4 ) {
		Trade.trade();
	    }
	    else {
		System.out.println( "Invalid input" );
	    }
	    
	    wagonFix();
	}
    }
}
