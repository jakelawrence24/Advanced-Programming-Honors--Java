/*
 * File: LawrenceLabThree
 * ----------------------
 * Author: Jake Lawrence
 * Date: September 21, 2015
 * 
 * I recieved help from:
 * no one
 */

/*
 * This class demonstrates Java arithmetic operators and expressions throughout multiple methods
 */

public class LawrenceLabThree{
  public static void main(String[] args){
      add();
      subtract();
      multiply();
      increment();
      decrement();
  }
  //calculates the sum of various numbers
  public static void add(){
      int a = 7;
      double b = 6.5;

      System.out.println("The value of a added to itself is: " + (a + a));
      System.out.println("The value of b added to itself is: " + (b + b));
      System.out.println("The value of a added to b is: " + (a + b));
  }
  
  //calculates the result of subtraction between various numbers
  public static void subtract(){
      int a = 7;
   
      double b = 6.5;
   
      System.out.println("The value of a subtracted from itself is: " + (a - a));
      System.out.println("The value of b subtracted from itself is: " + (b - b));
      System.out.println("The value of b subtracted from a is: " + (a - b));
  }
  
  //calculates the product of various numbers
  public static void multiply(){
      int a = 7;
   
      double b = 6.5;
   
      System.out.println("The value of a multiplied by itself is: " + (a * a));
      System.out.println("The value of b multiplied by itself is: " + (b * b));
      System.out.println("The value of a multiplied by b is: " + (a * b)); 
  }
  
  //increments a number by 1
  public static void increment(){
      int c = 10;
      System.out.println("The value of c: " + c);
      
      c++;
      
      System.out.println("Increment c...");
      System.out.println("The value of c: " + c);
  }
  
  //decrements a number by 2
  public static void decrement(){
      int c = 10;
      
      System.out.println("The value of c: " + c);
      
      c--;
      
      System.out.println("Decrement c...");
      System.out.println("The value of c: " + c);
  }
    
}