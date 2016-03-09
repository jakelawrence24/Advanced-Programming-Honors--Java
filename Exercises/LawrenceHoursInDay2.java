/*
 * File: LawrenceHoursInDay2
 * -------------------------
 * Author: Jake Lawrence
 * Date: October 8, 2015
 * 
 * I recieved help from:
 * no one
 */

/*
 * This class prints the hours in a day
 */

public class LawrenceHoursInDay2{
    
    public static final int HALF_A_DAY = 12;
    
    //driver for this class
    public static void main(String[] args) {
        System.out.println("Hours in the day");
        //parameters for the morning hours
        printHours("AM");
        System.out.println();
        //parameters for the evening hours
        printHours("PM");
    }
    //prints the hours for a certain part of the day
    public static void printHours(String dayPart){
        for (int hour = 1; hour <= HALF_A_DAY; hour++){
            System.out.println(hour + " " + dayPart);
        }
    }
}