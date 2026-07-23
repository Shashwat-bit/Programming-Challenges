import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("SHOWING showcase LeftShift operator= ");
        System.out.print("enter your no.= ");
        int num= input.nextInt();


        int result= num<<2;
        System.out.println("your result is "+result);
    }
}
