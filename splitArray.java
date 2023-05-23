import javax.swing.text.MaskFormatter;

public class splitArray {
    public static void main(String[] args) {
        // nums = [7,2,5,10,8], m = 2
        int [] nums={7,2,5,10,8};
        int m=2;
        int maxSum=splitArray(nums,m);
        System.out.println(maxSum);
    }
    static  int splitArray(int[] nums, int m) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start+=Math.max(start, nums[i]);//contains max sum of array;
            end+=nums[i];//this contans sum of array

        }
        while(start<end){

            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;

            for(int num:nums){
                if(sum+num>mid){
                    //cannot add to the same array
                    //createnew array
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;//else you can add the num to same array
                }
            }

            if(pieces<=m){
                end=mid;
            }
            else {
                start=mid+1;}
        }return end;//when start ==end 

    }
}
