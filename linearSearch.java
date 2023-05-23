public class linearSearch {
    public static void main(String[] args) {
        int[] arr={10,33,34,65,32,67};
        int target=33;

        int found =linearSearch(arr,target);
        System.out.println(found);
    }

    static int linearSearch(int[] arr,int target){

            if(arr.length==0){
                return -1;
            }
            int i;
            for( i=0;i<arr.length;i++){
                if(target==arr[i]){       
                    System.out.println(+ target + " element found at index "+i);
                    return i;//return target;  
                }
            }  return -1;
    }
}
