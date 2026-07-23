import java.util.Scanner;

public class arraySearching {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] myArray={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println("Enter the no. you want to search");
        System.out.print("Enter your number: ");
        int num= input.nextInt();
        boolean isFound=isFound(myArray,num);
        if(isFound){
            System.out.println("your number was found in the array");
        }else{
            System.out.println("your no. is not found in the array");
        }

    }
    public static boolean isFound(int[] myArray,int num) {
        int index = 0;
        while (index<myArray.length) {
            if (myArray[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}
