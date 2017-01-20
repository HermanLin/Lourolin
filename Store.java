public class Store {
    private int foodP;
    private int ammoP;
    private int tonguesP;
    private int wheelsP;
    private int axlesP;

    public Store(int f, int a, int t, int w, int a) {
	foodP = f;
	ammoP = a;
	tonguesP = t;
	wheelsP = w;
	axlesP = a;
    }
    public static void enterStore() {
	System.out.println ("Welcome to our general store. What would you like to buy?");
	System.out.println ("We have:\n\n" + "1.\tFood\n" + "2.\tAmmo\n" + "3.\tTongues\n" + "4.\tWheels\n" + "5.\tAxles\n" + "6.\tLeave the store.\n\n");
	
	int answer = Keyboard.readInt();
	if (answer == 1) buyFood();	
	if (answer == 2) buyAmmo();
	if (answer == 3) buyTongues();
	if (answer == 4) buyWheels();
	if (answer == 5) buyAxles();
    }

    public void buyFood() {
	    	System.out.println ("Food costs " + foodP + " per parcel. Each parcel contains 10 pounds of food.\n" + "How many parcels would you like to buy? ");
		answer = Keyboard.readInt();
		while (Family.john.getMoney() < (foodP * answer)) {
			System.println ("You do not have enough money. Please input a different amount.");
			answer = Keyboard.readInt();
		}
		Family.john.addFood(answer * 10);
	    	Family.john.subMoney(answer * foodP);
    }
	
    public void buyAmmo() {
	    	System.out.println ("Ammo goes for " + ammoP + " per box of bullets. Each box contains 20 bullets.\n" + "How many parcels would you like to buy? ");
		answer = Keyboard.readInt();
		while (Family.john.getMoney() < (ammoP * answer)) {
			System.println ("You do not have enough money. Please input a different amount.");
			answer = Keyboard.readInt();
		}
		Family.john.addAmmo(answer * 20);
	    	Family.john.subMoney(answer * ammoP);
    }
}
