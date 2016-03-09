public class juice{
    
    public static void main(String[] args){
        juicey();
        
         System.out.println();
         mult();
         System.out.println();
         multS();
    }
    
    public static void juicey(){
     int x = 10;  
      for(int i = x;i >= 2; i--){
            System.out.println(i+" bottles of graham on the wall,"+ i +" bottles of graham.");
            System.out.println("Take one down, pass it around, " + (i - 1) + " bottles of graham on the wall");
            
            System.out.println();
            
            x--;
          
        }
        
         System.out.println(x+" bottle of graham on the wall,"+ x +" bottle of graham.");
         System.out.println("Take one down, pass it around, " + (x - 1) + " bottles of graham on the wall");
           
    }
    
    public static void mult(){
    
    for(int i = 8; i <= 23; i+=3){
      
      System.out.println(i);
    }
    }
    
    public static void multS(){
     int x = 8;
    for(int i = x; i <= 23; i+=3){
      for(int y = i; y > 0; y--){
        System.out.print("#");
      }
      System.out.println();
    }
    }
}


  
    
    
        
    