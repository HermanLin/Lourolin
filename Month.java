/*||||||||||||||||||||||||||||||||||||||||
  MONTH CLASS
  Allows for the creation of objects of
  type Month. Months have a days and month
  variable to them. Keeps track of time in game
  ||||||||||||||||||||||||||||||||||||||*/

public class Month {

    //========================
    //===INSTANCE VARIABLES===
    //========================
    private static int[] maxDays = new int[12];
    private int[] month = new int[12];
    private String[] monthName = new String[12];

    //==================
    //===CONSTRUCTORS===
    //==================
    public Month() {
        maxDays[0] = 31;
	maxDays[1] = 28;
	maxDays[2] = 31;
	maxDays[3] = 30;
	maxDays[4] = 31;
	maxDays[5] = 30;
	maxDays[6] = 31;
	maxDays[7] = 31;
	maxDays[8] = 30;
	maxDays[9] = 31;
	maxDays[10] = 30;
	maxDays[11] = 31;
		
	monthName[0] = "January";
	monthName[1] = "February";
	monthName[2] = "March";
	monthName[3] = "April";
	monthName[4] = "May";
	monthName[5] = "June";
	monthName[6] = "July";
	monthName[7] = "August";
	monthName[8] = "September";
	monthName[9] = "October";
	monthName[10] = "November";
	monthName[11] = "December";
    }

    public static int getMaxDays( int month ) {
	return maxDays[month];
    }

    public static int getCurrentMonth( int month ) {
	return monthName[month];
    }
}
