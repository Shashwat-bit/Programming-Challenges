import java.util.Scanner;

public class oddYaEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tum sassur turant pta lga logey sassur ki Odd hai Ya Even...");
        System.out.print("Enter your number=");
        float Number = input.nextFloat();
        if (Number % 2== 0) {
            System.out.println("Tumharo no. sassur Even Haigo");
        } else {
            System.out.println("Tumharo no. sassur ODD Haigo");
        }
    }
}
