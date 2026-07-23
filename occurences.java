import java.util.Scanner;
public class occurences {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] tiyu=arrayUtility.inputArray();
        System.out.println("Check the number of occurences");
        System.out.print("Your number is: ");
        int check=input.nextInt();
        int Times=occur(tiyu,check);
        System.out.print("Your number was found"+ Times+"   in the array");

    }
    public static int occur(int[] tiyuuuu,int checkk){
        int occurencess=0;
        for(int i=0;i< tiyuuuu.length;i++) {
            if (tiyuuuu[i] == checkk) {
                occurencess++;
            }
        }
          return occurencess;

    }
}
