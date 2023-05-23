public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        int target=36;

        int index=BinarySearch(arr,target);
        System.out.println(index);
    }

    static int BinarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{//(target==arr[mid])
            return mid;

        }
    }
    return -1;       //when start>end

        
    }
}
