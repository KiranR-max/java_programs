public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};//sorted array
        int target=14;

        System.out.println(BS1(arr,target));
        
    }

    static int BS1(int[] arr,int target){// if target in arr apply binary search

        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target<arr[mid])
             e=mid-1;
             else if(target>arr[mid])
             s=mid+1;
             else  return mid;
                }return arr[e];//else to find the number that is greatest i.e smaller or equal to target
        }
    
}
