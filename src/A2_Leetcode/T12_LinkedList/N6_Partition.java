package A2_Leetcode.T12_LinkedList;

/**
 * Created by ciciya on 2017/6/16.
 */
public class N6_Partition {

    //给定一个链表和一个值x，对其进行分区，使得小于x的所有节点都在大于或等于x的节点之前。保留原始相对顺序。
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0), dummy2 = new ListNode(0);  //dummy heads of the 1st and 2nd queues
        ListNode curr1 = dummy1, curr2 = dummy2;      //current tails of the two queues;
        while (head != null){
            if (head.val < x) {
                curr1.next = head;
                curr1 = head; //尾部
            }else {
                curr2.next = head;
                curr2 = head; //尾部
            }
            head = head.next;
        }
        curr2.next = null;          //important! avoid cycle in linked list. otherwise u will get TLE.
        curr1.next = dummy2.next;
        return dummy1.next;
    }
}
