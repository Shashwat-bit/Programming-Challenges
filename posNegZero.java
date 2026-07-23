import java.util.Scanner;

public class posNegZero {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number= ");
        float Number=input.nextFloat();
        if (Number > 0) {
            System.out.println("Positive no. hai ye sassur");
        }else if(Number<0){
            System.out.println("Negative hai ye sassur");
        }else {
            System.out.println("Zero kyu daal dao tumne sassur");
        }
        }
    }

