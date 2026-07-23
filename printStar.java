import java.util.Scanner;

public class printStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("printing stars");
        System.out.print("Printing stars how many patterns?=");
        int i = input.nextInt();

        int row = 0;
        while (row < i) {
            int x = 0;
            while (x <= row) {   // print stars up to current row
                System.out.print(" * ");
                x++;
            }
            System.out.println(); // move to next line
            row++;  // increment row correctly
        }
    }
}

