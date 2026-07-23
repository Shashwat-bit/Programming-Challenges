public class sumAndAverage2DArray {
    public static void main(String[] args) {
        System.out.println("Get Sum and Average of any 2D Array");
        int[][] inputArray=arrayUtility.input2DArray();
        int sum=sum(inputArray);
        System.out.println("Your final Sum is:" +sum);
        int finalAverage=average(inputArray);
        System.out.println("your average is:"+finalAverage);
    }
    public static int sum(int[][] inputArray){
        int finalSum=0;
        for(int i=0;i< inputArray.length;i++){
            for(int j=0;j< inputArray.length;j++){
                finalSum=finalSum+inputArray[i][j];
            }
        }
        return finalSum;
    }
    public static int average(int[][] inputArray){
        int finalSum=sum(inputArray);
        int average=finalSum/inputArray.length;
        return average;
    }

}
