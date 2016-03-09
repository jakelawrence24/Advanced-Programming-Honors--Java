/*
 * File: Receipt.java
 * ------------------
 * Author: A Period Programming
 * Date: November 4, 2015
 * 
 */

/*
 * This class finds the tip and tax owed for a meal
 * based on users input of number of people eating
 * and their individual costs for dinner.
 */

import java.util.*;

public class ReceiptCumulative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many people ate dinner? ");
        int people = input.nextInt();
        double subtotal = 0;
        // Calculate total owed, assuming 8% tax, 15% tip for "people" number of people
        for (int i = 0; i < people; i++) {
            System.out.print("Person #" + (i+1) + ": How much did your dinner cost? ");
            double oneDinner = input.nextDouble();
            subtotal += oneDinner;
        }
        System.out.printf("Subtotal: %.2f ", subtotal);
        double tax = subtotal * .08;
        System.out.printf("Tax: %.2f ", tax);
        double tip = subtotal * .15;
        System.out.printf("Tip: %.2f ", tip);
        System.out.printf("Total: %.2f ", (subtotal + tip + tax));
    }
}