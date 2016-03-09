public class MethodPrac{
    public static void main(String[] args){
        function_1();
        System.out.println();
        function_2();
        System.out.println();
        function_3();
        System.out.println();
    }
    public static void function_1(){
     System.out.println("I am function 1");   
    }
    public static void function_2(){
     System.out.println("I am function 2");
        function_1();
     System.out.println("Stay out of my function!");
    }
    public static void function_3(){
     System.out.println("I am function 3");
     System.out.println("I am the best function.");
    }
}
        