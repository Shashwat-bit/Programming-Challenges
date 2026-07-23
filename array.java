import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        System.out.println("Array Sum and Average ");
        int[] tiyu=arrayUtility.inputArray();//class ka naam likh kr ke hum dot laga kr method likh diye or call kr liya
        long sum=sum(tiyu);
        int average=average(tiyu);
        System.out.println("Sum of the numbers is: "+sum);
        System.out.println("Average of the numbers is: "+average);
    }
    public static long sum(int[] tiyuuuu){
        int sum=0;
        for(int i=0;i< tiyuuuu.length;i++){
            sum=sum+tiyuuuu[i];
        }
        return sum;
    }
    public static int average(int[] tiyuuuu){
        long sum=sum(tiyuuuu);
        return (int)sum/ tiyuuuu.length;
    }
}
