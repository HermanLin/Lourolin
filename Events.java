/*||||||||||||||||||||||||||||||||||||||||||||
  EVENTS CLASS
  Contains the methods for various events that
  are to take place within the game
  ||||||||||||||||||||||||||||||||||||||||||*/

public class Events {

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~
      banditAttack
      post: runs the bandit event
      ~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void banditAttack() {
	String banditStr = "";
	banditStr += "\nBandits have ambushed you on the trail.\n";
	banditStr += "You take out your gun to try to defend your wagon\n";
	
	int rand = (int)(Math.random() * 5);
	int randFood;
	int randAmmo;
	if (Family.john.getFood() > 500)
	    randFood = (int)(Family.john.getFood() / ((Math.random() * 15) + 10));
	else
	    randFood = (int)(Math.random() * Family.john.getFood());
	if (Family.john.getAmmo() > 100)
	    randAmmo = (int)(Family.john.getAmmo() / ((Math.random() * 15) + 10));
	else if (Family.john.getAmmo() == 0) {
	    rand = 4;
	    randAmmo = (int)(Math.random() * Family.john.getAmmo() + 1);
	}
	int randWheel = (int)(Math.random() * Family.john.getWheels());
	int randAxle = (int)(Math.random() * Family.john.getAxles());
	int randTongue = (int)(Math.random() * Family.john.getTongues());
	if (rand == 4) {
	    banditStr += "The bandits overwhelmed you and got away with some of your supplies\n";
	    banditStr += "Food stolen:\t" + randFood + "\n";
	    banditStr += "Wheels stolen:\t" + randWheel + "\n";
	    banditStr += "Axles stolen:\t" + randAxle + "\n";
	    banditStr += "Tongues stolen:\t" + randTongue + "\n";
	    banditStr += "Bullets used:\t" + randAmmo + "\n";
	    
	    Family.john.subFood(randFood);
	    Family.john.subWheels(randWheel);
	    Family.john.subAxles(randAxle);
	    Family.john.subTongues(randTongue);
	    System.out.println(banditStr);
	}
	else {
	    banditStr += "You managed fend off the bandits and continue on your journey\n";
	    banditStr += "Bullets used:\t" + randAmmo + "\n";
	    System.out.println(banditStr);
	}
    }    
}
