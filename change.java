import java.util.Arrays;
import java.util.Scanner;

public class change {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] nums={1,2,3,45,0};
        // System.out.println(nums);
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[4]=99;
    }//arrays are mutable 
}
