// Last updated: 1/19/2026, 10:35:44 PM
class Solution {
    public int[][] transpose(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] arr=new int[n][m];
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                arr[row][col]=mat[col][row];
            }
        }
        return arr;
    }
}