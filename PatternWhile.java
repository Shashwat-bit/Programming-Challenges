public class PatternWhile{
    public static void main(String[] args) {
        int rows=0;
        while (rows<10){
            System.out.print("*");

            int Khela=0;
            while(Khela<rows){
                System.out.print(" *");
                Khela++;

            }
            System.out.println();
            rows++;
        }
    }
}
