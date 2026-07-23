import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? : ");
        String Name = input.nextLine();
        System.out.print("ARE YOU SENIOR CITIZEN?ans in true/false: ");
        boolean SeniorCitizen = input.nextBoolean();
        if (SeniorCitizen) {
            System.out.println("HI! BUDHAU " + Name);
        } else {
            System.out.print("ARE YOU ADULT?ans in true/false: ");
            boolean Age = input.nextBoolean();
            if (Age) {
                System.out.println("or chacha kasam say bta rhe bohot bdi chiranddh ho tum sasur " + Name);
            } else {
                System.out.println("Or Londey kya kar rhe tum sasur!! " +Name);
            }
        }

    }
}
