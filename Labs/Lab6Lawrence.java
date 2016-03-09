/*
 * File: Lab6Lawrence.java
 * -----------------------
 * Author: Jaka Lawrence
 * Date: October 26, 2015
 * 
 * I recieved help from:
 * no one
 */

/*
 * This class takes a name(string) and produces the gangsta name
 */

import java.util.*;

public class Lab6Lawrence{
    //takes input and calls compton
    public static void main(String[] args){
        //initializes scanner
        Scanner scanner = new Scanner(System.in);
        //initializes gangsta name
        String gname;
        
        System.out.print("Type your name, playa.");
        //takes the next string
        String name = scanner.nextLine();
        //sets gname to the name put through compton
        gname = compton(name);
        System.out.print("Your gangsta name is \"" + gname + "\"");
    }
    //this method consumes a name(string) and changes it to a gangsta name
    public static String compton(String name){
        String gname, gfname,gmname,glname;
        //gangsta name first part
        gfname = (name.substring(0,1)) + ". Diddy";
        //gangsta name middle part
        gmname = name.substring( name.indexOf(" ") , name.length() ).toUpperCase();
        //gangsta name last part
        glname = name.substring(0, name.indexOf(" ")) + "-izzle";
        //concatenates the gnames together
        gname = gfname + gmname + " " + glname;
        
        return gname;
    }
}
        
        