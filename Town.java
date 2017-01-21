import cs1.Keyboard;

public class Town{
    private int mileMarker = 0;
    
    public Town(int f, int a, int t, int w, int ax, int miles) {
	Store Goods = new Store(f, a, t, w, ax);
	mileMarker = miles;
    }

    public int getMileMarker() {
	return mileMarker;
    }


    public static void inTown() {
	boolean stay = true;
	String choiceText = "You entered the town.\n" + "You may:\n\n";
	choiceText += "1:\tContinue on the Trail\n";
	choiceText += "2:\tCheck on supplies\n";
	choiceText += "3:\tCheck on the family\n";
	choiceText += "4:\tRest\n";
	choiceText += "5:\tTry to trade with someone\n";
	choiceText += "6:\tGo to the store\n";
	while (stay) {
	    System.out.println(choiceText);

	    int storeInt = Keyboard.readInt();
	    
	    if ( storeInt == 1 ) {
		stay = false;
	    }
	    else if ( storeInt == 2 ) {
		System.out.println( Family.getSupplies() );
	    }
	    else if ( storeInt == 3 ) {
		System.out.println( Family.getHealth() );
	    }
	    else if ( storeInt == 4 ) {
		Game.rest();
	    }
	    else if ( storeInt == 5 ) {
		Trade.trade();
	    }
	    else if ( storeInt == 6 ) {
	        Store.enterStore();
	    }
	    else {
		System.out.println( "Invalid input" );
	    }
	}
    }	
}
