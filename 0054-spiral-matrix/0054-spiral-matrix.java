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
            int i;
            for(i=left;i<=right;i++)al.add(matrix[top][i]);
            top++;
            for(i=top;i<=bottom;i++)al.add(matrix[i][right]);
            right--;
            if(top<=bottom){
                for(i=right;i>=left;i--){
                    al.add(matrix[bottom][i]);
                }
                bottom--;

            }
            if(left<=right){
                for(i=bottom;i>=top;i--){
                    al.add(matrix[i][left]);
                }
                left++;
            }

            
        }
        return al;
    }
}