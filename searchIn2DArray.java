import java.util.Scanner;
public class searchIn2DArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to searching any element in the 2d array here");
        int[][] inputArray=arrayUtility.input2DArray();
        System.out.print("Enter the elemtn you wanna search here: ");
        int num= input.nextInt();
        boolean isFound=search(inputArray,num);
        if(isFound){
            System.out.println("Your element found in the array");
        }else{
            System.out.println("Your element not found in the array");
        }
    }
    public static boolean search(int[][] inputArray,int num){
        for(int i=0;i< inputArray.length;i++){
            for(int j=0;j< inputArray.length;j++){
                if(inputArray[i][j]==num){
                    return true;
                }
            }
        }
        return false;
    }
}
