package A1_JianzhiOffer.T2_String;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ciciya on 2017/2/28.
 */
public class N31_FirstAppearingOnce {

    //在一个字符串中找到第一个只出现一次的字符,并返回它的位置
    public int FirstNotRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if (map.get(c) == 1)
                return i;
        }
        return -1;
    }
}
