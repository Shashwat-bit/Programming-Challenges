import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("WELCOME TO SWAPPING STATION");
        System.out.print("ENTER YOUR FIRST NO: a=");
        int a=input.nextInt();
        System.out.print("COOL,\nPLEASE ENTER YOUR SECOND NO: b=");
        int b= input.nextInt();
        System.out.println("GOT YOU BOTH INPUTS:\n processing.....\nprocessing.....\nprocessing.....");
        int c;
        c=a;
        a=b;
        b=c;
        int OP=a;

        int OOP=b;
        System.out.println("AFTER SWAPPING \"A\" BECOMES: a="+OP);
        System.out.println("AFTER SWAPPING \"B\" BECOMES: b="+OOP);



    }
}
