/*File Name: Lab5_5Lawrence.java
 * ---------------------------
 * Author: Jake Lawrence
 * Date: October 14, 2015
 * 
 * I recieved help from:
 * no one
 */

/*
 * This class produces the powers of 2 to a maximum exponent
 */

public class Lab5_5Lawrence{
    //driver for the class
    public static void main(String[] args){
        printPowersOf2(3);
        printPowersOf2(10);
    }
    //prints the powers of two to the consumed variable p
    public static void printPowersOf2(int p){
        
        for(int i = 0; i <= p; i++){
        double x = Math.pow(2, i);
        System.out.print((int) x + " ");
    }
        System.out.println();
    }
}
                
                
        