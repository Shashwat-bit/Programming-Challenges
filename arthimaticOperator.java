import java.util.Scanner;

public class arthimaticOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("SWAGAT NAHI KAROGEY HAMARA...");
        System.out.println("ArthimaticOperator");
        System.out.print("Enter your FirstNumber= ");
        int FirstNumber= input.nextInt();
        System.out.print("Enter your SecondNumber= ");
        int SecondNumber= input.nextInt();


        int Sum=FirstNumber+SecondNumber;
        int Minus=FirstNumber-SecondNumber;
        int Multiply=FirstNumber*SecondNumber;
        int Divide=FirstNumber/SecondNumber;
        int Mod=FirstNumber%SecondNumber;


        System.out.println("ANSWER: " +Sum);
        System.out.println("ANSWER: "+Minus);
        System.out.println("ANSWER: "+Multiply);
        System.out.println("ANSWER: "+Divide);
        System.out.println("ANSWER: "+Mod);
    }
}
