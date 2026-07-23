import java.util.Scanner;

public class reverseTheDigits{
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        System.out.println("Reverse any given digit bro");
        System.out.print("Enter the given num=");
        int num=input.nextInt();
        int aagya=reverse(num);
        System.out.println("After reverse your no. is="+aagya);

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