import java.util.Scanner;

public class fahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Convert degree Fahrenheit to degree celsius: ");
        double Fahr= input.nextDouble();
        System.out.println("COOL!!\n");
        System.out.println("PROCESSING....");
        System.out.println("PROCESSING....");
        double Convert=(Fahr-32)*5/9;
        System.out.println("The temperature in degree celsius is: "+Convert);
    }
}
