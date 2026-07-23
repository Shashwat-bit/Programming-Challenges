import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Showcasing Bitwise and operator\n");
        System.out.print("Please Enter your First Number: ");
        int First= input.nextInt();
        System.out.print("Enter the Second Number: ");
        int Second = input.nextInt();


        int Result=First & Second;
        System.out.println("Your ans is= "+Result);
    }
}
