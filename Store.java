import cs1.Keyboard;

public class Store {
    private int foodP;
    private int ammoP;
    private int tonguesP;
    private int wheelsP;
    private int axlesP;

    public Store(int f, int a, int t, int w, int ax) {
	foodP = f;
	ammoP = a;
	tonguesP = t;
	wheelsP = w;
	axlesP = ax;
    }
    
    public void enterStore() {
	int answer;
	while (answer != 6) {
	System.out.println ("Welcome to our general store. What would you like to buy?");
	System.out.println ("We have:\n\n" + "1.\tFood\n" + "2.\tAmmo\n" + "3.\tTongues\n" + "4.\tWheels\n" + "5.\tAxles\n" + "6.\tLeave the store.\n\n");
	
        answer = Keyboard.readInt();
	while (answer > 5 || answer < 1) {
	    System.out.println("Please choose an answer between 1-5");
	    answer = Keyboard.readInt();
	}
	if (answer == 1) buyFood();	
	if (answer == 2) buyAmmo();
	if (answer == 3) buyTongues();
	if (answer == 4) buyWheels();
	if (answer == 5) buyAxles();
	}
    }

    public void buyFood() {
	    	System.out.println ("Food costs " + foodP + " per parcel. Each parcel contains 10 pounds of food.\n" + "How many parcels would you like to buy? ");

		int answer = Keyboard.readInt();
		
		while (Family.john.getMoney() < (foodP * answer)) {
			System.out.println ("You do not have enough money. Please input a different amount.");
			answer = Keyboard.readInt();
		}
		Family.john.addFood(answer * 10);
	    	Family.john.subMoney(answer * foodP);
    }
	
    public void buyAmmo() {
	    	System.out.println ("Ammo goes for " + ammoP + " per box of bullets. Each box contains 20 bullets.\n" + "How many parcels would you like to buy? ");

		int answer = Keyboard.readInt();
		
		while (Family.john.getMoney() < (ammoP * answer)) {
			System.out.println ("You do not have enough money. Please input a different amount.");
			answer = Keyboard.readInt();
		}
		Family.john.addAmmo(answer * 20);
	    	Family.john.subMoney(answer * ammoP);
    }

    public void buyTongues() {
	    	System.out.println ("Tongues are  " + tonguesP + "each.\n" + "How many tongues would you like to buy?");
		int answer = Keyboard.readInt();
		while (Family.john.getMoney() < (tonguesP * answer)) {
			System.out.println ("You do not have enough money. Please input a different amount.");
			answer = Keyboard.readInt();
		}
		Family.john.addAmmo(answer);
	        Family.john.subMoney(answer * tonguesP);
    }
    
    public void buyWheels() {
	    	System.out.println ("Wheels are  " + wheelsP + "each.\n" + "How many wheels would you like to buy?");
	        int answer = Keyboard.readInt();
		while (Family.john.getMoney() < (wheelsP * answer)) {
			System.out.println ("You do not have enough money. Please input a different amount.");
			answer = Keyboard.readInt();
		}
		Family.john.addAmmo(answer);
	    	Family.john.subMoney(answer * wheelsP);
    }
    
    public void buyAxles() {
	    	System.out.println ("Axles are  " + axlesP + "each.\n" + "How many axles would you like to buy?");
	        int answer = Keyboard.readInt();
		while (Family.john.getMoney() < (axlesP * answer)) {
			System.out.println ("You do not have enough money. Please input a different amount.");
			answer = Keyboard.readInt();
		}
		Family.john.addAmmo(answer);
	    	Family.john.subMoney(answer * axlesP);
    }
}
