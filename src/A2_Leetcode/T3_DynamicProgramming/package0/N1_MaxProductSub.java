package A2_Leetcode.T3_DynamicProgramming.package0;

/**
 * Created by ciciya on 2017/3/30.
 */
public class N1_MaxProductSub {

    //最大连续子集的乘积
    public int maxProduct(int[] A) {
        if (A == null || A.length == 0)
            return 0;
        int max = A[0], min = A[0], result = A[0];
        for (int i = 1; i < A.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * A[i], min * A[i]), A[i]);
            min = Math.min(Math.min(temp * A[i], min * A[i]), A[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;
    }
}
