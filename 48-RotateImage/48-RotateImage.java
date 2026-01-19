// Last updated: 1/19/2026, 10:36:40 PM
class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix[0].length;
        int matrix1[][] = new int[n][n];
        for(int j=0;j<n;j++)
        {
            for(int i=n-1;i>=0;i--)
            {
                matrix1[j][n-1-i]=matrix[i][j];
            }
        }
        
        for(int j=0;j<n;j++)
        {
            for(int i=0;i< n;i++)
            {
                matrix[j][i]=matrix1[j][i];
            }
        }
    }
}