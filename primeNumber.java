import java.util.Scanner;

public  class primeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Find whether your no. is Prime or not");
        System.out.print("Enter your desired number=");
        int num= input.nextInt();
        boolean isPrime=isPrime(num);
        if (isPrime){
            System.out.println("given is prime bro");
        }else {
            System.out.println("prime nahi hai yaar");
        }    }
    public static boolean isPrime(int num){
      int i=2;
      while (i<num){
          if (num%i==0){
              return false;
          }
          i++;
      }
      return true;
    }
}
