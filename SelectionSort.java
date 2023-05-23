import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={3,1,5,4,2};
        
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SelectionSort(int[] arr) {
        for (int i=0;i<arr.length;i++){
            int start=0;
            int last=arr.length-i-1;
            //find 
            int Max=getMaxIndex(arr,start,arr.length-1);
            swap(arr,Max,last);
            
        }
    }

     static int getMaxIndex(int[] arr, int start, int l) {
        int max=start;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
        
    }

    static void swap(int[]arr,int index1,int index2){

        for(int j=1;j<arr.length;j++){
        if(arr[j]<arr[j-1]){//swap now
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            // swap=true;
        }
    }
}
}
