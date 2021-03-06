package A2_Leetcode.T8_HashTable.package1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ciciya on 2017/5/19.
 */
public class N11_DistributeCandies {

    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int candy : candies)
            set.add(candy);
        return set.size() >= candies.length / 2 ? candies.length / 2 : set.size();
    }
}
