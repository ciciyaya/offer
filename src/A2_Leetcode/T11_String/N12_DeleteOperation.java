package A2_Leetcode.T11_String;

/**
 * Created by ciciya on 2017/6/15.
 */
public class N12_DeleteOperation {

    //给出两个单词word1和word2，找到使word1和word2相同的最小步数，在每个步骤中，您可以删除任一字符串中的一个字符。
    public int minDistance(String word1, String word2) {
        int dp[][] = new int[word1.length()+1][word2.length()+1]; //最长公共子集
        for(int i = 0; i <= word1.length(); i++) {
            for(int j = 0; j <= word2.length(); j++) {
                if(i == 0 || j == 0)
                    dp[i][j] = 0;
                else
                    dp[i][j] = (word1.charAt(i-1) == word2.charAt(j-1))
                            ? dp[i-1][j-1] + 1 : Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        int val =  dp[word1.length()][word2.length()]; //因为i-1
        return word1.length() - val + word2.length() - val;
    }
}
