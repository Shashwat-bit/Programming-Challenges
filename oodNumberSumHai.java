import java.util.Scanner;

class  oddNumberSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Program hai Sahib.....");
        System.out.print("Enter Your Desired Number= ");
        int num= input.nextInt();
        int Sum= oddNumberSumHai(num);
        System.out.print("="+Sum);
    }
    public static int oddNumberSumHai(int num){
        int Sum=0;
        int i =1;
        while(i<=num){
            if (i + 2 > num) // I will be the last odd number
                System.out.print(i);
            else
                System.out.print(i + "+");

            Sum=Sum+i;
            i=i+2;
        }
        return Sum;
    }
}
