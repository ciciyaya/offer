package A1_JianzhiOffer.T5_StackQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ciciya on 2017/5/8.
 */
public class N5_2_StackByOneQueue {

    //用一个队列来实现一个栈
    private Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.offer(x);
        for(int i=0; i<queue.size()-1; i++)
            queue.offer(queue.poll());
    }

    public int pop() {
        return queue.poll();
    }

}
