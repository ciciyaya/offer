package A2_Leetcode.T3_DynamicProgramming.package1;

import java.util.List;

/**
 * Created by ciciya on 2017/3/27.
 */
public class N15_Triangle {

    //给定一个三角形，从顶部到底部找到最小路径和
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()+1];
        for(int i=triangle.size()-1; i>=0; i--){
            for(int j=0; j<triangle.get(i).size(); j++){
                dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
