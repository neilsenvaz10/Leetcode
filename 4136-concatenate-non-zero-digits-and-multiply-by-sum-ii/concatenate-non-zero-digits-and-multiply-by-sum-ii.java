class Solution {
    public int[] sumAndMultiply(String s, int[][] queries)
    {
        int m = s.length();
        int q = queries.length;
        long MOD = 1_000_000_007L;

        // Precompute powers of 10 modulo 10^9 + 7
        long[] pow10 = new long[m + 1];
        pow10[0] = 1;
        for (int i = 1; i <= m; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        // Prefix arrays
        long[] P = new long[m + 1];      // Prefix value of non-zero digits
        int[] C = new int[m + 1];       // Prefix count of non-zero digits
        long[] S = new long[m + 1];      // Prefix sum of all digits

        for (int i = 0; i < m; i++) {
            char ch = s.charAt(i);
            int digit = ch - '0';

            if (digit != 0) {
                P[i + 1] = (P[i] * 10 + digit) % MOD;
                C[i + 1] = C[i] + 1;
            } else {
                P[i + 1] = P[i];
                C[i + 1] = C[i];
            }
            S[i + 1] = S[i] + digit;
        }

        int[] answer = new int[q];

        // Process each query in O(1) time
        for (int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            // 1. Get count of non-zero digits in range
            int count = C[r + 1] - C[l];

            // 2. Compute concatenated value x in O(1)
            long x = 0;
            if (count > 0) {
                x = (P[r + 1] - (P[l] * pow10[count]) % MOD + MOD) % MOD;
            }

            // 3. Get the sum of digits in the range
            long sum = (S[r + 1] - S[l]) % MOD;

            // 4. Calculate answer for current query
            answer[i] = (int) ((x * sum) % MOD);
        }

        return answer;
    }
}
