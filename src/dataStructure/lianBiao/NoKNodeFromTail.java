package dataStructure.lianBiao;

/**
 * @ClassName NoKNodeFromTail
 * @Description 输入一个链表，输出该链表中倒数第k个结点。
 * 思想：
 * 方法1：
 * 1、首先正向遍历链表，每遍历一个结点利用计数器加1，遍历完以后计数器长度就是链表的长度设为n
 * 2、由于是倒数第k个，也就是正向第n-k+1个
 * 3、所以再次遍历链表至n-k+1时停止，取出该节点
 * 注意事项：有很多边界值需要进行处理，
 * 1、当K>链表长度时，倒数第k个就是null
 * 2、如果没有该链表的副本，当第一遍遍历结束时，head已经指向了null，进行第二遍遍历的时候应该先把head指向最初
 * 最好的办法就是一开始就建立一个链表的副本，然后让该链表指向head，当第一遍遍历结束时，再次让该副本指向head,保证从头节点开始。
 * @Author 王海峰
 * @Date 2019/3/27 9:11
 * @Version 1.0
 */
public class NoKNodeFromTail {
    public static ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) {
            return null;
        } else {
            ListNode listNode=head;
            int counter=0;
            while (listNode != null) {
                counter++;
                if (listNode.next != null) {
                    listNode = listNode.next;
                } else {
                    break;
                }
            }
            if (k > counter) {
                return null;
            } else {
                listNode=head;
                for (int i = 1; i <counter - k + 1; i++) {
                    listNode=listNode.next;
                }
            }

            return listNode;
        }

    }
}
