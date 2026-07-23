import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Greet();
        int First= readNumber();

        int Second=readNumber();

        int Sum=First+Second;
        System.out.println("Your Answer is "+Sum);
    }
        public static void Greet(){
            System.out.println("Welcome to calculator Sasur");
        }
        public static int readNumber(){                         //bas ye para likha ab baar baar input wala mamala dekhne ki zarurar  nh hai//
            Scanner input =new Scanner(System.in);              //matter//
            System.out.print("Please enter the Number= ");      //matter//
            int Number = input.nextInt();                          //matter//
            return Number ;
        }

}
