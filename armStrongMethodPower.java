import java.util.Scanner;

public class armStrongMethodPower {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("See what's your given no. is  armStrong or not....");
        System.out.print("Enter your number please=");
        int num=input.nextInt();
        int first=firstFunction(num);
        int second=secondFunction(num);

        if (second==num){
            System.out.println("HAI SASSUR");
        }else {
            System.out.println("NAHI HAI SASSUR");
        }
    }
    public static int firstFunction(int num){
        int count =0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;

    }
//    public static int secondFunction(int num){
//         int sum=0;
//       int digits= firstFunction(num);
//
//        while (num>0){
//            sum=sum+(num%10)^digits
//            num=num/10;

    public static int secondFunction(int num) {

        int sum = 0;
        int digits = firstFunction(num); // number of digits

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (int)Math.pow(digit, digits); // raise digit^digits
            num = num / 10;
        }
        return sum;
    }

}
