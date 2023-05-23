import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};

        System.out.println(Arrays.toString(arr));

        reverse(arr);
       // System.out.println(Arrays.toString(arr)); 
        //  System.out.println(arr);
         System.out.println(Arrays.toString(arr));

    }
    // static void reverse(int[] arr){         using FOR LOOP
    //     for(int i=arr.length-1;i>=0;i--){
    //         System.out.println((arr[i]));
    //     }
    // }

    static void reverse(int[] arr){
        int start=0;
        int end =arr.length-1;
        while(start<end){
        swap(arr,start,end);
        start++;
        end--;
    }
    //System.out.println(arr[i]);
}

    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
