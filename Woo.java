/*|||||||||||||||||||||||||||
  WOO CLASS
  The driver file of the game
  |||||||||||||||||||||||||*/

public class Woo {    
    
    public static void main (String[] args) {

	//creates a new object OregonTrail
	Game OregonTrail = new Game();

	//startup menu	
	OregonTrail.startUp();
	
	//run methods before game loop starts...
	Family.makeChars();
	OregonTrail.setDifficulty();
	OregonTrail.chooseStartMonth();
	Supplies.chooseSupplies();
	System.out.println( "You head onto the trail to begin your travels...\n" );
	//run the main game loop
	OregonTrail.runGame();

    }
}
