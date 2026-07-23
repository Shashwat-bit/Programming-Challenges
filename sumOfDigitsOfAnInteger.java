import java.util.Scanner;

public class sumOfDigitsOfAnInteger {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the your desired integer=");
        int Num = input.nextInt();
        int Summ=SumOfDigits(Num);
        System.out.println("Your desired number is="+Summ);
        System.out.println("RAJA MENTALITY SAHAB CODE IS RUNNING SAHAB");
    }
    public static int SumOfDigits(int Num){
        int Sum=0;
        while(Num>0){
            Sum=Sum+Num%10;
            Num=Num/10;
        }
        return Sum;
    }
}
