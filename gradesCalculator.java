import java.util.Scanner;

public class gradesCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Grades Calculator");
        System.out.print("eNtEr yOuR pErCeNtAgE: ");
        float Per= input.nextFloat();


        if (Per>=90){
            System.out.println("your grade is=A");
        }else if(Per>=75){
            System.out.println("your grade is=B");
        }else if (Per>=60){
            System.out.println("your grade is =C");
        }else if (Per>=30){
            System.out.println("your grade is=D");
        }else
            System.out.println("your grade is=F");
    }
}
