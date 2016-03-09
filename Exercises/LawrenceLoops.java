public class LawrenceLoops{
    public static void main(String[] args){
        countUp();
        System.out.println();
        countDown();
        System.out.println();
        evenNumbers();
        System.out.println();
        oddNumbers();
        System.out.println();
        totalCount();
    }
    //counts up from 0 to 20
    public static void countUp(){
        for(int i = 1; i < 21; i++)
            System.out.print(i+" ");
    }
    //counts down from 20 to 0
    public static void countDown(){
        for(int i = 20; i > 0; i--)
            System.out.print(i+" ");
    }
    //produces the even numbers between 30 and 80
    public static void evenNumbers(){
        for(int i = 30; i < 81; i+=2){
            System.out.print(i+" ");
        }
    }
    //produces the odd numbers between 99 and 155
    public static void oddNumbers(){
        for(int i = 99; i < 156; i+=2){
            System.out.print(i+" ");
        }
    }
    //produces the sum from numbers 43 to 57
    public static void totalCount(){
        int x = 0;
        for(int i = 43; i <= 57; i++)
        {
            
            x+=i;
        if (i >= 57){
            System.out.println(x);
        
    }
    }
    }
}