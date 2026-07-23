import java.util.Scanner;

public class gcd{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the first number=");
    int first=input.nextInt();
    System.out.print("Enter the second number=");
    int second=input.nextInt();
    int gcdd=gcd(first , second);
    System.out.println("GCD of given number is="+gcdd);
  }
     public static int gcd(int num1 , int num2 ){
     int least=least(num1 , num2 );
        while(1<=least){
        if(num1%least==0 && num2%least==0){
          return least;
        }
        least--;
        }
        return least;
       
     }

    

    public static int least(int num1 , int num2 ){
       if(num1>num2){
       return num1;
       }else{
       return num2;
       }
    }

}