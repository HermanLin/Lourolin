public class Woo {
    
    public static void main (String[] args) {
	
	Game OregonTrail = new Game();
	OregonTrail.setupMonths();	
	Family.makeChars();
	OregonTrail.setDifficulty();
	OregonTrail.chooseStartMonth();
	Supplies.chooseSupplies();
	System.out.println( "You head onto the trail to begin your travels...\n" );
	OregonTrail.runGame();

    }
}
