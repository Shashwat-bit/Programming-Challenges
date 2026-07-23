import java.util.Scanner;

public class prime{
  public static void main(String[]args){
      Scanner input=new Scanner(System.in);
      System.out.println("Given no.prime hai ya nahi ye check karnay ke liye");
      System.out.print("Enter the given number=");
      int num=input.nextInt();
      
      boolean isPrime=isPrime(num);
      if(isPrime){
      System.out.println("Prime hai yaar");
      }else{
      System.out.println("Prime nahi hai");
      }
   } 

      
      public static boolean isPrime(int num){
            int i=2;
               while(i<num){
            if (num%i==0){
            return false;
            }
            i++;
         
           } 
           return true;
      }
}	