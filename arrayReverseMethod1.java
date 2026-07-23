public class arrayReverseMethod1 {
    public static void main(String[] args) {
        System.out.println("Welcome to reversal of array");
        int[] inputArray=arrayUtility.inputArray();
        reverse(inputArray);
        System.out.println("Your reversed array is: ");
        arrayUtility.displayArray(inputArray);
    }
    public static void reverse(int[] inputArray){
        for(int i=0;i< inputArray.length/2;i++){
            int swap=inputArray[i];
            inputArray[i]=inputArray[(inputArray.length-1)-i];
            inputArray[(inputArray.length-1)-i]=swap;
        }

    }

}
