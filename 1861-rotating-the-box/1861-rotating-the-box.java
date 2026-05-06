class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m =boxGrid.length;
        int n=boxGrid[0].length;
        char [][] res= new char [n][m];

        //Take transpose of the array
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[j][i]=boxGrid[i][j];
            }
        }

        //reverse in each row
        for(int i=0;i<n;i++){
            int left=0,right=m-1;

            while(left<right){
                char temp=res[i][left];
                res[i][left]=res[i][right];
                res[i][right]=temp;

                left++;right--;
            }
           
        }

        for(int i=0;i<m;i++){
            int restIndex=n-1;
            for(int j=n-1;j>=0;j--){

                if(res[j][i]=='#'){
                    if(j<restIndex){
                        res[restIndex][i]='#';
                        res[j][i]='.';
                    }
                    restIndex--;

                }
                if(res[j][i]=='*')
                    restIndex=j-1;

            }
        }
        return res;
    }
}