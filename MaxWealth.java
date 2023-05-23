public class MaxWealth {
 
    public static void main(String[] args) {
        int[][] accounts={{1,2,3} , {3,2,1} };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int maxsum =0;
        for (int i=0;i<accounts.length;i++) {
            // when you start a new row, take a new sum for that row
            int rowsum = 0;
            for (int j=0;j<accounts[i].length;j++) {
                rowsum += accounts[i][j];
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (rowsum > maxsum) {
                maxsum= rowsum;
            }
        }
        return maxsum;
    }
}

