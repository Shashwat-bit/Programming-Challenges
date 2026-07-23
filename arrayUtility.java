import java.util.Scanner;
public class arrayUtility {
    public static int[] inputArray(){         //jab tk static lga hua hai tb tk class ka naam laga kr directly es mathod o us kr sktey hai
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size= input.nextInt();
        int[] Shashwat=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Please enter the element no."+(i+1)+":");
            Shashwat[i]=input.nextInt();
        }
        return Shashwat;
    }
    public static void displayArray(int[] inputArray){
        System.out.println("Your new array is now:");
        for(int i=0;i< inputArray.length;i++){
            System.out.print(inputArray[i]+ " ");
        }
        System.out.println();

    }
    public static int[][] input2DArray(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        int[][] Shashwat=new int[rows][columns];
        for(int i = 0; i< rows; i++){
            for(int j=0;j<columns;j++){
                System.out.print("please enter element row: "+(i+1)+", column: "+(j+1)+":");
                Shashwat[i][j]=input.nextInt();
            }
        }
        return Shashwat;
    }
}
