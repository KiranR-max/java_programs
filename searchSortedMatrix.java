import java.util.Arrays;

public class searchSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target=6;


        System.out.print(Arrays.toString(search(matrix,target)));
    }

    static int[] search(int[][]matrix ,int target){

        int rStart=matrix.length;
        int rEnd=matrix[0].length;
        int mid=rStart+(rEnd-rStart)/2;

        while()



        return new int[]{-1,1};

    }
}
