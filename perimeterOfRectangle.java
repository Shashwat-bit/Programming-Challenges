import java.util.Scanner;

public class perimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("CALCULATE PERIMETER OF Rectangle");
        System.out.print("ENTER LENGTH: ");
        Double Length= input.nextDouble();
        System.out.println("COOL!!");
        System.out.print("NOW PLS ENTER BREADTH of Rectangle: ");
        Double Breadth= input.nextDouble();
        Double Perimeter=Length+Breadth+Length+Breadth;
        System.out.println("Perimeter Of Rectangle Is:  "+Perimeter);

    }
}
