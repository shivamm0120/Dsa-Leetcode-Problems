class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m =matrix.length;
        int n=matrix[0].length;

        ArrayList<Integer>al= new ArrayList<>();
//need four variables 
        int top=0;
        int left=0;
        int right=n-1;
        int bottom=m-1;


        while(top<=bottom && left<=right){
            int i;
            //left-->right
            for(i=left;i<=right;i++)al.add(matrix[top][i]);
            top++;

            //top-->right
            for(i=top;i<=bottom;i++)al.add(matrix[i][right]);
            right--;

            //right-->left
            if(top<=bottom){//need to check condition so we dont get duplicates 
                for(i=right;i>=left;i--) al.add(matrix[bottom][i]);
                bottom--;
            }

            //bottom ->top
            if(left<=right){
                for(i=bottom;i>=top;i--) al.add(matrix[i][left]);
                left++;
            }

            
        }
        return al;
    }
}