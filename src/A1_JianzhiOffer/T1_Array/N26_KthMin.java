package A1_JianzhiOffer.T1_Array;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ciciya on 2017/2/22.
 */
public class N26_KthMin {

    //输入n个整数，找出其中最小的K个数。
    public int findKthLargest(int[] nums, int k) {
        shuffle(nums);
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = partition(nums, low, high);
            if(mid < k) {
                low = mid + 1;
            } else if (mid > k) {
                high = mid - 1;
            } else {
                break;
            }
        }
        return nums[k];
    }

    private void shuffle(int[] nums) {
        Random random = new Random();
        for(int i=1; i<nums.length; i++) {
            int rand = random.nextInt(i + 1);
            int tmp = nums[i];
            nums[i] = nums[rand];
            nums[rand] = tmp;
        }
    }

    private int partition(int[] nums, int low, int high) {
        int temp = nums[low]; //数组的第一个作为划分元素
        while(low < high){
            while(low<high && nums[high]>=temp){
                high--;
            }
            if(nums[high] < temp){
                int temp1 = nums[high];
                nums[high] = nums[low];
                nums[low] = temp1;
            }
            while(low<high && nums[low]<=temp){
                low++;
            }
            if(nums[low] > temp){
                int temp1 = nums[low];
                nums[low] = nums[high];
                nums[high] = temp1;
            }
        }
        return low ;
    }
}
