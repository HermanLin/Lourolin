/*||||||||||||||||||||||||||||||||||||||
  STORE CLASS
  Allows for the creation of objects of
  type Store
  Contains methods for stores only found
  in towns. The stores are able to have 
  different prices as allowed by the 
  constructors
  ||||||||||||||||||||||||||||||||||||*/

import cs1.Keyboard;

public class Store {

    //========================
    //===INSTANCE VARIABLES===
    //========================
    private static int foodP;
    private static int ammoP;
    private static int wheelsP;
    private static int axlesP;
    private static int tonguesP;
    private static int answer;
    private static int storeInt;
    private static boolean storeBool;

    //==================
    //===CONSTRUCTORS===
    //==================
    public Store(int f, int a, int w, int ax, int t) {
	foodP = f;
	ammoP = a;
	wheelsP = w;
	axlesP = ax;
	tonguesP = t;
    }

    //=============
    //===METHODS===
    //=============

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      enterStore
      post: runs the store methods when in towns
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void enterStore() {
	storeBool = true;
	while (storeBool) {
	    String gameStore = "";
	    gameStore += "\nWelcome to the General Store! What would you like to buy?\n";
	    gameStore += "\n" + Family.getSupplies() + "\n";
	    gameStore += "Amount of Money Left:\t" + Family.john.getMoney() + "\n";
	    gameStore += "1:\tFood\n";
	    gameStore += "2:\tAmmunition\n";	    
	    gameStore += "3:\tWheels\n";
	    gameStore += "4:\tAxles\n";
	    gameStore += "5:\tTongues\n";
	    gameStore += "6:\tLeave the store";
	    System.out.println( gameStore );
	    
	    answer = Keyboard.readInt();	    
	    if (answer == 1) buyFood();	    
	    else if (answer == 2) buyAmmo();
	    else if (answer == 3) buyWheels();
	    else if (answer == 4) buyAxles();
	    else if (answer == 5) buyTongues();
	    else if (answer == 6) storeBool = false;
	    else System.out.println( "Invalid answer" );
	}
	return;
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      buyFood
      post: runs the buying food prompt
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void buyFood() {
	System.out.println( "Food goes for $" + foodP + " per parcel. 1 parcel contains 10 pounds of food" );
	System.out.println( "How many parcels would you like to buy?" );
        storeInt = Keyboard.readInt();
	if ( ( storeInt >= 0 ) && ( (storeInt * foodP) <= Family.john.getMoney() ) ) {
	    Family.john.addFood( storeInt * 10 );
	    Family.john.subMoney( storeInt * foodP );
	    System.out.println( storeInt + " parcels bought" );
	}
	else if ( storeInt < 0 ) System.out.println("You can't buy a negative number of items");	    
	else if ( (storeInt * foodP) > Family.john.getMoney() ) System.out.println("Not enough money");
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      buyAmmo
      post: runs the buying ammo prompt
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void buyAmmo() {
	System.out.println( "Ammo goes for $" + ammoP + " per box of bullets. 1 box contains 20 bullets" );
	System.out.println( "How many boxes would you like to buy?" );
	storeInt = Keyboard.readInt();
	if ( ( storeInt >= 0 ) && ( (storeInt * ammoP) <= Family.john.getMoney() ) ) {
	    Family.john.addAmmo( storeInt * 20 );
	    Family.john.subMoney( storeInt * ammoP );
	    System.out.println( storeInt + " boxes of ammunition bought" );	    
	}
	else if ( storeInt < 0 ) System.out.println("You can't buy a negative number of items");	    
	else if ( (storeInt * ammoP) > Family.john.getMoney() ) System.out.println("Not enough money");
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      buyWheels
      post: runs the buying wheels prompt
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void buyWheels() {
	System.out.println( "Wheels go for $" + wheelsP + " each" );
	System.out.println( "How many wheels would you like to buy?" );
	storeInt = Keyboard.readInt();
	if ( ( storeInt >= 0 ) && ( (storeInt * wheelsP) <= Family.john.getMoney() ) ) {
	    Family.john.addWheels( storeInt );
	    Family.john.subMoney( storeInt * wheelsP );
	    System.out.println( storeInt + " wheels bought" );
	}
	else if ( storeInt < 0 ) System.out.println( "You can't buy a negative number of items" );	    
	else if ( (storeInt * wheelsP) > Family.john.getMoney() ) System.out.println( "Not enough money" );
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      buyAxles
      post: runs the buying axles prompt
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void buyAxles() {
	System.out.println( "Axles go for $" + axlesP + " each" );
	System.out.println( "How many axels would you like to buy?" );
	storeInt = Keyboard.readInt();
	if ( ( storeInt >= 0 ) && ( (storeInt * axlesP) <= Family.john.getMoney() ) ) {
	    Family.john.addAxles( storeInt );
	    Family.john.subMoney( storeInt * axlesP );
	    System.out.println( storeInt + " axles bought" );
	}
	else if ( storeInt < 0 ) System.out.println( "You can't buy a negative number of items" );	    
	else if ( (storeInt * axlesP) > Family.john.getMoney() ) System.out.println( "Not enough money" );	 
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      buyTongues
      post: runs the buying tongues prompt
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/    
    public static void buyTongues() {
	System.out.println( "Tongues go for $" + tonguesP + " each" );
	System.out.println( "How many tongues would you like to buy?" );
	storeInt = Keyboard.readInt();
	if ( ( storeInt >= 0 ) && ( (storeInt * tonguesP) <= Family.john.getMoney() ) ) {
	    Family.john.addTongues( storeInt );
	    Family.john.subMoney( storeInt * tonguesP );
	    System.out.println( storeInt + " tongues bought" );
	}
	else if ( storeInt < 0 ) System.out.println( "You can't buy a negative number of items" );
	else if ( (storeInt * tonguesP) > Family.john.getMoney() ) System.out.println( "Not enough money" );
    }
}
