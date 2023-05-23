import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,4,7,11,15},
                        { 2,5,8,12,19},
                        {3,6,9,16,22},
                        {10,13,14,17,24},
                        {18,21,23,26,30}

        };
        int target=100;
        
        int[] index=Search2dBS(matrix,target);
        System.out.println(Arrays.toString(index));

    }

    static int[] Search2dBS(int[][] matrix, int target) {

        int i=0;//row
        int j=matrix[i].length-1;

        while(i<matrix.length && j>=0){
            if(matrix[i][j]<target)
            i++;//row++

            else if(matrix[i][j]>target){
                j--;//col--
            }else{ 
                return new int[]{i,j};
                

        }
    }return new int[] {-1,-1};
}
}
