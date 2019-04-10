package dataStructure.lianBiao;

/**
 * @ClassName ReverseListNode
 * @Description 输入一个链表，反转链表后，输出新链表的表头。
 * @Author 王海峰
 * @Date 2019/3/27 9:37
 * @Version 1.0
 */
public class ReverseListNode {
    public static ListNode reverseListNode(ListNode head) {
        if (head == null) {
            return null;
        } else {
            ListNode pre=null;
            ListNode next=null;
            while (head!= null) {
                next = head.next;
                head.next = pre;
                pre=head;
                head = next;
            }
            return pre;
        }
    }
}
