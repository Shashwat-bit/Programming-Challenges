public class minAndMax {
    public static void main(String[] args) {
        int[] shashwat=arrayUtility.inputArray();
        System.out.println("Check Min and Max value in an array");
        int max=max(shashwat);
        int min=min(shashwat);
        System.out.println("Maximum in your array is: "+max);
        System.out.println("Minimum in your array is: "+min);
    }
    public static int max(int[] tiyu){
            int max=Integer.MIN_VALUE;
            for(int i=0;i< tiyu.length;i++){
                if(max<tiyu[i]){
                    max=tiyu[i];
                }
            }
            return max;
    }
    public static int min(int[] tiyu){
        if(tiyu.length==0){
            return Integer.MIN_VALUE;
        }
        int min=tiyu[0];
        for(int i=1;i< tiyu.length;i++){
            if(min>tiyu[i]){
                min=tiyu[i];
            }
        }
        return min;

    }


    }

