public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=0;//finding the target elem in the rotated array by inititally finding the pivot;

        
        int index=search( nums, target);
        System.out.println(index);

    }

    static int search(int[]nums ,int target){

        int pivot=find_pivot(nums);
        if(pivot ==-1)
        return BinarySearch(nums, target,0,nums.length-1   );
        
        if(nums[pivot]==target)
        return pivot;

        if(target>=nums[0])
        return  BinarySearch(nums, target, 0, pivot-1);

        else return BinarySearch(nums, target, pivot+1, nums.length-1);
       // return BinarySearch(nums, target, pivot+1, nums.length-1);

    } 
    

    static int find_pivot(int[] nums){//finding max element in the rotated array;;i,e pivot

        int start=0;
        int end=nums.length-1;
        int pivot=0;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]>nums[mid+1] && mid<end){
           
            pivot=mid; return pivot;
        }

            if(nums[mid]<nums[mid-1]&& mid>start){

                pivot=mid-1;
                return pivot;//mid-1 is bigger hence that maybe a pivot 

            }

            if(start>=mid){
                end=mid-1;
                return pivot=end;
        }
            else {
                start=mid+1;
                return pivot=start;
            }
            

        }return -1;
    }


    static int BinarySearch(int[] arr,int target,int start,int end){
     

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
