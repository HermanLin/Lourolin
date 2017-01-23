/*|||||||||||||||||||||||||||||||||||||||||
  SUPPLIES CLASS
  Contains methods for supply buying at the
  start of the game
  |||||||||||||||||||||||||||||||||||||||*/

import cs1.Keyboard;

public class Supplies {

    //========================
    //===INSTANCE VARIABLES===   
    //========================
    private static boolean storeBool;
    private static int storeInt = 0;    

    //=============
    //===METHODS===
    //=============

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      chooseSupplies
      post: runs the choosing supplies blurb
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void chooseSupplies() {	 	 
	System.out.println( "In order to make it to Oregon City, you'll need supplies" );
	System.out.print( "\nYou head to a store nearby to gather some necessities..." );
	String initStore = "";
	initStore += "\nWelcome to the General Store! What would you like to buy?\n";
	initStore += "\n" + Family.getSupplies() + "\n";
	initStore += "Amount of Money Left:\t" + Family.john.getMoney() + "\n";
	initStore += "1:\tFood\n";
	initStore += "2:\tAmmunition\n";	    
	initStore += "3:\tWheels\n";
	initStore += "4:\tAxles\n";
	initStore += "5:\tTongues\n";
	initStore += "6:\tLeave the store";
	
	storeBool = true;
	while ( storeBool == true ) {
	    System.out.println( initStore );
	    storeInt = Keyboard.readInt();
	    if ( storeInt == 1 ) { buyFood(); }
	    else if ( storeInt == 2 ) { buyAmmo(); }
	    else if ( storeInt == 3 ) { buyWheels(); }
	    else if ( storeInt == 4 ) {	buyAxles(); }
	    else if ( storeInt == 5 ) {	buyTongues(); }
	    else if ( storeInt == 6 ) { storeBool = false; }
	    else { System.out.println( "Invalid input" ); }
	}
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      buyFood
      post: runs the buying food prompt
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void buyFood() {
	System.out.println( "Food goes for $1 per parcel. 1 parcel contains 10 pounds of food" );
	System.out.println( "How many parcels would you like to buy?" );
        storeInt = Keyboard.readInt();
	if ( ( storeInt >= 0 ) && ( storeInt <= Family.john.getMoney() ) ) {
	    Family.john.addFood( storeInt * 10 );
	    Family.john.subMoney( storeInt );
	    System.out.println( storeInt + " parcels bought" );
	}
	else if ( storeInt < 0 ) System.out.println( "You can't buy a negative number of items" );	    
	else if ( storeInt > Family.john.getMoney() ) System.out.println( "Not enough money" );	 
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      buyAmmo
      post: runs the buying ammo prompt
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void buyAmmo() {	
	System.out.println( "Ammo goes for $2 per box of bullets. 1 box contains 20 bullets" );
	System.out.println( "How many boxes would you like to buy?" );
	storeInt = Keyboard.readInt();
	if ( ( storeInt >= 0 ) && ( storeInt*2 <= Family.john.getMoney() ) ) {
	    Family.john.addAmmo( storeInt * 20 );
	    Family.john.subMoney( storeInt * 2 );
	    System.out.println( storeInt + " boxes of ammunition bought" );	    
	}
	else if ( storeInt < 0 ) System.out.println( "You can't buy a negative number of items" );	    
	else if ( storeInt*2 > Family.john.getMoney() ) System.out.println( "Not enough money" );	 
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      buyWheels
      post: runs the buying wheels prompt
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void buyWheels() {
	System.out.println( "Wheels go for $10 each" );
	System.out.println( "How many wheels would you like to buy?" );
	storeInt = Keyboard.readInt();
	if ( ( storeInt >= 0 ) && ( storeInt*10 <= Family.john.getMoney() ) ) {
	    Family.john.addWheels( storeInt );
	    Family.john.subMoney( storeInt * 10 );
	    System.out.println( storeInt + " wheels bought" );
	}
	else if ( storeInt < 0 ) System.out.println( "You can't buy a negative number of items" );	    
	else if ( storeInt*10 > Family.john.getMoney() ) System.out.println( "Not enough money" );	 
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      buyAxles
      post: runs the buying axles prompt
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void buyAxles() {
	System.out.println( "Axles go for $12 each" );
	System.out.println( "How many axels would you like to buy?" );
	storeInt = Keyboard.readInt();
	if ( ( storeInt >= 0 ) && ( storeInt*12 <= Family.john.getMoney() ) ) {
	    Family.john.addAxles( storeInt );
	    Family.john.subMoney( storeInt * 12 );
	    System.out.println( storeInt + " axles bought" );
	}
	else if ( storeInt < 0 ) System.out.println( "You can't buy a negative number of items" );	    
	else if ( storeInt*12 > Family.john.getMoney() ) System.out.println( "Not enough money" );	 
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      buyTongues
      post: runs the buying tongues prompt
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void buyTongues() {
	System.out.println( "Tongues go for $8 each" );
	System.out.println( "How many tongues would you like to buy?" );
	storeInt = Keyboard.readInt();
	if ( ( storeInt >= 0 ) && ( storeInt*8 <= Family.john.getMoney() ) ) {
	    Family.john.addTongues( storeInt );
	    Family.john.subMoney( storeInt * 8 );
	    System.out.println( storeInt + " tongues bought" );
	}
	else if ( storeInt < 0 ) System.out.println( "You can't buy a negative number of items" );
	else if ( storeInt*8 > Family.john.getMoney() ) System.out.println( "Not enough money" );
    }
}
