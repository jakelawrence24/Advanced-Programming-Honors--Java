public class forLoop{
    public static void main(String[] args){
        fi();
        System.out.println();
        si();
        System.out.println();
        se();
        System.out.println();
        ni();
    }
    
    public static void fi(){
        int j = 0;
        for(int k = 1; k <=3; k++){
            for(int i = 0; i <= 9; i++){
                for(int h = 1; h <= 3;h++){
                    System.out.print(j);
                }
                j++;
            
            }
            j = 0;
            System.out.println();
        }
        
    }
    
    public static void si(){
        int j = 9;
        for(int k = 1; k <=5; k++){
            for(int i = 0; i <= 9; i++){
                for(int h = 1; h <= 5;h++){
                    System.out.print(j);
                }
                j--;
            
            }
            j = 9;
            System.out.println();
        }
        
    }
    
    public static void se(){
        int j = 9;
        for(int k = 1; k <=4; k++){
            for(int i = 0; i <= 9; i++){
                for(int h = 1; h <= j;h++){
                    System.out.print(j);
                }
                j--;
            
            }
            j = 9;
            System.out.println();
        }
        
    }
    
    public static void ni(){
        for(int i = 0; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("\\\\");
            }
            for(int j = 1; j<= 20 - i * i; j+=3){
                System.out.print("!!");
            }
            for(int j = 1; j <= i; j++){
             System.out.print("//");   
            }
            System.out.println();
            }
    }
            
    
    
}
    
    