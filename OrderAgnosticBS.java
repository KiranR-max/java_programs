public class OrderAgnosticBS{
    public static void main(String[] args) {
        int[] arr={1,1,5,6,8,9,22,34,56};
        // int[] arr={56,34,22,20,10,2,1,1};
        int target=5;

        int ans=OrderAgnosticBS(arr,target);
        
        System.out.println(ans);


    }
     static int OrderAgnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        if(arr[start]<arr[end] ){
           int a= AscendingBS(arr,target);
           return a;
        }else {
            int b= DescendingBS(arr,target);
            return b;
    }
     }
     
     static int AscendingBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            end=mid-1;

            else if(target>arr[mid])
            start=mid+1;

            else return mid;
        }return -1;


     }
     static int DescendingBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            start=mid+1;
            

            else if(target>arr[mid])
            end=mid-1;

            else return mid;
        }return -1;

     }
}