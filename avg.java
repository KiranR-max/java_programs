public class avg {
    public static void main(String[] args) {
       // System.out.println(average());
    //    int avg=0;
    //    System.out.println(avg);
        int  arr[]={1,2,3,4};
    //System.out.println(arr.length);
    System.out.println(average(arr));

    }
    static float average(int[] arr){

       float avg=0, sum=0;
        for(int i=0;i<=arr.length-1;i++){
        sum+=arr[i];
        avg=sum/arr.length;
        }return avg;
       // System.out.println(avg);
    }
}
