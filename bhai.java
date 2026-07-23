import java.util.Scanner;

public class bhai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("TENO NO. MAI SAI KONSA SBSE BDA HAI AGR YE PTA LAGANA HAI TOO YHA AAYE");
        System.out.print("enter your first no.= ");
        float a = input.nextFloat();
        System.out.print("enter your second no.= ");
        float b = input.nextFloat();
        System.out.print("enter your third no.= ");
        float c = input.nextFloat();


        if (a >= b && a >= c) {
            System.out.println(a + " is First greatest");
        } else if (b >= c) {
            System.out.println(b + " is Second Greatest");
        } else
            System.out.println(c + " is Second Greatest");
    }
}




