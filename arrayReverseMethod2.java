public class arrayReverseMethod2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reversal...");
        int[] inputArray=arrayUtility.inputArray();
        int[] reversedArray=reverse(inputArray);
        arrayUtility.displayArray(reversedArray);

    }
    public static int[] reverse(int[] inputArray){
        int[] newArray=new int[inputArray.length];
        for(int i= inputArray.length-1,j=0;i>=0;i--,j++){
            newArray[j] = inputArray[i];
        }
        return newArray;
    }
}
