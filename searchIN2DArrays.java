import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

public class searchIN2DArrays {
    public static void main(String[] args) {
        int[][] arr= {{11,22,23},
                
                {4,55,6,45},

                {37,38,99}
            };
        int target=45;
        int[] result=search(arr, target);
       System.out.println(Arrays.toString(result));//arr[row,col];
        
       System.out.println(Integer.MIN_VALUE);
    }
    
    static int[] search(int[][] arr, int target) {
       
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(target==arr[i][j]){
                return new int[]{i,j};
            }
        }
        }
    
        return new int[]{-1,-1};
    }

    
}
