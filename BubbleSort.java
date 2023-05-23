import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
     
        int [] arr={3,1,5,4,2};
        
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] nums){

        //check if it is sorted or not
        boolean swap=false; 
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){//swap now
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                    swap=true;
                }
            }if(!swap){
                break;
            }
        }
    }
}
