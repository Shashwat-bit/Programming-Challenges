import java.util.Scanner;
public class squareCodeForces{
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        int t=input.nextInt();
        while(t>0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();

            if (a == b && b == c && c == d) {
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }
            t--;
        }

    }
}
