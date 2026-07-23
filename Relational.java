import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("DRIVING LICENSE PORTAL");
        System.out.print("Enter your age according to your Pan card: ");
        int Age=input.nextInt();
    if(Age>=18){
        System.out.println("AGE IS VERIFIED \n User is valid for applying Drive License");
    }else{
        System.out.println("AGE IS VERIFIED \n User not valid for applying Drive License");
    }
    }
}
