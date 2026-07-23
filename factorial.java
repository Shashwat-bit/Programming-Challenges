import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Program hai Sahab.....");
        System.out.print("Enter Your Desired Number=");
        long num= input.nextInt();
        long Sum= factorial(num);
        System.out.print("="+Sum);


    }
    public static long factorial(long num){
        long Factorial=1;
        long i =1;
        while(i<=num){
            if (i == num)
                System.out.print(i);
            else
                System.out.print(i +"x");

            Factorial=Factorial*i;
            i=i+1;
        }
        return Factorial;
    }
}
