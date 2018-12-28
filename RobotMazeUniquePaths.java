class Solution {
    public int uniquePaths(int m, int n) {
        if(m==0 && n==0)
            return 0;
        if(n==0 || m==0)
            return 1;
        
        int[][] retVal = new int[m][n];
        
        //for each row
        for(int i = 0; i < m; i++){
            retVal[i][retVal[0].length-1] = 1;
        }
        
        //for each column
        for(int j = 0; j < n; j++){
            retVal[retVal.length - 1][j] = 1;
        }
        
        for(int row = retVal.length - 2; row >= 0; row--){
            for(int col = retVal[0].length - 2; col >= 0; col--){
                retVal[row][col] = retVal[row+1][col] + retVal[row][col+1];
            }
        }
        return retVal[0][0];
    }
} 