import java.util.Scanner;

public class compoundIntrest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("HI,I AM SHIVAJI THE BUDDY COOL!!");
        System.out.println("HI,SHIVA U GOTT'A MAIL");
        System.out.println("CALCULATE COMPOUND INTERST IN FRACTION OF SECONDS");
        System.out.print("ENTER YOUR LOAN AMOUNT: ");
        Float Principle=input.nextFloat();
        System.out.print("ENTER INTERST RATE(%) PER ANNUM: ");
        Float Interst=input.nextFloat();
        System.out.print("LOAN AMOUNT REPAYMENT PERIOD(in years): ");
        Float time=input.nextFloat();
        Double ans= Math.pow(Principle*(1+Interst/100), time);
        System.out.println("GRAND VALUE TO PAY TOTAL: "+ans);
        Double anss=ans-Principle;
        System.out.println("COUMPOUNDED MONEY ONLY: "+anss);


    }
}
