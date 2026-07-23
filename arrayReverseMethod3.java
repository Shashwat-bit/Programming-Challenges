public class arrayReverseMethod3 {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reversal...");
        int[] inputArray = arrayUtility.inputArray();
        int[] reversedArray = reverse(inputArray);
        arrayUtility.displayArray(reversedArray);
    }

    public static int[] reverse(int[] inputArray) {
        int[] newArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            newArray[i] = inputArray[(inputArray.length - 1) - i];
        }
        return newArray;
    }
}
