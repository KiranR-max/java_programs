import java.util.*;
public class arr2d {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6,7},
            {8,9},
        };
        System.out.println(arr.length);
        // System.out.println();
        //     //2D ARRAYS MODIFICATION
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //        System.out.print(arr[i][j]+" "); //System.out.println(Arrays.toString(arr));
        //     }System.out.println();
        // }

        
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(Arrays.toString(arr[i]));//printns each row by row
        // }

        for(int[] num:arr){//enhanced for loop
            System.out.println(Arrays.toString(num));
        }


}



}
