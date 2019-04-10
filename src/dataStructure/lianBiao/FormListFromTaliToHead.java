package dataStructure.lianBiao;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @ClassName FormListFromTaliToHead
 * @Description 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * 思想：
 * 1、首先考虑从尾到头这几个字想到特殊的数据结构，比如队列和栈
 * 2、链表遍历正常只能从头到尾，所以可以先从头到尾遍历
 * 3、从头到尾遍历的每个结点都加到Stack中，然后再遍历Stack，取出Stack中的值
 * @Author 王海峰
 * @Date 2019/3/27 8:59
 * @Version 1.0
 */
public class FormListFromTaliToHead {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null) {
            return list;
        } else {
            Stack<ListNode> stack = new Stack<>();
            while (listNode != null) {
                stack.add(listNode);
                if (listNode.next != null) {
                    listNode = listNode.next;
                } else {
                    break;
                }
            }
            while (!stack.isEmpty()) {
                list.add(stack.pop().val);
            }
        }
        return list;
    }
}
