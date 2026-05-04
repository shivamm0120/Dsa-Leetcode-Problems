class Solution {
    public int maximumWealth(int[][] accounts) {
        int row=accounts.length;
        int col=accounts[0].length;
        int maxWealth=0;

        for(int i=0;i<row;i++){
            int wealthSum=0;
            for(int j=0;j<col;j++){
                wealthSum+=accounts[i][j];
            }
                maxWealth=Math.max(maxWealth,wealthSum);
        }
        return maxWealth;
        
    }
}