/*||||||||||||||||||||||||||||||||||||||||
  MONTH CLASS
  Allows for keeping track of time in game
  ||||||||||||||||||||||||||||||||||||||*/

public class Month {

    //========================
    //===INSTANCE VARIABLES===
    //========================
    private static int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
    private static String[] monthName = {"January","February","March","April","May","June","July","August","September","October","November","December"};

    public static int getMaxDays( int month ) {
	return maxDays[month];
    }
    public static String getCurrentMonth( int month ) {
	return monthName[month];
    }
}
