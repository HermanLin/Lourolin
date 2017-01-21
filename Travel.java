public class Travel {
    
    private static String[] _landmarks = {"Kansas River Crossing", "Big Blue River Crossing", "Fort Kearney", "Chimney Rock", "Fort Laramie", "Independence Rock", "South Pass"};
    private static int[] _miles = {105, 80, 119, 250, 86, 190};
    private static String[] _disease = {"exhaustion", "cholera", "dysntery", "measles", "typhoid", "fever"};

    private static int milesTraveled = 0;
    private static int markNum = 0;
    private static int nextMiles = _miles[0];
    private static int storeInt;

    public static int getMilesTraveled() {
	return milesTraveled;
    }
    public static int getNextMiles() {
	return nextMiles;
    }
    
    public static String nextDestination() {
	if (milesTraveled < 105) return _landmarks[0];
	else if (milesTraveled < 185) return _landmarks[1];
	else if (milesTraveled < 304) return _landmarks[2];
	else if (milesTraveled < 554) return _landmarks[3];
	else if (milesTraveled < 640) return _landmarks[4];
	else if (milesTraveled < 830) return _landmarks[5];
	else return _landmarks[6];
    }

    public void reachLandmark() {
	return;
    }


    public static void travelTrail() {
	if (10 < nextMiles) {
	    milesTraveled += 10;
	    nextMiles -= 10;
	}
	else {
	    storeInt = 10 - nextMiles;
	    markNum ++;
	    nextMiles = _miles[markNum];
	    milesTraveled += storeInt;
	}
    }

    public static void runGameChecks() {
	if (Family.member1.isAlive())
	    loseHealth(Family.member1);				    
	if (Family.member2.isAlive())
	    loseHealth(Family.member2);
	if (Family.member3.isAlive())
	    loseHealth(Family.member3);
	if (Family.member4.isAlive())
	    loseHealth(Family.member4);
		
	int random = (int)( Math.random() * 4 ) + 1;
	if (random == 1)
	    becomeSick( Family.member1 );
	else if (random == 2)
	    becomeSick( Family.member2 );
	else if (random == 3)
	    becomeSick( Family.member3 );
	else if (random == 4)
	    becomeSick( Family.member4 );

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

	Wagon.wagonBreak();
	Wagon.wagonCheck();
    }

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

    public static void becomeHealed( Character character ) {
	int randHeal = (int)( Math.random() * 100 ) + 1;
	if (character.getCondition() != 0) {
	    if (randHeal >= 75) {
		System.out.println( character.getName() + " no longer has " + _disease[character.getCondition()]);
		character.setCondition(0);
	    }
	}
    }

    public static void loseHealth(Character character) {
	if (character.isAlive()) {
	    if (character.isSick()) {
		Family.john.subFood(1);
		character.subHP(4);
	    }
	    else {
		character.subHP(2);
		Family.john.subFood(1);
	    }
	}
    }
}
