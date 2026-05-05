class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m =mat.length;
        int n= mat[0].length;

        //valid case
        if(m*n!=r*c)return mat;

        //create 1d array
        int[] arr= new int [m*n];

        //convert 2d array into 1d using row major ordering
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i*n+j]=mat[i][j];//this formula is used to fill the elements while converting
                
            }
        }

        //create 2d array which will be returned
        int [][]ans= new int [r][c];

        //now convert that 1d array into 2d using new column ie. 'c'
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=arr[i*c+j];
            }
        }
        return ans;
    }
}