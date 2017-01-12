import cs1.Keyboard.java;

public class Game {

    //===INSTANCE VARIABLES===
    private int difficulty;
    private int milesTraveled;
    private int nextMiles;

    //===Arrays===


    //===Main Game Loop===
    public void runGame() {
	while ( milesTraveled < 100 ) {

	    String choices = "";
	    choices += "1:\tContinue on the Trail\n";
	    choices += "2:\tCheck on supplies\n";
	    choices += "3:\tRest\n";
	    choices += "4:\tTry to trade with someone\n";
	    choices += "5:\tGo to the store\n";
	    System.out.println(choices);

	    if ( Keyboard.readInt() == 1 ) {
		milesTraveled += (int)(Math.random() * 15) + 5;
	    }
	    else if ( Keyboard.readInt() == 2 ) {
	    }
	    else if ( Keyboard.readInt() == 3 ) {
	    }
	    else if ( Keyboard.readInt() == 4 ) {
	    }
	    else if ( Keyboard.readInt() == 5 ) {
	    }
	    else {
		System.out.println( "Invalid input" );
	    }
	    
    }

}
