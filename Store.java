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
	    
    }

    public void buyFood() {
	    
    }
}
