public class InfiniteArray {
    public static void main(String[] args) { //dont use arr.length to find the target elem.
        int[] arr={2,3,5,6,7,8,9,11,12,15,20,23,30};
        int target=11;

        System.out.println(InfiniteArraySearch(arr,target));

    }

    static int InfiniteArraySearch(int[] arr,int target){

        int start=0;
        int end=1;
        while(target>end){
            int newStart=end+1;

            end=end+(end-start+1)*2;
            start=newStart;
            
        }return BS(arr, target, start, end);
    }


    static int BS(int[] arr,int target,int start,int end){
       

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
