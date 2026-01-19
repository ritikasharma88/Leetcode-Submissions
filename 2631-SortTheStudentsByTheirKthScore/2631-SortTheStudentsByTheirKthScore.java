// Last updated: 1/19/2026, 10:35:38 PM
import java.util.*;
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (a, b) -> b[k] - a[k]);
        return score;
    }
}
