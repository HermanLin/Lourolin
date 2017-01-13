

public class Woo {
    
    public static void main (String[] args) {
	
	Game OregonTrail = new Game();
	OregonTrail.makeChars();
	OregonTrail.chooseSupplies();
	System.out.println( "You head onto the trail to begin your travels...\n" );
	OregonTrail.runGame();

    }
}
