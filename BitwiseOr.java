import java.util.Scanner;

public class BitwiseOr {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Showcasing Bitwise or operator\n");
        System.out.print("Please Enter your First Number: ");
        int First= input.nextInt();
        System.out.print("Enter the Second Number: ");
        int Second = input.nextInt();

        int Result=First | Second;
        System.out.println("Result is: "+Result);
    }
}
