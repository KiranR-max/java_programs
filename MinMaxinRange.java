public class MinMaxinRange {
    public static void main(String[] args) {
        int[] arr={4,-19,-8,-1,22,54,8};
        System.out.println(min_in_range(arr,1,4));

        System.out.println(max_in_range(arr,1,4));
    }

     static int max_in_range(int[] arr, int start, int end ) {
        int max=arr[start];

        for(int i=start;i<=end;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }return max;
        
    }

    static int min_in_range(int[] arr, int start, int end) {
        
        int min=arr[start];
        //if()
        
        for(int j=start;j<=end;j++){
            if(arr[j]<min){
                min=arr[j];

            }
        }return min;
        
    }

    
}
