import java.util.Scanner;
public class arrayUtility {
    public static int[] inputArray(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size= input.nextInt();

        int[] arr=new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter enter element number "+(i+1)+":");
            arr[i]= input.nextInt();
            i++;
        }
        return arr;


    }
}
