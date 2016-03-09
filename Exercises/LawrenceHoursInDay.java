/*
 * File: LawrenceHoursInDay.java
 * -----------------------------
 * Author: Jake Lawrence
 * Date: September 30, 2015
 * I recieved help from:
 * No one
 */
/*
 * This class prints the hours in a day
 */
public class LawrenceHoursInDay {
    
    public static final int HALF_A_DAY = 12;
    
    //driver for this class
    public static void main(String[] args) {
        System.out.println("Hours in the day");
        printAM();
        System.out.println();
        printPM();
    }
    //prints AM hours
    public static void printAM(){
        for (int hour = 1; hour <= HALF_A_DAY; hour++){
            System.out.println(hour + " AM");
        }
    }
    public static void printPM(){
        for (int hour = 1; hour <= HALF_A_DAY; hour++){
            System.out.println(hour + " PM");
        }
    }
}
            