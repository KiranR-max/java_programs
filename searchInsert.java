public class searchInsert {
  
        static int searchInsert(int[] nums, int target) {
            
            int s=0,e=nums.length-1;
            while(s<=e){
                int m=s+(e-s)/2;
                if(target<nums[m])
                    e=m-1;
                else if(target>nums[m])
                    s=m+1;
                else return m;
            }return s;
            
        }
        
        public static void main(String[] args){
            int[] nums={1,3,5,6};
            int target=2;
            
            int index=searchInsert(nums,target);
            System.out.println(index);
            
        }
    }

