/*
 * File: LawrenceDiceSum.java
 * --------------------------
 * Author: Jake Lawrence
 * Date: December 10, 2015
 * 
 * I recieved help from:
 * no one
 */

//for Scanner and Random
import java.util.*;

/*
 * This class takes an integer from the user and
 * rolls two die until the desired sum occurs.
 */

public class LawrenceDiceSum {
    //driver for the class
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Desired dice sum: ");
        int sumRequired = input.nextInt();
        Random rando = new Random();
        int die1 = rando.nextInt(6) + 1; //random integer between 1 and 6
        int die2 = rando.nextInt(6) + 1;
        int currentSum = die1 + die2; //sum of currentRolls
        while (currentSum != sumRequired) {
            System.out.println(die1 + " and " + die2 + " = " + currentSum);
            die1 = rando.nextInt(6) + 1;
            die2 = rando.nextInt(6) + 1;
            currentSum = die1 + die2;
        }
        System.out.println(die1 + " and " + die2 + " = " + currentSum);
    }
}