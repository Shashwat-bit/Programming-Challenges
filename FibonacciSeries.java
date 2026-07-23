import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Fibonacci Series turant nikaldalunga....");
        System.out.print("kaha tk chahtey ho fibonacci series nikalna? =");
        int num=input.nextInt();
        printfibonacci(num);
    }
    public static void printfibonacci(int num){
        if (num<0) return ;
        System.out.print(" 0");
        if (num==0) return ;
        System.out.print(" 1 ");

       int first=0 ,Second=1;//multiple chize initalize krke declare krna hai too ussay ek line mai bhi comma daal kar ,kar skta hai in a single line bhi....
       while (first+ Second<=num){
           int third=first+Second;
           System.out.print(third + " ");
           first=Second;
           Second=third;
       }
    }
}
