/*
 * File: LawrenceLab8.java
 * -----------------------
 * Author: Jake Lawrence
 * Date: November 3, 2015
 * 
 * I recieved help from:
 * no one
 */

import java.util.*;


//this class determines what quadrant the coordinates are in
public class LawrenceLab8{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        double x, y;
        
        String qn;
        //takes in the x and y coordinates
        System.out.print("Enter an x value: ");
        x = s.nextDouble();
        System.out.print("Enter an y value: ");
        y = s.nextDouble();
        
        qn = qd(x,y);
        
        System.out.println("The point (" + x + ", " + y + ") " + qn);
        
        
    }
    //determines the quadrant of the point
    public static String qd(double x, double y){
        if(x == 0 && y == 0){
            return "resides on an axis! The origin to be exact.";
        }
        if(x == 0 && !(y == 0)){
            return "resides on an axis! The y-axis to be specific.";
        }
        if(!(x == 0) && y == 0){
            return "resides on an axis! The x-axis to be specific.";
        }
            
        if(x < 0 && y < 0){
            return "resides in Quadrant 3";
        }
        if(x < 0 && y > 0){
            return "resides in Quadrant 2";
        }
        if(x > 0 && y < 0){
            return "resides in Quadrant 4";
        }
        return "resides in Quadrant 1";
    }
}
        
        
        
        
        
        
        
        