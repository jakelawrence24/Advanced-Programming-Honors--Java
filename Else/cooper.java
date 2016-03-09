import java.util.Scanner;

public class cooper{
    public static void main(String[] args){
     Scanner reader = new Scanner (System.in);
     
     System.out.print("Enter the length of the line: ");
     int len = reader.nextInt(); 
     line(len);   
     System.out.println();
    }
    
    public static void line(int length){
        for(int i = 1; i <= length; i++){
            System.out.print("*");
        }
    }
}