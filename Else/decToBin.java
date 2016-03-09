import java.util.Scanner;

public class decToBin{
    public static void main(String[] args){
        Scanner reader = new Scanner (System.in);
        
        double x;
        double y;
        
        System.out.print("Enter the number in decimal that you would like to convert to binary: ");
        x = reader.nextInt();
        System.out.print(x + " converted to binary is: ");
        pOfTwoLim(x);
        y = pOfTwoLim(x);
        convertDec(x,y);
        
    }
    
    public static void convertDec(double x, double y){
        double p = y;
        for(double i = p; i >= 1; i/=2){
           
                                     
            if((x-p) >= 0){
                System.out.print("1");
                x-=p;
            }else{
                System.out.print("0");
            }
            p/=2;
        }
    }
    
    public static double pOfTwoLim(double x){
       double y = x;
       double g = 0;
       //double t = 0;
       for(double i = 0; y  >= Math.pow(2,i);i++){
           //double g;
           g = (double) Math.pow(2,i);
           //System.out.prdouble(g + "  ");
           
    }
      return (int) g; 
       
    }
            
}
