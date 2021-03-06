package A2_Leetcode.T3_DynamicProgramming.package1;

import java.util.Arrays;

/**
 * Created by ciciya on 2017/3/29.
 */
public class N18_EqualSubSum {

    //给定一个只包含正整数的非空数组，返回数组是否可以划分成元素和相等的两个子集
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if ((sum & 1) == 1) {
            return false;
        }
        sum /= 2;
        int n = nums.length;
        boolean[][] dp = new boolean[n+1][sum+1];
        for (int i = 0; i < n+1; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                dp[i][j] = dp[i-1][j];
                if (j >= nums[i-1]) {
                    dp[i][j] = (dp[i][j] || dp[i-1][j-nums[i-1]]);
                }
            }
        }
        return dp[n][sum];
    }
}
