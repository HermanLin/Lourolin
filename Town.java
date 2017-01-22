import cs1.Keyboard;

public class Town{

    private static Store Goods;    
    private static int storeInt;
    private static boolean stayInTown;
    
    public Town(int f, int a, int w, int ax, int t) {
	Store Goods = new Store(f, a, w, ax, t);
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
	System.out.println(choiceText);

	storeInt = Keyboard.readInt();
	stayInTown = true;
	while (stayInTown) {
	    if ( storeInt == 1 ) {
		stayInTown = false;
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
	        Goods.enterStore();
	    }
	    else {
		System.out.println( "Invalid input" );
	    }
	}
    }	
}
