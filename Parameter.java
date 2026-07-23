public class Parameter {
    public static void main(String[] args) {
        Greet();
        int GrandSum=InputNumber(4,7);
        System.out.println(GrandSum);

    }
    public static void Greet(){
        System.out.println("Sum krle sahab");
    }

    public static int InputNumber(int First , int Second){
        System.out.println("Your First NO, rESponse is="+First);
        System.out.println("Your Second Number No. Response is="+Second);
        int Sum=First+Second;
        return  Sum;
    }
}
