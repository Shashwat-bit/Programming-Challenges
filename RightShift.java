import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("SHOWING showcase RightShift operator= ");
        System.out.print("enter your no.= ");
        int num= input.nextInt();


        int result= num>>1;
        System.out.println("your result is "+result);
    }
}


