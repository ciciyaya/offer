package A2_Leetcode.T9_Math;

/**
 * Created by ciciya on 2017/5/23.
 */
public class N2_2_AddBinary {

    //给定两个二进制字符串，返回它们的和（也是一个二进制字符串）。
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}
