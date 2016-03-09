
/*
 * ROCKETSHIP|DrJava
 * ----------------------
 * Made by Jacob Lawrence
 * September 9 2015
 * 
 * This class will create two rocket ships with United States in the middle.
 * I got help from no one because I am amazing.
 */

public class RocketShips{
    public static void main(String[] args){
        top();
        sqr();
        1spudnik();
        sqr();
        top();
    }
    //this method prints out the top of the rocket and the flames below
    public static void top(){
        System.out.println("   / \\       / \\"); //3 spaces in front, 7 between, 0 for slop
        System.out.println("  /   \\     /   \\");//2 spaces in front, 5 between, 2 for slope
        System.out.println(" /     \\   /     \\");//1 space in front, 3 between, 2 for slope
    }
    //this method prints the blank spaces on the rocket
    public static void sqr(){
        System.out.println("+-------+ +-------+");
        System.out.println("|       | |       |");
        System.out.println("|       | |       |");
        System.out.println("+-------+ +-------+");
    }
    //this method prints out spudnik within the rocket
    public static void 1spudnik(){
        System.out.println("|Soviet | |Soviet |");
        System.out.println("|Spudnik| |Spudnik|");
    }
        
}