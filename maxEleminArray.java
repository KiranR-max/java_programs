public class maxEleminArray {
    public static void main(String[] args) {
        int[] arr={1,33,43,99,13};

        System.out.println();
       System.out.println(max(arr)); 
    }

    static int  max(int[] arr){

        int maximum=0;//arr[0];

        if(maximum==arr[0])
        return maximum;

        for(int i=0;i<arr.length;i++){
            if(maximum<arr[i])
            maximum=arr[i];
        }
        return maximum;
    }
}
