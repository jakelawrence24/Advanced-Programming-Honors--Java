import java.util.Scanner;

public class Ham{
    public static void main(String[] args){
        Scanner user_input = new Scanner( System.in );
        
        System.out.println("What is your favorite number?");
        int x;
        x = user_input.next();
        System.out.println("Favorite number: " + x);
    }
}