import cs1.Keyboard;

public class Supplies {

    private static boolean storeBool;
    private static int storeInt = 0;
    private static int storeTotal = 0;
    
    public static void chooseSupplies() {	 	 
	System.out.println( "In order to make it to Oregon City, you'll need supplies" );
	System.out.print( "\nYou head to a store nearby to gather some necessities..." );
	
	String initStore = "";
	initStore += "Welcome to the General Store! What would you like to buy?\n";
	initStore += "\n" + Family.getSupplies() + "\n";
	initStore += "Amount of Money Left:\t" + Family.john.getMoney() + "\n";
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
		buyFood();
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

    public static void buyFood() {
	System.out.println( "Food goes for $1 per parcel. 1 parcel contains 10 pounds of food" );
	System.out.println( "How many parcels would you like to buy?" );
        storeInt = Keyboard.readInt();
	//if ( ( storeInt >= 0 ) && ( storeInt <= Family.john.getMoney() ) ) {}
    }

    public static void buyAmmo() {

    }

    public static void buyWheels() {

    }

    public static void buyAxels() {

    }

    public static void buyTongues() {

    }
}
