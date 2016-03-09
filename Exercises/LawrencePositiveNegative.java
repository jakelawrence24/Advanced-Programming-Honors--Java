/*
 * File: LawrencePositiveNegative.java
 * -----------------------------------
 * Author: Jake Lawrence
 * Date: October, 26, 2015
 * 
 * I recieved help from:
 * no one
 */

/*
 * This class demonstrates the use of a Scanner object
 * and nested if statement
 */

import java.util.*;

public class LawrencePositiveNegative {
    
    //takes input and calls test positiveNegative
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number = input.nextInt();
        String description = positiveNegative(number);
        System.out.println(number + " is " + description);
    }
    
    // returns a String that describes an integer
    public static String positiveNegative(int num) {
        String result = "";
        if (num > 0) {
            result = "positive";
        } else if (num < 0) {
            result = "negative";
        } else {
            result = "zero";
        }
        return result;
    }
}
        