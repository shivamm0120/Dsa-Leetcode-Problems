class Solution {
    public int diagonalSum(int[][] mat) {
        int n= mat.length;
        int sum=0;

        //using 2 loop ,but we can solve it in order of n also
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==j)sum+=mat[i][j];
        //         if(j!=i && j==n-1-i)sum+=mat[i][j];
        //     }
        // }

        for(int i=0;i<n;i++){
            //primary diag
            sum+=mat[i][i];

            //secondary diagonal
            int j= n-1-i;
            if(j!=i) sum+=mat[i][j];


        }
        return sum;
        
    }
}