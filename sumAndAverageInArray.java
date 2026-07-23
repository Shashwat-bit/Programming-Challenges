import java.util.Scanner;

public class sumAndAverageInArray {
    public static void main(String[] args) {
        System.out.println("WELCOME TO SUM AND AVERAGE CALCULATOR: ");
        int[] numArray = arrayUtility.inputArray();
        long sum=sum(numArray);
        int avg=avg(numArray);
        System.out.println("Sum of the given elements indiviually is: "+sum);
        System.out.println("Avg of the given elements indivially is: "+avg);


    }
    public static long sum(int[] numArray){
        long sum=0;
        int i=0;
        while(i<numArray.length){
            sum=sum+numArray[i];
            i++;
        }
        return sum;
    }
    public static int avg(int[] numArray){
        long sum=sum(numArray);
        return (int) (sum/ numArray.length);
    }
}



















