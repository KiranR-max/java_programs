import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] arr={-10,-2,3,55,71,1,0};

        System.out.println(Arrays.toString(arr));

        Asort(arr);
        System.out.println(" after ascending"+Arrays.toString(arr));

         Dsort(arr);
        // System.out.println();
        System.out.println(" after  descending "+Arrays.toString(arr));

    }

    static void Asort(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }//System.out.print(arr[i]+ " ");
        }
    }


    static void Dsort(int[] arr){
        for(int k=0;k<arr.length;k++){
            for(int l=k+1;l<arr.length;l++){
                if(arr[l]>arr[k]){
                    int t=arr[l];
                    arr[l]=arr[k];
                    arr[k]=t;
                }
            }
        }
    }
}
