/*
 * File: Lab4Lawrence
 * ------------------
 * Author: Jake Lawrence
 * Date: October 2, 2015
 * 
 * I recieved help from:
 * No one
 */

/*
 * This class demonstrates the use of for loops to produce complex figures
 */
public class Lab4Lawrence{
    //initializes the length of the array
    //CHANGE THIS NUMBER TO YOUR DESIRED LENGTH OF THE ARRAY
    public static final int LOA = 5;
    //initializes the height of the array
    //CHANGE THIS NUMBER TO YOUR DESIRED HEIGHT OF THE ARRAY
    public static final int HOA = 5;
    
    //initializes the length of the cartesian grid
    //CHANGE THIS NUMBER TO YOUR DESIRED LENGTH OF THE CARTESIAN GRID
    public static final int LOCC = 12;
    //initializes the length of the cartesian grid
    //CHANGE THIS NUMBER TO YOUR DESIRED HEIGHT OF THE CARTESIAN GRID
    public static final int HOCC = 18;
    
    //initilizes the height of the staircase
    //CHANGE THIS NUMBER TO YOUR DESIRED HEIGHT OF THE STAIRCASE
    public static final int HOSC = 12;
    //initializes the size of the slash figure
    //CHANGE THIS NUMBER TO YOUR DESIRED SIZE OF THE SLASH FIGURE
    public static final int SSIZE = 6;
//this method calls other methods to perform other tasks
    public static void main(String[] args){
        arrayOf25();
        System.out.println();
        cartesianCoordinates();
        System.out.println();
        staircaseGoingUp();
        System.out.println();
        SlashFigure();
    }
    //prints out an array of ascending numbers
    public static void arrayOf25(){
        int k = 1;
        //amount of rows
        for(int i = 1; i <= HOA; i++){
          //amount of columns
            for(int j = 1; j <= LOA; j++){
                System.out.print(k + "\t");
                k++;
            }
            //new line
            System.out.println();
        }
    }
    //prints out the sum of coordinates as the grid prints out
    public static void cartesianCoordinates(){
      //amount of rows
        for(int i = 1; i <= HOCC; i++){
          //amount of columns
            for(int j = 1; j <= LOCC; j++){
             System.out.print((j + i)+"\t");   
            }
            //new line
            System.out.println();
        }
    }
    //initializes HOSTC to be twice as great as HOSC
    public static final int HOSTC = HOSC * 2;
    //prints an ascending staircase made of []s
    public static void staircaseGoingUp(){
      //amount of rows
        for(int i = 1; i <= HOSTC; i+=2){
          //amount of spaces
            for(int j = HOSTC - i; j > 0; j-=2){
                System.out.print("  ");
            }
            //amount of []s
            for(int k = HOSTC - (HOSTC - i); k > 0; k-=2){
                System.out.print("[]");
            }
            //new line
            System.out.println();
        }
            
    }
    //initializes SLASHC to be one greater than SSIZE
    public static final int SLASHC = SSIZE + 1;
    //prints out a figure of many \s, !s, and /s
    public static void SlashFigure(){
      //amount of rows
        for(int i = 0; i < (SLASHC - 1); i++){
            //amount of \s
            for(int j = ( ( (SLASHC * 4) - 2) - i); j < ( (SLASHC * 4) - 2); j++){
                System.out.print("\\");
            }
            //amount of !S
            for(int j = ( ( ( (SLASHC * 4) - 2) - 4) - (i*2) ); j > 0; j--){
                System.out.print("!");
            }
            //amount of /s
            for(int j = ( ( (SLASHC * 4) - 2) - i); j < ( (SLASHC * 4) - 2); j++){
                System.out.print("/");
            }
            //new line
            System.out.println();
        }
    }
    
}