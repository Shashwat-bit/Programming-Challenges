import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter year: ");
        int Year= input.nextInt();

        if (Year % 4==0 && Year %100 !=0 && Year %400!=0 ){
            System.out.println("Given year is Leap Year");
        }else if (Year %4==0 && Year %100 ==0 && Year %400==0){
            System.out.println("Given Is Leap Year");
        }else
            System.out.println("tHiS iS nOt leAp yEaR bRo");
    }
}
