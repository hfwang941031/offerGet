package dataStructure.lianBiao;

import java.util.List;

/**
 * @ClassName MergeTwoListNodeOrderByIncre
 * @Description
 * 输入两个单调递增的链表，
 * 输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 *
 *
 * 思想：
 * 首先建立第三个链表，让链表头结点为负数。
 * 再建立一个新的链表指向第三个链表
 * 进入循环的条件就是参数两个链表都不为空
 * @Author 王海峰
 * @Date 2019/3/27 18:29
 * @Version 1.0
 */
public class MergeTwoListNodeOrderByIncre {
    public static ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode head = new ListNode(-1);
        ListNode root=head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                head = head.next;
                list1 = list1.next;
            } else {
                head.next=list2;
                head=head.next;
                list2=list2.next;
            }
        }
        if (list1 == null) {
            head.next=list2;
        }
        if (list2 == null) {
            head.next=list1;
        }
        return root.next;
    }
}
