public class mergingSortedArray {
    public static void main(String[] args) {
        System.out.println("Merge 2 Sorted array here");
        int[] array1=arrayUtility.inputArray();
        int[] array2=arrayUtility.inputArray();
        int[] newArray=merged(array1,array2);
        arrayUtility.displayArray(newArray);
    }
    public static int[] merged(int[] array1,int[] array2){
        int[] newArray=new int[array1.length+ array2.length];
        int i=0; //array1 pointer
        int j=0; //array2 pointer
        for(int k=0;k< newArray.length;k++){//hmesha newArray chalta rhnaa chahyee
            if(j== array2.length||i< array1.length && array1[i]<array2[j]){ //case1)array 2 is finished or i ka length over nhihua hai && i chota hai jth element say tb tu new array mai ith element daalkr i++ krde else niche wala..
                newArray[k]=array1[i];
                i++;
            }else{
                newArray[k]=array2[j];
                j++;
            }
        }
        return newArray;
    }
}
