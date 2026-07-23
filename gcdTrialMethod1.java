import java.util.Scanner;

public class gcdTrialMethod1 {       //METHOD #1 HAI
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your First number=");
        int first = input.nextInt();
        System.out.print("Enter your second number=");
        int second = input.nextInt();
        int gcd=gcd(first , second);
        System.out.println("your gcd is "+gcd);
    }
    public static int gcd(int num1 , int num2 ) {
        int least = least(num1, num2);
        while (1 <= least) {
            if (num1 % least == 0 && num2 % least == 0) {
                return least;
            }
                least--;
            }
        return least;
    }
    public static int  least(int num1 , int num2 ){
        if (num1<num2){
            return num1;
        }else{
            return num2;
        }
    }
}