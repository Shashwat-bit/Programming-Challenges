import java.util.Scanner;

public class fullyFunctionalCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("WELCOME TO FINAL CALCULATOR");
        System.out.print("Enter your first no. : ");
        Float First= input.nextFloat();
        System.out.print("Enter your Second No. : ");
        Float Second=input.nextFloat();
        float Ad=First+Second;
        float Su=First-Second;
        float Mu=First*Second;
        float Di=First/Second;
        System.out.print("DO YOU WANT TO \"ADD\"?: ");
        boolean Add=input.nextBoolean();
        if (Add){
            System.out.println("After Addition answer is: "+Ad);
        }else{
            System.out.print("Do you want to \"Substract\"? ");
          boolean Substract=input.nextBoolean();
          if (Substract){
              System.out.print("After substraction answer is: "+Su);

            }else {
              System.out.print("Do you want to Multiply? ");
              boolean Multiply= input.nextBoolean();
              if(Multiply){
                  System.out.println("After multiplication your answer is: "+Mu);

              }else {
                  System.out.print("Do you want to Divide? ");
                  boolean Divide=input.nextBoolean();
                  if (Divide){
                      System.out.println("Your answer after Division is: "+Di);

                  }else {
                      System.out.println("Kehna kya chate ho!!!!");
                  }
              }
          }
        }
    }
}
