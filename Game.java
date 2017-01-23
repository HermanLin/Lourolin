/*||||||||||||||||||||||||||||||||||||||||||
  GAME CLASS
  This is the main class that runs the other
  classes in one main game loop
  ||||||||||||||||||||||||||||||||||||||||*/

import cs1.Keyboard;

public class Game {

    //========================
    //===INSTANCE VARIABLES===
    //========================
    private String strName;
    private int difficulty;
    private int storeInt;
    private boolean storeBool;
    private boolean startUpBool;
    private boolean paceBool;
    private static int currentMonth;
    private static int currentDate = 1;

    //=============
    //===METHODS===
    //=============

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      waitTime
      pre: input number of milliseconds
      post: waits input number of seconds
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void waitTime( int input ) {
	try { Thread.sleep(input); }
	catch( InterruptedException e) { Thread.currentThread().interrupt(); }
    }
    
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      startUp
      post: prints start up messages
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void startUp() {
	System.out.println("\n\t...A Stuyvesant Student Production...\n\n\n");
	waitTime(2000);
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#'''''''''@@@@@@@@@@@@@@@@@@@@@;'''''#@@@@@@");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'''''''''''''';##@@###@@@@#''''''''''''#@@@@@");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+'++'''''''''''''#+''''+@;'''''''''''''#@@@@@");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#'#@;''''''''''''#;'''''#;'''''''''''''#@@@@@");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#'#@@''''''''''''#;'''''#;''''''''''''#@@@@@@");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#'@@@'''''''''''#;'''''#;''''''''''''+@@@@@@");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#'@@@@''''''''''#;'''''#;''''''''''''@@@@@@@");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+'#@@@''''''''''#;'''''#;''''''''''''@@@@@@@");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@''@@@''''''''''#;'''''#;'''''''''';'@@@@@@@");
	System.out.println("@@@@@@@@@@@##@@@@@@@@@@@@@@@@@@@@@''#@@@'''''''''#;'''''#;'''''''''';@@@@@@@@");
	System.out.println("@@@@@@'+'@@@'+@@@@@@@@@@@@@@@@@@@@#''@@@'''''''''#;'''''#;''''''''''#@@@@@@@@");
	System.out.println("@@@@@@@@';;;'#@@;;'@@@@@@@@@@@@@@@@;'@@@'''''''''#;'''''#;''''''''''@@@@@@@@@");
	System.out.println("@@@@@@@@@''''';'''';;;;;;;;#@@@@@@@;'@@@'''''''''#;'''''#;''''''''''@@@@@@@@@");
	System.out.println("@@@@@@@@''''''''''''''''''''@@@@@@@@@@@@'''''''''#;'''''#;''''''''';@@@@@@@@@");
	System.out.println("@@@@@@;''''''''''''''''''''''@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println("@@@@@@;''''''''''''''''''''''@@@@@@;'''';#@#;'''@''''''''''@@#'''#@;@@@@@@@@@");
	System.out.println("@@@@@@@@@@'+#''''''''''''''''+''''''+'';@#''@';''+#''''''@@#''#'+''#@@@@@@@@@");
	System.out.println("@@@@@@@@@@@#''''''''''''''''#@@@@@@'+'#####@@';@#''##''+#@';#@#'@@##@@@@@@@@@");
	System.out.println("@@@@@@@@@@@@@;'''''''''''''#@@@@@@@;''@@#''''';@@@@@@''+@@;@@@#''''';@@@@@@@@");
	System.out.println("@@@@@@@@@@@@@;''''''#@@''''#@@@@@@@@@;@@##@@@'';;;;@@''+@@';;;;'#@@@@@@@@@@@@");
	System.out.println("@@@@@@@@@@@@@;''''@@@@@''''#@@@@@@@@@@@@#'@@@';@@@@@@@@@@@;@@@#'@@@;;@@@@@@@@");
	System.out.println("@@@@@@@@@@@@@;'''''@@@'';#'#@@@@@@@@@@@@@''@@';@+'@@@@@@@@@;;@#'@@';@@@@@@@@@");
	System.out.println("@@@@@@@@@@@@'''@@''@@@;';#'#@@@@@@@@@@@@@@;;#';;'#@@@@@@@@@@''#''';@@@@@@@@@@");
	System.out.println("@@@@@@@@@@@#+'@@@++@@@@@'''@@@@@@@@@@@@@@@@'++''#@@@@@@@@@@@@'++''@@@@@@@@@@@");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");	
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	waitTime(2000);
	
	startUpBool = true;
	while (startUpBool) {
	    System.out.println("\t=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	    System.out.println("\t-=-=Welcome to the Oregon Trail=-=-");
	    System.out.println("\t=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	    System.out.println("\n\t1:\tTravel the Trail");
	    System.out.println("\t2:\tCredits");
	    
	    storeInt = Keyboard.readInt();
	    if (storeInt == 1)
		startUpBool = false;
	    else if (storeInt == 2) {
		System.out.println("\t\t-=-=Credits=-=-");
		System.out.println("\tProgrammers:");
		System.out.println("\tHerman Lin, Edward Luo, Edward Ro\n\n");
	    }
	    else System.out.println("Invalid input");
	}
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      chooseStartMonth
      post: sets starting month of the game
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void chooseStartMonth() {
	String monthChoose = "It is 1848. Your jumping off place for Oregon is Independence, Missouri. \nYou must decide which month to leave Independence.\n\n";
	monthChoose += "1.\tMarch\n";
	monthChoose += "2.\tApril\n";
	monthChoose += "3.\tMay\n";
	monthChoose += "4.\tJune\n";
	monthChoose += "5.\tJuly\n\n";

	monthChoose += "What is your choice? ";
	System.out.print (monthChoose);

	int answer = Keyboard.readInt();
	while( answer > 5 || answer < 1 ) {
	    System.out.println ("Out of range, please pick a number from 1-5");
	    answer = Keyboard.readInt();
	}
	setMonth( answer + 2 );
    }

    public void setMonth(int x) {
	currentMonth = x;
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      setDifficulty
      post: sets difficulty, which affects starting money
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setDifficulty() {
	boolean diffBool = true;
	int diffChoice;
	String diffText = "Many kinds of people made the trip to Oregon.\n\nYou may:\n\n";
	diffText += "1.\t Be a banker from Boston\n";
	diffText += "2.\t Be a carpenter from Ohio\n";
	diffText += "3.\t Be a farmer from Illinois\n";
	while( diffBool == true ) {
	    System.out.println( diffText );
	    
	    diffChoice = Keyboard.readInt();
	    
	    if( diffChoice > 0 && diffChoice < 4 ) {
		if( diffChoice == 1 ) {
		    Family.john.setMoney(250);
		} else if( diffChoice == 2 ) {
		    Family.john.setMoney(200);
		} else {
		    Family.john.setMoney(150);
		}
		diffBool = false;
	    } else {
		System.out.println( "Invalid input. Please enter a number from 1-3" );
	    }
	}
    }		    
	    
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      runGame
      post: runs the main game loop
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void runGame() {
	String choiceText = "";
	choiceText += "\nWhat would you like to do?\n";
	choiceText += "1:\tContinue on the Trail\n";
	choiceText += "2:\tCheck on supplies\n";
	choiceText += "3:\tCheck on the family\n";
	choiceText += "4:\tRest\n";
	choiceText += "5:\tTry to trade with someone\n";
	choiceText += "6:\tChange your pace\n";
	System.out.println(choiceText);
	    
	while ( Travel.getMilesTraveled() < 2170 ) {
	    String checker = "";
	    checker += "The date is " + Month.getCurrentMonth( currentMonth - 1 ) + " " + currentDate + "\n";
	    checker += "Miles Traveled: " + Travel.getMilesTraveled() + "\n";
	    checker += "Next Landmark: " + Travel.nextDestination() + "\n";
	    checker += "Miles till Landmark: " + Travel.getNextMiles() + "\n";
	    System.out.println(checker + choiceText);

	    storeInt = Keyboard.readInt();
	    
	    if ( storeInt == 1 ) {
		Travel.travelTrail();
		Travel.runGameChecks();
		changeDay(1);
	    }
	    else if ( storeInt == 2 ) {
		System.out.println( Family.getSupplies() );
	    }
	    else if ( storeInt == 3 ) {
		System.out.println( Family.getHealth() );
	    }
	    else if ( storeInt == 4 ) {
		String restMsg = "Rest for how many days?";
		System.out.println(restMsg);

		int days = Keyboard.readInt();
		rest(days);
	    }
	    else if ( storeInt == 5 ) {
		Trade.trade();
	    }
	    else if ( storeInt == 6 ) {
		setPace();
	    }
	    else if ( storeInt == 0 ) {
		Family.john.addMoney(100);
	    }
	    else {
		System.out.println( "Invalid input" );
	    }
	}
	endGame();
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      rest
      post: adds health to family members, takes food away for each member
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void rest( int days ) {
	if (Family.john.isAlive()) {
	    Family.john.subFood(1);
	    Family.john.addHP(5);
	    if (Family.john.getHP() > 100)
		Family.john.setHP(100);
	}
	if (Family.member1.isAlive()) {
	    Family.john.subFood(1);
	    Family.member1.addHP(5);
	    if (Family.member1.getHP() > 100)
		Family.member1.setHP(100);
	    Travel.becomeHealed(Family.member1);
	}
	if (Family.member2.isAlive()) {
	    Family.john.subFood(1);
	    Family.member2.addHP(5);
	    if (Family.member2.getHP() > 100)
		Family.member2.setHP(100);
	    Travel.becomeHealed(Family.member2);
	}
	if (Family.member3.isAlive()) {
	    Family.john.subFood(1);
	    Family.member3.addHP(5);
	    if (Family.member3.getHP() > 100)
		Family.member3.setHP(100);
	    Travel.becomeHealed(Family.member3);
	}
	if (Family.member4.isAlive()) {
	    Family.john.subFood(1);
	    Family.member4.addHP(5);
	    if (Family.member4.getHP() > 100)
		Family.member4.setHP(100);
	    Travel.becomeHealed(Family.member4);
	}
	changeDay(days);
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      setPace
      post: changes how far the player travels every day
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void setPace() {
	String choosePace = "";
	choosePace += "\nAt what pace would you like to travel?";
	choosePace += "\n1:\tSteady";
	choosePace += "\n2:\tStrenuous";
	choosePace += "\n3:\tGrueling";
	System.out.println(choosePace);

	storeInt = Keyboard.readInt();
	paceBool = true;
	while (paceBool) {
	    if (storeInt == 1) {
		Travel.setPace(15);
		Wagon.setChanceBreak(95);
		System.out.println("Pace set to 15 miles per day");
		paceBool = false;
	    }
	    else if (storeInt == 2) {
		Travel.setPace(25);
		Wagon.setChanceBreak(90);
		System.out.println("Pace set to 25 miles per day");
		paceBool = false;
	    }
	    else if (storeInt == 3) {
		Travel.setPace(40);
		Wagon.setChanceBreak(85);
		System.out.println("Pace set to 40 miles per day");
		paceBool = false;
	    }
	    else {
		System.out.println("Invalid input");
	    }
	}
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      changeDay
      pre: takes number for how many days the date will change
      post: changes currentDate and currentMonth as necessary
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void changeDay( int days ) {
	if( currentDate < Month.getMaxDays( currentMonth - 1 ) ) {
	    currentDate += days;
	} else {
	    if( currentMonth == 12 ) {
		currentMonth = 1;
	    } else {
		currentMonth++;
	    }
	    currentDate = 1;
	    currentDate += days - 1;	    
	}
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      endGame
      post: runs end game message and calculates points
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void endGame() {
	int johnHPTotal = Family.john.getHP()*10;
	int member1HPTotal = Family.member1.getHP()*10;
	int member2HPTotal = Family.member2.getHP()*10;
	int member3HPTotal = Family.member3.getHP()*10;
	int member4HPTotal = Family.member4.getHP()*10;
	int foodTotal = Family.john.getFood()*25;
	int ammoTotal = Family.john.getAmmo()*50;
	int wheelTotal = Family.john.getWheels()*2;
	int axleTotal = Family.john.getAxles()*2;
	int tongueTotal = Family.john.getTongues()*2;
	int moneyTotal = Family.john.getMoney()*5;
	int sumTotal = johnHPTotal + member1HPTotal + member2HPTotal + member3HPTotal + member4HPTotal + foodTotal + ammoTotal + wheelTotal + axleTotal + tongueTotal + moneyTotal;
	System.out.println("Congratulations! You have made it to Oregon City!");
	System.out.println("Let's see how many points you have received...");
	waitTime(1000);
	System.out.println(Family.john.getName() + "'s Health:\t" + Family.john.getHP() + " x 10\t=" + johnHPTotal);
	waitTime(500);
	System.out.println(Family.member1.getName() + "'s Health:\t" + Family.member1.getHP() + " x 10\t\t=" + member1HPTotal);
	waitTime(500);
	System.out.println(Family.member2.getName() + "'s Health:\t" + Family.member2.getHP() + " x 10\t\t=" + member2HPTotal);
	waitTime(500);
	System.out.println(Family.member3.getName() + "'s Health:\t" + Family.member3.getHP() + " x 10\t\t=" + member3HPTotal);
	waitTime(500);
	System.out.println(Family.member4.getName() + "'s Health:\t" + Family.member4.getHP() + " x 10\t\t=" + member4HPTotal);
	waitTime(500);
	System.out.println("Food:\t\t" + Family.john.getFood() + " x 25\t=" + foodTotal);
	waitTime(500);
	System.out.println("Ammo:\t\t" + Family.john.getAmmo() + " x 50\t=" + ammoTotal);
	waitTime(500);
	System.out.println("Wheels:\t\t" + Family.john.getWheels() + " x 2\t\t=" + wheelTotal);
	waitTime(500);
	System.out.println("Axles:\t\t" + Family.john.getAxles() + " x 2\t\t=" + axleTotal);
	waitTime(500);
	System.out.println("Tongues:\t" + Family.john.getTongues() + " x 2\t\t=" + tongueTotal);
	waitTime(500);
	System.out.println("Money:\t\t" + Family.john.getMoney() + " x 5\t\t=" + moneyTotal);
	waitTime(500);
	System.out.println("Sum of Points:\t" + sumTotal);
	waitTime(500);
	System.out.println("\nOccupation Bonus:\tx" + difficulty);
	waitTime(500);
	System.out.println("\nTOTAL POINTS:\t" + sumTotal*difficulty);
	waitTime(500);
	System.out.println("");
	waitTime(500);
	System.out.println("");
	waitTime(500);
	System.out.println("");	
	System.out.println("...Thanks for Traveling Along the Oregon Trail!...");
    }
}
