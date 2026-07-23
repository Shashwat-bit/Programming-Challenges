import java.util.Scanner;

public class simpleIntrest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("HI,I AM SHIVAJI THE BUDDY COOL!!");
        System.out.println("HI,SHIVA U GOTT'A MAIL");
        System.out.println("CALCULATE SIMPLE INTERST IN FRACTION OF SECONDS");
        System.out.print("ENTER YOUR LOAN AMOUNT: ");
        Float Principle=input.nextFloat();
        System.out.print("ENTER INTERST RATE(%) PER ANNUM: ");
            Float Interst=input.nextFloat();
        System.out.print("LOAN AMOUNT REPAYMENT PERIOD(in years): ");
        Float Time=input.nextFloat();

        Float Final=Principle*Interst*Time/100;
        Float Finall=Final+Principle;
        System.out.println("After simple interst for "+ Time+" your amount will become: "+Final);
        System.out.println("TOTAL AMOUNT TO REPAY AFTER "+Time+"WILL BE: "+Finall);
    }
}
