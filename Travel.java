/*||||||||||||||||||||||||||||||||||||||||
  TRAVEL CLASS
  Contains the various methods needed when
  the player "continues on the trail"
  Contains the towns along the trail 
  and the distance traveled, between
  towns, and the distance left till towns
  Also contains the diseases that can
  affect Characters
  ||||||||||||||||||||||||||||||||||||||*/

public class Travel {

    //============
    //===ARRAYS===
    //============
    private static String[] _landmarks = {"Kansas River Crossing", "Big Blue River Crossing", "Fort Kearney", "Chimney Rock", "Fort Laramie", "Independence Rock", "South Pass", "Fort Bridger", "Soda Springs", "Fort Hall", "Snake River Crossing", "Fort Boise", "Blue Mountain", "The Dalles", "Fort Walla Walla", "Oregon City"};
    private static int[] _miles = {102,83,119,250,86,190,102,57,306,100,139,114,160,55,120,187};
    private static String[] _disease = {"exhaustion", "cholera", "dysntery", "measles", "typhoid", "fever"};

    //========================
    //===INSTANCE VARIABLES===
    //========================
    private static int milesTraveled = 0;
    private static int markNum = 0;
    private static int nextMiles = _miles[0];
    private static int storeInt;
    private static int pace = 25;

    //=============
    //===METHODS===
    //=============
    public static int getMilesTraveled() {
	return milesTraveled;
    }
    public static int getNextMiles() {
	return nextMiles;
    }
    public static void setPace( int input ) {
	pace = input;
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      nextDestination
      post: returns the next landmark along the trail
            based on _landmarks
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static String nextDestination() {
	if (milesTraveled < 102) return _landmarks[0];
	else if (milesTraveled < 185) return _landmarks[1];
	else if (milesTraveled < 304) return _landmarks[2];
	else if (milesTraveled < 554) return _landmarks[3];
	else if (milesTraveled < 640) return _landmarks[4];
	else if (milesTraveled < 830) return _landmarks[5];
	else if (milesTraveled < 932) return _landmarks[6];
	else if (milesTraveled < 989) return _landmarks[7];
	else if (milesTraveled < 1295) return _landmarks[8];
	else if (milesTraveled < 1395) return _landmarks[9];
	else if (milesTraveled < 1534) return _landmarks[10];
	else if (milesTraveled < 1648) return _landmarks[11];
	else if (milesTraveled < 1808) return _landmarks[12];
	else if (milesTraveled < 1863) return _landmarks[13];
	else if (milesTraveled < 1983) return _landmarks[14];
	else return _landmarks[15];
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      reachLandmark
      post: creates Towns if player reaches a town landmark
      post: runs methods in Town
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void reachLandmark() {
	if (milesTraveled == 304) {
	    System.out.println("\nWelcome to Fort Kearney\n");
	    Town Kearney = new Town(1,3,13,13,13);
	    Kearney.inTown();
	}
	else if (milesTraveled == 640) {
	    System.out.println("\nWelcome to Fort Laramie\n");
	    Town Laramie = new Town(2,3,15,15,15);
	    Laramie.inTown();
	}
	else if (milesTraveled == 989) {
	    System.out.println("\nWelcome to Fort Bridger\n");
	    Town Bridger = new Town(3,4,17,17,17);
	    Bridger.inTown();
	}
	else if (milesTraveled == 1648) {
	    System.out.println("\nWelcome to Fort Boise\n");
	    Town Boise = new Town(4,5,22,22,22);
	    Boise.inTown();
	}
	else if (milesTraveled == 1983) {
	    System.out.println("\nWelcome to Fort Walla Walla\n");
	    Town WallaWalla = new Town(5,6,25,25,25);
	    WallaWalla.inTown();
	}
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      travelTrail
      post: adds distance traveled, subtracts distance left
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void travelTrail() {
	if (pace < nextMiles) {
	    milesTraveled += pace;
	    nextMiles -= pace;
	}
	else {
	    storeInt = nextMiles;
	    markNum ++;
	    nextMiles = _miles[markNum];
	    milesTraveled += storeInt;
	}
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      runGameChecks
      post: runs the main if statements that are needed when the
            player "continues on the trail"
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void runGameChecks() {

	//if the family member is alive, sub health
	if (Family.member1.isAlive())
	    loseHealth(Family.member1);				    
	if (Family.member2.isAlive())
	    loseHealth(Family.member2);
	if (Family.member3.isAlive())
	    loseHealth(Family.member3);
	if (Family.member4.isAlive())
	    loseHealth(Family.member4);

	//if the family is alive, make them sick based on random
	int random = (int)( Math.random() * 4 ) + 1;
	if (random == 1)
	    becomeSick( Family.member1 );
	else if (random == 2)
	    becomeSick( Family.member2 );
	else if (random == 3)
	    becomeSick( Family.member3 );
	else if (random == 4)
	    becomeSick( Family.member4 );

	//if the family member dies, say so once
	if (Family.member1.getDied() == false) {
	    if (Family.member1.isAlive() == false) {
		Family.member1.setDied(true);
		System.out.println("\n" + Family.member1.getName() + " has died...\n");
	    }
	}
	if (Family.member2.getDied() == false) {
	    if (Family.member2.isAlive() == false) {
		Family.member2.setDied(true);
		System.out.println("\n" + Family.member2.getName() + " has died...\n");
	    }
	}
	if (Family.member3.getDied() == false) {
	    if (Family.member3.isAlive() == false) {
		Family.member3.setDied(true);
		System.out.println("\n" + Family.member3.getName() + " has died...\n");
	    }
	}	
	if (Family.member4.getDied() == false) {
	    if (Family.member4.isAlive() == false) {
		Family.member4.setDied(true);
		System.out.println("\n" + Family.member4.getName() + " has died...\n");
	    }	    
	}

	//runs random bandit attack event
	int rand = (int)(Math.random() * 100) + 1;
	if (rand > 95)
	    Events.banditAttack();

	//runs random wagon breaking and fixing
	Wagon.wagonBreak();
	Wagon.wagonCheck();

	//checks if player has reached a town
	reachLandmark();
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      becomeSick
      pre: takes a Character character
      post: randomly makes Character sick
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private static void becomeSick( Character character ) {
	int rand = (int)( Math.random() * 100 ) + 1;
	int randCond = (int)( Math.random() * 6 );
	int randHeal = (int)( Math.random() * 100 ) + 1;
	if ( character.getCondition() == 0 ) {
	    if ( rand >= 95 ) {
		character.setCondition( randCond );
		System.out.println( character.getName() + " has " + _disease[randCond] );
	    }
	}
	else {
	    if (randHeal >= 80) {     
		System.out.println( character.getName() + " no longer has " + _disease[character.getCondition()] );
		character.setCondition(0);
	    }
	}				    
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      becomeHealed
      pre: takes a Character and if the character is sick
      post: removes sickness from the Character
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void becomeHealed( Character character ) {
	int randHeal = (int)( Math.random() * 100 ) + 1;
	if (character.getCondition() != 0) {
	    if (randHeal >= 75) {
		System.out.println( character.getName() + " no longer has " + _disease[character.getCondition()]);
		character.setCondition(0);
	    }
	}
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      loseHealth
      pre: takes a Character character and is alive
      post: takes health from Character based on whether 
            they are sick or not, takes food
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void loseHealth(Character character) {
	if (character.isAlive()) {
	    if (character.isSick()) {
		Family.john.subFood(1);
		character.subHP(5);
	    }
	    else {
		character.subHP(2);
		Family.john.subFood(1);
	    }
	}
    }
}
