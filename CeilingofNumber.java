public class CeilingofNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};//sorted array
        int target=15;

        System.out.println(BS(arr,target));
    }

    static int BS(int[] arr,int target){
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target<arr[mid])
             e=mid-1;
             else if(target>arr[mid])
             s=mid+1;
             else  return mid;
                }
                return arr[s]=arr[e+1];//when  target element is not found i.e while loop break start>end and new start=end+1;
                //return start  //target end s
     }
    
}
