public class MinMaxinArray {
    
    public static void main(String[] args) {
        int[] arr={4,1,-1,22,54,8};
        System.out.println(min(arr));

        System.out.println(max(arr));
    }
    static int min(int[] arr){
        if(arr.length==0){
            return -1;
        }

        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min =arr[i];  
            }
        }return min;// return Integer.MAX_VALUE;
    }

    static int max(int[] arr){
       int  max=arr[0];
        for(int j=0;j<arr.length;j++){
            if(max<arr[j]){
                max=arr[j];
            }
        }return max;
    }
}
