

public class Woo {
    
    public static void main (String[] args) {
	
	Game OregonTrail = new Game();
	Family.makeChars();
	OregonTrail.setDifficulty();
	Supplies.chooseSupplies();
	System.out.println( "You head onto the trail to begin your travels...\n" );
	OregonTrail.runGame();

    }
}
