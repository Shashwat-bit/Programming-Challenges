public class pallindrome {
    public static void main(String[] args) {
        System.out.println("check whether given array is pallindrome or not");
        int[] inputArray = arrayUtility.inputArray();
        boolean isPallin = isPallindrome(inputArray);
        if (isPallin) {
            System.out.println("Your array is pallindrome");
        } else {
            System.out.println("Your number is not pallindrome");
        }

    }

    public static boolean isPallindrome(int[] inputArray) {
        for (int i = 0; i < inputArray.length / 2; i++) {
            if (inputArray[i] != inputArray[(inputArray.length - 1) - i]) {
                return false;
            }
        }
        return true;
    }
}