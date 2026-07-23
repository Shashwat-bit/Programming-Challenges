import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your First number=");
        int first = input.nextInt();
        System.out.print("Enter thhe second number=");
        int second = input.nextInt();
        int lcmm = conditionCheck(first, second);
        System.out.println("the lcm is =" + lcmm);


    }

    public static int conditionCheck(int first, int second) {
        int i = 1;
        while (true) {
            if (i % first == 0 && i % second == 0) {
                System.out.println("LCM is " + i);
                break;  // loop ends
            } else {
                i++;  // next number check
            }

        }
        return i;

    }
}