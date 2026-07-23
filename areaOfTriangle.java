import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Calculate Area Of Triangle");
        System.out.print("Enter Base Of Triangle: ");
        double Base= input.nextDouble();
        System.out.print("Enter Height Of Triangle: ");
        Double Height = input.nextDouble();
        Double Area=(Base*Height)/2;
        System.out.println("Area Of Triangle is= "+Area+"cms2");
    }
}
