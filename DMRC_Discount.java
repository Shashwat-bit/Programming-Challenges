import java.util.Scanner;

public class DMRC_Discount {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("DMRC FARE DISCOUNTS");
        System.out.print("Enter your age=");
        int Age= input.nextInt();
        System.out.print("Are you Female?(True/False): ");
        boolean isFemale=input.nextBoolean();

        if (Age<5){
            System.out.println("You Got 75% Discount");
        }else if (isFemale){
            System.out.println("You got 50% Discount");
        }else if (Age>60 && !isFemale) {
            System.out.println("You Got 25% Discount");
        }else {
            System.out.println("TERE LIYE KOI DISCOUNT NAHI PURA BHADA BHARNA HAI TUJHE");
        }


    }
}
