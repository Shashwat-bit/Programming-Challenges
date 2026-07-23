import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Determine any number is odd or even using Bitwise operator");
        System.out.print("Enter that digit= ");
        int Digit=input.nextInt();

        boolean isEven=(Digit & 1) ==0;
        boolean isOdd=(Digit&1)==0;

        if (isEven){
            System.out.println("yE tOo eVeN hAi lOnDeY KyA kAr rHe tUm sAsSuR ");
        }else {
            System.out.println("oDd hAiGo yE sAsSuR ");
        }

    }
}
