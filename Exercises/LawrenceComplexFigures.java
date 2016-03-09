/*
 * File: LawrenceComplexFigures.java
 * ---------------------------------
 * Author: Jake Lawrence
 * Date: October 1, 2015
 * 
 * I recieved help from:
 * No one
 */

/*
 * This class represents a complex figure with interchangabl sizes
 */
public class LawrenceComplexFigures {
    //constant for the size of the figure
    public static final int HIGHEST_NUMBER = 10;
    //driver method
    public static void main(String[] args) {
        //outer loop that represents the number of rows
        for (int i = 1; i < HIGHEST_NUMBER; i+=2) {
            //inner loop that represents the dashes before the numbers
            for (int j = 1;j < (HIGHEST_NUMBER + 4 - i)/2; j++) {
                System.out.print("-");
            }
            //inner loop that represents the numbers
            for (int j = 1; j <= i;j++) {
                System.out.print(i);
            }
            //inner loop that represents the dashes after the numbers
            for (int j = 1;j < (HIGHEST_NUMBER + 4 - i)/2; j++) {
                System.out.print("-");
            }
        //new line
        System.out.println();
        }
    }
}

            