/*
 * File: LawrenceShowTwos.java
 * ---------------------------
 * Author: Jake Lawrence
 * Date: December 1, 2015
 * 
 * I recieved help from:
 * no one
 */

import java.util.*;

/*
 * This class prints the number as a product of twos and whatever is left over
 */

public class LawrenceShowTwos{
    //gets an int from the user and calls showTwos
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = console.nextInt();
        showTwos(number);
    }
    
    //prints the number of twos and the leftovers
    public static void showTwos(int n){
        System.out.print(n + " = ");
        while(n % 2 == 0){
            //if the number is divisable by two, print 2 and divide
            System.out.print("2 * ");
            n /= 2;
        }
        System.out.println(n);
    }
}
        
