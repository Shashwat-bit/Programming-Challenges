import java.util.Scanner;

public class ageGroup {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your age=");
        int Age= input.nextInt();



        if (Age<13){
            System.out.println("Child");
        }else if (Age<20 ){
            System.out.println("TEEN");
        }else if (Age<=60){
            System.out.println("ADULT");
        }else
            System.out.println("Senior Citizen");
        System.out.println("TOO HO GYA NA FAISLA");
    }
}
