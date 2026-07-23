import java.util.Scanner;

public class productOfFloatingPointNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("HI! I AM SHIVAJI THE BUDDY COOL!!");
        System.out.println("HI,SHIV U GOTT'A MAIL");
        System.out.println("WANNA CALCULATE PRODUCT OF ANY TWO FLOATING NUMBER?");
        System.out.print("ENTER YOUR FIRST NUMBER: ");
        float First= input.nextFloat();
        System.out.print("ENTER YOUR SECOND NUMBER PLEASE: ");
        float Second= input.nextFloat();
        float Product=First*Second;
        System.out.println("YOUR FINAL ANSWER IS: "+Product);
    }
}
