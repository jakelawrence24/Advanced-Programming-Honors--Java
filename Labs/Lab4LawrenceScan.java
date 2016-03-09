/*
 * File: Lab4Lawrence
 * ------------------
 * Author: Jake Lawrence
 * Date: October 2, 2015
 * 
 * I recieved help from:
 * No one
 */
import java.util.Scanner;
/*
 * This class demonstrates the use of for loops to produce complex figures
 */
public class Lab4LawrenceScan{
  //this method calls other methods to perform other tasks and also takes scanner inputs
    public static void main(String[] args){
      Scanner reader = new Scanner (System.in);
      //initializes length and height variables
      int al;
      int ah;
      System.out.print("Enter the desired length of your array: ");
      //sets length to users input
      al = reader.nextInt();
      System.out.print("Enter the desired height of your array: ");
      //sets height to user input
      ah = reader.nextInt();
      //inputs length and height variables into the arrayOf25 method
        arrayOf25(al,ah);
        System.out.println();
      
      //initializes length and height variables
      int ccl;
      int cch;
      System.out.print("Enter the desired length of your cartesian grid: ");
      //sets length to users input
      ccl = reader.nextInt();
      System.out.print("Enter the desired height of your cartesian grid: ");
      //sets height to users input
      cch = reader.nextInt();
      //inputs length and height variables into the cartesianCoordinates method
        cartesianCoordinates(ccl,cch);
        System.out.println();
      
      //initializes the height of the staircase variable  
      int ss;
      System.out.print("Enter how many steps high you would like your staircase: ");
      //sets the height to users input
      ss = reader.nextInt();
      //inputs double the height into the staircaseGoingUp method
        staircaseGoingUp(ss*2);
        System.out.println();
      
      //initializes the slash figure size variable
      int sfs;
      System.out.print("Enter the size of your desired slash figure: ");
      //sets the size to the users input
      sfs = reader.nextInt();
      //inputs one greater than the size into the slashFigure method
        SlashFigure(sfs + 1);
    }
    //prints out an array of ascending numbers
    public static void arrayOf25(int al, int ah){
        int k = 1;
        //amount of rows
        for(int i = 1; i <= ah; i++){
          //amount of columns
            for(int j = 1; j <= al; j++){
                System.out.print(k + "\t");
                k++;
            }
            //new line
            System.out.println();
        }
    }
    //prints out the sum of coordinates as the grid prints out
    public static void cartesianCoordinates(int ccl, int cch){
      //amount of rows  
      for(int i = 1; i <= cch; i++){
        //amount of columns
            for(int j = 1; j <= ccl; j++){
             System.out.print((j + i)+"\t");   
            }
            System.out.println();
        }
    }
    //prints an ascending staircase made of []s
    public static void staircaseGoingUp(int ss){
      //amount of rows  
      for(int i = 1; i <= ss; i+=2){
        //amount of spaces    
        for(int j = ss - i; j > 0; j-=2){
                System.out.print("  ");
            }
        //amount of []s    
        for(int k = ss - (ss - i); k > 0; k-=2){
                System.out.print("[]");
            }
            //new line
            System.out.println();
        }
            
    }
    //prints out a figure of many \s, !s, and /s
    public static void SlashFigure(int sfs){
      //amounts of rows  
      for(int i = 0; i < ( (sfs - 1) * 2); i+=2){
            //amount of \s
            for(int j = ( ( (sfs * 4) - 2) - i); j < ( (sfs * 4) - 2); j++){
                System.out.print("\\");
            }
            //amount of !s
            for(int j = ( ( ( (sfs * 4) - 2) - 4) - (i*2) ); j > 0; j--){
                System.out.print("!");
            }
            //amount of /s
            for(int j = ( ( (sfs * 4) - 2) - i); j < ( (sfs * 4) - 2); j++){
                System.out.print("/");
            }
            //new line
            System.out.println();
        }
    }
    
}