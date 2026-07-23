import java.util.Scanner;

public class tableMultiplication {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("TABLE/PAHADA padhne aaye hoo...");
        System.out.print("baatao kiska table padhna hai?=");
        int num= input.nextInt();

        printMultiplicationTable(num);



        }

    public static void printMultiplicationTable(int num) {
        int i =1;
        while (i<=100){
            System.out.println(num+"X"+i+"="+(num*i));
            i++;
        }

    }


        }




