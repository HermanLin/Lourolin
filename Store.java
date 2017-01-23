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
    private static int foodS;
    private static int ammoS;
    private static int wheelsS;
    private static int axlesS;
    private static int tonguesS;
    private static int answer;
    private static int storeInt;
    private static boolean storeBool;
    private static boolean buyBool;
    private static boolean sellBool;

    //==================
    //===CONSTRUCTORS===
    //==================
    public Store(int f, int a, int w, int ax, int t) {
	foodP = f;
	ammoP = a;
	wheelsP = w;
	axlesP = ax;
	tonguesP = t;
	foodS = (int)(f/2);
	ammoS = (int)(a/2);
	wheelsS = (int)(w/2);
	axlesS = (int)(ax/2);
	tonguesS= (int)(t/2);
    }

    //=============
    //===METHODS===
    //=============

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      enterStore
      post: runs the store methods when in towns
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void enterStore() {	
	String storeMenu = "";
	storeMenu += "\nWelcome to the General Store! What would you like to do?\n";
	storeMenu += "1:\tBuy supplies\n";
	storeMenu += "2:\tSell supplies\n";
	storeMenu += "3:\tLeave the store";
	
	storeBool = true;
	while (storeBool) {
	    System.out.println(storeMenu);
	    answer = Keyboard.readInt();
	    if (answer == 1) buyStore();
	    else if (answer == 2) sellStore();
	    else if (answer == 3) storeBool = false;
	    else System.out.println( "Invalid input" );
	}
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      buyStore
      post: allows player to buy supplies
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void buyStore() {
	buyBool = true;
	while (buyBool) {
	    String storeBuy = "";
	    storeBuy += "\nWhat would you like to buy?\n";
	    storeBuy += "\n" + Family.getSupplies() + "\n";
	    storeBuy += "Amount of Money:\t" + Family.john.getMoney() + "\n";
	    storeBuy += "1:\tFood\n";
	    storeBuy += "2:\tAmmunition\n";	    
	    storeBuy += "3:\tWheels\n";
	    storeBuy += "4:\tAxles\n";
	    storeBuy += "5:\tTongues\n";
	    storeBuy += "6:\tBack to store menu";
	    
	    System.out.println(storeBuy);
	    answer = Keyboard.readInt();	    
	    if (answer == 1) buyFood();	    
	    else if (answer == 2) buyAmmo();
	    else if (answer == 3) buyWheels();
	    else if (answer == 4) buyAxles();
	    else if (answer == 5) buyTongues();
	    else if (answer == 6) buyBool = false;
	    else System.out.println( "Invalid input" );
	}
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      sellStore
      post: allows the player to sell supplies
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void sellStore() {
	sellBool = true;
	while (sellBool) {
	    String storeSell = "";
	    storeSell += "\nWhat would you like to sell?\n";
	    storeSell += "\n" + Family.getSupplies() + "\n";
	    storeSell += "Amount of Money:\t" + Family.john.getMoney() + "\n";
	    storeSell += "1:\tFood\n";
	    storeSell += "2:\tAmmunition\n";	    
	    storeSell += "3:\tWheels\n";
	    storeSell += "4:\tAxles\n";
	    storeSell += "5:\tTongues\n";
	    storeSell += "6:\tBack to store menu";
	    
	    System.out.println(storeSell);
	    answer = Keyboard.readInt();	    
	    if (answer == 1) sellFood();	    
	    else if (answer == 2) sellAmmo();
	    else if (answer == 3) sellWheels();
	    else if (answer == 4) sellAxles();
	    else if (answer == 5) sellTongues();
	    else if (answer == 6) sellBool = false;
	    else System.out.println( "Invalid input" );
	}
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

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      sellFood
      post: runs the selling food prompt
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void sellFood() {
	System.out.println( "Food sells for $" + foodS + " per parcel. 1 parcel contains 10 pounds of food" );
	System.out.println( "How many parcels would you like to sell?" );
        storeInt = Keyboard.readInt();
	if ( (storeInt >= 0) && ( (storeInt * 10) <= Family.john.getFood() ) ) {
	    Family.john.subFood( storeInt * 10 );
	    Family.john.addMoney( storeInt * foodS );
	    System.out.println( storeInt + " parcels sold" );
	}
	else if ( storeInt < 0 ) System.out.println("You can't sell a negative number of items");	    
	else if ( (storeInt * 10) > Family.john.getFood() ) System.out.println("Not enough food to sell");
    }
    
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      sellAmmo
      post: runs the selling ammo prompt
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void sellAmmo() {
	System.out.println( "Ammunition sells for $" + ammoS + " per box. 1 box contains 20 bullets" );
	System.out.println( "How many boxes of ammunition would you like to sell?" );
        storeInt = Keyboard.readInt();
	if ( (storeInt >= 0) && ( (storeInt * 20) <= Family.john.getAmmo() ) ) {
	    Family.john.subAmmo( storeInt * 20 );
	    Family.john.addMoney( storeInt * ammoS );
	    System.out.println( storeInt + " boxes of ammunition sold" );
	}
	else if ( storeInt < 0 ) System.out.println("You can't sell a negative number of items");	    
	else if ( (storeInt * 20) > Family.john.getAmmo() ) System.out.println("Not enough bullets to sell");
    }
    
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      sellWheels
      post: runs the selling wheels prompt
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void sellWheels() {
	System.out.println( "Wheels sell for $" + wheelsS + " per wheel" );
	System.out.println( "How many wheels would you like to sell?" );
        storeInt = Keyboard.readInt();
	if ( (storeInt >= 0) && ( (storeInt) <= Family.john.getWheels() ) ) {
	    Family.john.subWheels( storeInt );
	    Family.john.addMoney( storeInt * wheelsS );
	    System.out.println( storeInt + " wheels sold" );
	}
	else if ( storeInt < 0 ) System.out.println("You can't sell a negative number of items");	    
	else if ( (storeInt) > Family.john.getWheels() ) System.out.println("Not enough wheels to sell");
    }
    
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      sellAxles
      post: runs the selling axles prompt
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void sellAxles() {
	System.out.println( "Axles sell for $" + axlesS + " per axle" );
	System.out.println( "How many axles would you like to sell?" );
        storeInt = Keyboard.readInt();
	if ( (storeInt >= 0) && ( (storeInt) <= Family.john.getAxles() ) ) {
	    Family.john.subAxles( storeInt );
	    Family.john.addMoney( storeInt * axlesS );
	    System.out.println( storeInt + " axles sold" );
	}
	else if ( storeInt < 0 ) System.out.println("You can't sell a negative number of items");	    
	else if ( (storeInt) > Family.john.getAxles() ) System.out.println("Not enough axles to sell");
    }
    
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      sellTongues
      post: runs the selling tongues prompt
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void sellTongues() {
	System.out.println( "Tongues sells for $" + tonguesS + " per tongues" );
	System.out.println( "How many tongues would you like to sell?" );
        storeInt = Keyboard.readInt();
	if ( (storeInt >= 0) && ( (storeInt) <= Family.john.getTongues() ) ) {
	    Family.john.subTongues( storeInt );
	    Family.john.addMoney( storeInt * tonguesS );
	    System.out.println( storeInt + " tongues sold" );
	}
	else if ( storeInt < 0 ) System.out.println("You can't sell a negative number of items");	    
	else if ( (storeInt) > Family.john.getTongues() ) System.out.println("Not enough tongues to sell");
    }
}
