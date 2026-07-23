import java.util.Scanner;

public class codeForces {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        //Alice and bob are two players so firstly taking input of their integer//
        //System.out.println("Enter the p value= ");commenting this out just take value of p on blank screen
        int p= input.nextInt();

        //System.out.println("Enter the q value= ");commenting this out just take value of q on blank screen
        int q= input.nextInt();

        if(3*p==2*q){
            System.out.println("BOB");
        }else{
            System.out.println("ALICE");
        }
    }
}
