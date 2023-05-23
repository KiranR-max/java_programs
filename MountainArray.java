public class MountainArray {
    public static void main(String[] args) {
        int[] arr={0,2,3,4,1,0};
        int index=peakIndexInMountainArray(arr);
        System.out.println(index);

    }
    static int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;

            if(arr[mid]<arr[mid+1]){
            s=mid+1;
            
        }else if(arr[mid]>arr[mid+1]){
            e=mid;

        }
    
    } return s=e;

    }
}
