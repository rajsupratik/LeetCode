class Solution {
  public int uniquePaths(int m, int n) {
    if (m == 1 || n == 1) {
      return 1; // Base case: only one way to reach the corner from edges
    }
    return uniquePaths(m - 1, n) + uniquePaths(m, n - 1); // Recursive cases
  }
}
