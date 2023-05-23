public class searchinRange { 
    //apply linear search inrange 
    public static void main(String[] args) {
        int[] arr={13,18,9,10,56,44};
        int target=56;
      System.out.println(linearSearch(arr,target,1,4));
    //   System.out.println(min_in_Range(arr, 1,4));
    }

    static int linearSearch(int[] arr,int target,int start,int end ){

        if(arr.length==0){
            return -1;
        }
        int i;
        for(i=start;i<=end;i++){
            if(target==arr[i]){       
                //System.out.println(+ target + " element found at index "+i);
                return i;
              //return target;  
            }
        }  return -1;

    // }
    // static int min_in_Range(int[] arr,int start,int end){
    //     if(arr.length==0)
    //     return -1;
        
    //     int i,target=0;
        
    //     start=arr[start];
        
    //     if(target==start)
    //     return 1;
        
    //     for(i=start;i<=end;i++){
    //         if(target<arr[i]){
    //             target=arr[i];
    //             return target;
    //         }

    //     }return -1;
     }

}
