/* 
 * File: LawrenceCountLetters.java
 * -------------------------------
 * Author: Jake Lawrence
 * Date: November 11, 2015
 * 
 * I recieved help from:
 * no one
 */

import java.util.*;

/*
 * This counts the letters in a string entered by the user
 */

public class LawrenceCountLetters {
    
    // gets a string from the user and calls countLetters
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        System.out.print("Please enter a string: ");
        
        String s = console.nextLine();
        
        System.out.println("Counted " + countLetters( s ) + " letters\n");
        
        System.out.print("Please enter a character: ");
        
        char ch = console.nextLine().charAt(0);
        
        isNothing(ch);
        
        System.out.print("Please enter another character: ");
        
        ch = console.nextLine().charAt(0);
        
        /* 
         * getNUmericValue accepts a char as a parameter and returns the numeric value of the character is numeric form.
         * This could be used fo some interesting textual programs
         */
        System.out.println("The numeric value of \"" + ch + "\" is " + Character.getNumericValue(ch) + "\n");
        
        System.out.print("Please enter character #1: ");
        ch = console.nextLine().charAt(0);
        System.out.print("Please enter character #2: ");
        char cht = console.nextLine().charAt(0);
        
        /*
         * compare take in two characters as parameters and returns an int. he int that is returned is the difference
         * between the two chars numerically
         */
        
        System.out.println("The integer difference between \"" + ch + "\" and \"" + cht + "\" is: "
                               + Math.abs(Character.compare(ch, cht)));
    }
    
    // returns the number of letters in a string
    public static int countLetters(String phrase) {
        int count = 0;
        for (int i = 0; i < phrase.length(); i++){
            char ch = phrase.charAt(i);
            if(Character.isLetter(ch)){
                count ++;
            }
        }
        return count;
    }
    //determines if ch is whitespace
    public static void isNothing(char ch){
        /* 
         * isWhiteSpace accepts a char as a parameter and returns a boolean. 
         * The method returns true if the character is a space or whitespace, and false if it is anything else
         */
        boolean x = Character.isWhitespace(ch);
        if(x){
        System.out.println("\" \" is whitespace");
        return;
        }
        
        System.out.println("\"" + ch + "\" is not whitespace"); 
        
    }
        
        
}