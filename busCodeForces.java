
import java.util.Scanner;

public class busCodeForces {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();   // number of buses
        int m = input.nextInt();   // number of people
        int l = input.nextInt();   // length of road
        int x = input.nextInt();   // bus speed
        int y = input.nextInt();   // walking speed

        //storing buses wala hessab kitaab//
        int[] s = new int[n];
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = input.nextInt();
            t[i] = input.nextInt();
        }
        //storing person wala hessab kitaab//
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = input.nextInt();
        }
    }


}
