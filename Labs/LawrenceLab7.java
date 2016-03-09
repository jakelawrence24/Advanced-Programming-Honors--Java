/*
 * File:LawrenceLab7.java
 * -----------------------
 * Author: Jake Lawrence 
 * Date: November 3, 2015
 * 
 * I recieved help from:
 * no one
 *
 */

import java.util.*;

/*
 * This class calculates the bmi of the user and determines the condition the person's bmi is in
 */
public class LawrenceLab7{
  //driver for the class
  public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    
    double h, w, bmi;
    
    String ans;
    
    System.out.print("Enter your height in inches: ");
    h = s.nextDouble();
    System.out.print("Enter your weight in pounds: ");
    w = s.nextDouble();
    bmi = (w / Math.pow(h,2)) * 703;
    ans = bmic(h,w,bmi);
    System.out.println("A person who is " + h + " inches tall and weighs " + w + " pounds has a BMI of " + bmi +
                     " and is considered " + ans);
  }
  //determines if the person is underweight, normal, overweight, or obese
  public static String bmic(double h,double w,double bmi){
    if(bmi < 18.5){
      return "underweight";
    }
    if(bmi < 25){
      return "normal";
    }
    if(bmi < 30){
      return "overweight";
    }
      return "obese";
  }
}
    
    
    
    
    
    