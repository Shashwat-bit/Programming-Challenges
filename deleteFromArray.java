import java.util.Scanner;
public class deleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array deletion");
        int[] inputArray = arrayUtility.inputArray();
        System.out.print("Enter the number you want to delete: ");
        int numToDelete = input.nextInt();
        int[] newArray = deleteNumber(inputArray, numToDelete);
        arrayUtility.displayArray(newArray);
    }
    public static int[] deleteNumber(int[] inputArray, int numToDelete) {
        int occur = occurences.occur(inputArray, numToDelete);
        if (occur == 0) {
            return inputArray;
        }
        int newSize = inputArray.length - occur;
        int[] newArray = new int[newSize];
        int j = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (numToDelete != inputArray[i]) {
                newArray[j] = inputArray[i];
                j++;
            }
        }
        return newArray;
    }
}