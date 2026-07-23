public class isSortedAraay {
    public static void main(String[] args) {
        System.out.println("Check whether your array is sorted or Not");
        int[] shashwat = arrayUtility.inputArray();
        boolean isIncreasing = isIncreasing(shashwat);
        boolean isDecreasing=isDecreasing(shashwat);
        if(isIncreasing || isDecreasing){
            System.out.println("array is sorted laadley");
        }else{
            System.out.println("array is not sorted laadley");
        }
    }

    public static boolean isIncreasing(int[] tiyu) {
        for (int i = 1; i < tiyu.length; i++) {
            if (tiyu[i] < tiyu[i - 1]) {    //[1,3,5,7]//if current element is less than previous element than immediate return false ki bhai ye increasing yha pr nhi h ok......
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] tiyu) {
        for(int i=1;i< tiyu.length;i++){
            if(tiyu[i]>tiyu[i-1]){            //[7,5,2,1]
                return false;
            }
        }
        return true;
    }
}