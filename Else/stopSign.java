
/*
 * File Name: stopSign.java
 * ------------------------
 * Author:Jake Lawrence
 * Date: September 10, 2015
 * 
 * I recieved help from:
 * No one
 * 
 */

/*
 * This class creates a stop sign and the shapes that a stop sign is made up of using various methods
 */

public class stopSign{
    
    public static void main(String[] args){
     top();
     bottom();
     System.out.println();
     bottom();
     plusLine();
     System.out.println();
     top();
     stop();
     bottom();
     System.out.println();
     top();
     plusLine();
    }
    
    //this method creates the top of a stop sign
    public static void top(){
        System.out.println("  ______  ");
        System.out.println(" /      \\ ");
        System.out.println("/        \\");
    }
    
    //this method creates the bottom of a stop sign
    public static void bottom(){
     System.out.println("\\        /");
     System.out.println(" \\______/");
    }
    
    //this method creates a plus line
    public static void plusLine(){
     System.out.println("+--------+");   
    }
    
    //this method creates the middle of a stop sign
    public static void stop(){
     System.out.println("|  STOP  |");   
    }


    
}
    