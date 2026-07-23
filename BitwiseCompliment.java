import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Showcasing Bitwise compliment operator\n");
        System.out.print("Please Enter your First Number: ");
        int First= input.nextInt();

        int Result=~First;
        System.out.println("Your result is= "+First);



    }
}
