public class searchinMountainArray {
    public static void main(String[] args) {
        int[] array={0,1,2,3,4,2,1,};//this is mountain array;
        
        int target=3;
        int index=findInMountainArray(array,target);
        System.out.println(index);
    }
    static int findInMountainArray(int[] array,int target){

        int peak=peakIndexInMountainArray(array);
        int firstTry=OrderAgnosticBS(array, target,0,peak);
        if(firstTry!=-1)
        return firstTry;
        return OrderAgnosticBS(array, target, peak, array.length-1);


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
    static int OrderAgnosticBS(int[] arr,int target,int start,int end){
       

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
