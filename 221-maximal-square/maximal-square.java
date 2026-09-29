class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;       // rows
        int n = matrix[0].length;    // columns

        // dp[j] = current column j pe end hone wale sabse bade square ki side
        // size n + 1 taaki dp[0] hamesha 0 rahe (left boundary ka padding)
        int[] dp = new int[n + 1];
        int maxSide = 0;             // ab tak ki sabse badi side

        for (int i = 1; i <= m; i++) {
            int diagonal = 0;        // har nayi row mein reset (top-left bahar hai)

            for (int j = 1; j <= n; j++) {
                int top = dp[j];     // overwrite se pehle pichli row ki value save

                if (matrix[i - 1][j - 1] == '1') {
                    // 1 + min(top, left, diagonal)
                    dp[j] = 1 + Math.min(
                        Math.min(dp[j], dp[j - 1]),  // top, left
                        diagonal                     // top-left
                    );

                    maxSide = Math.max(maxSide, dp[j]);
                } else {
                    dp[j] = 0;       // '0' pe koi square end nahi hota
                }

                // agle column ke liye ye cell hi top-left banega
                diagonal = top;
            }
        }

        return maxSide * maxSide;    // side nahi, area return karna hai
    }
}