import java.util.Scanner;

public class armStrongVeryBasic {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Check if the given input is ArmsStrong Number or not....");
        System.out.print("Enter your Desired number here=");
        int num=input.nextInt();
        boolean isArmstrong=isArmstrong(num);
        if (isArmstrong){
            System.out.println("your no. is armstrong");
        }else {
            System.out.println("your no. is not armstrong");
        }
    }
    public static boolean isArmstrong(int num){
        int noOfDigits=noOfDigits(num);
        int numCopy=num;
        int finalNumber=0;
        while (num > 0) {
            int lastDigit=num%10;
            num=num/10;
            finalNumber+=pow(lastDigit,noOfDigits);
        }
       return finalNumber==numCopy;

    }
    public static int pow(int num1 , int num2){
        int result=num1;
        int i =1;
        while(i<num2){
            result*=num1;
            i++;
        }
        return result;
    }
    public static int noOfDigits(int num){
        int digits=0;
        while (num>0){
            digits++;
            num=num/10;
        }
        return digits;
    }
}
