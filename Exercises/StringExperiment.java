/*
 * Jake Lawrence
 * 
 * Credit
 * 
 * I swear, on my honor, that all work on this assignment was mine
 * and that I had no help from any other individual
 */

/* 
 * This class demonstrates some of the things that can be done with 
 * String objects
 */

public class StringExperiment {
    //does various things with strings
    public static void main(String[] args) {
        String first = "Hello";
        String second = "world";
        String newString = first + " " + second + "!";
        System.out.println("newString: " + newString);
        System.out.println("The length of newString: " + newString.length());
        System.out.println("The first character in newString is " + newString.charAt(0));
        System.out.println("The first last in newString is " + newString.charAt(newString.length() - 1));
        System.out.println("The first word in new string is " + newString.substring(0, newString.indexOf(" ")));
        System.out.println(newString.toLowerCase());
        System.out.println(newString.toUpperCase());
    }
}
        