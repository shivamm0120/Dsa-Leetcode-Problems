class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m =matrix.length;
        int n=matrix[0].length;

        ArrayList<Integer>al= new ArrayList<>();

        int top=0;
        int left=0;
        int right=n-1;
        int bottom=m-1;

        while(top<=bottom && left<=right){

            int i=left;
            if(top==bottom){
                al.add(matrix[top][i]);left++;continue;
                }
            if(left==right){
                al.add(matrix[top][left]);
                top++;continue;
                }
            for(;i<right;i++){
                al.add(matrix[top][i]);
            }
            for( i=top;i<bottom;i++){
                al.add(matrix[i][right]);
            }
            for(i=right;i>left;i--) al.add(matrix[bottom][i]);
            for(i=bottom;i>top;i--)al.add(matrix[i][left]);

            //shrink layers
            top++;
            bottom--;
            left++;
            right--;
        }
        return al;
    }
}