
/*
 * File: LawrencePrintMessages.java
 * --------------------------------
 * Author: Jake Lawrence
 * Date: September 9, 2015
 * 
 * I recieved help from:
 * No one
 * 
 */

/*
 * This class demonstrates calling methods
 */

public class PrintMessages{
    //calls other methods to print various messages
    public static void main(String[] args) {
        printSchool();
        System.out.println();
        printAddress();
    }
    
    //prints the name and mascot of the school
    public static void printSchool() {
     System.out.println("Medway High School");
     System.out.println("Home of the Mustangs!");
    }
    
    //prints the address of the school
    public static void printAddress() {
        System.out.println("88 Summer Street");
        System.out.println("Medway, Massachusetts");
        System.out.println("02053");
    }
}