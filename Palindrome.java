import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Check whether the no. is palindrome or not");
        System.out.print("Enter the given num=");
        int num=input.nextInt();
        int palindrome=reverse(num);
        if (palindrome==num){
            System.out.println("your no. is palindrome "+num+" iska ulta dekhle yhi hai "+palindrome);
        }else {
            System.out.println("your number is not palindrome "+num+" iska ulta ye thodi hai "+palindrome);
        }
    }
    public static int reverse(int num){
        int sum=0;            //this will store the reversed number
        while(num>0){
            int digit=num%10;      //bring the last digit
            sum=sum*10+digit;      //append digits to the reversed number
            num=num/10;            //remove the last digit
        }
        return sum;
    }
}



