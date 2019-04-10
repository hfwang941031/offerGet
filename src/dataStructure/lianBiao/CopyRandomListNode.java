package dataStructure.lianBiao;

/**
 * @ClassName CopyRandomListNode
 * @Description
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * 思想：
 * 分三步走
 * 1、将原链表的每个结点复制一份，并把原来该节点的next指向当前复制的结点
 * 如原来   1->4->5    现在  1->1^->4->4^->5->5^
 * 2、完善random指针，currentNode.next.random=currentNode.random.next;
 * 3、拆分  最后这一步弄的不是很清晰
 * @Author 王海峰
 * @Date 2019/4/1 9:57
 * @Version 1.0
 */
public class CopyRandomListNode {
    public static void main(String[] args){
        CopyRandomListNode copyRandomListNode = new CopyRandomListNode();
        RandomListNode randomListNode1 = new RandomListNode(1);
        RandomListNode randomListNode2 = new RandomListNode(4);
        RandomListNode randomListNode3 = new RandomListNode(5);
        RandomListNode randomListNode4 = new RandomListNode(7);
        RandomListNode randomListNode5 = new RandomListNode(6);
        randomListNode1.next=randomListNode2;
        randomListNode1.random=randomListNode4;
        randomListNode2.next=randomListNode3;
        randomListNode2.random=randomListNode5;
        randomListNode3.next=randomListNode4;
        randomListNode3.random=randomListNode1;
        randomListNode4.next=randomListNode5;
        randomListNode4.random=randomListNode5;
        RandomListNode res=copyRandomListNode.cloneListNode(randomListNode1);
        while (res.next != null) {
            System.out.println(res.label);
            System.out.println(res.random.label);
            res=res.next;
        }
        /*while (randomListNode1.next != null) {
            System.out.println(randomListNode1.label);
            System.out.println(randomListNode1.random.label);
            randomListNode1 = randomListNode1.next;
        }*/

    }
    public RandomListNode cloneListNode(RandomListNode pHead) {

        if (pHead == null) {
            return null;
        }
        RandomListNode currentNode=pHead;
        //1、复制每个结点，将该复制的结点插入到被复制结点的后面
        while (currentNode != null) {
            RandomListNode cloneNode = new RandomListNode(currentNode.label);
            RandomListNode nextNode = currentNode.next;
            currentNode.next = cloneNode;
            cloneNode.next = nextNode;
            currentNode = nextNode;
        }
        currentNode=pHead;
        //2、重新遍历链表，复制老节点的随机指针给新节点
        while (currentNode != null) {
            if (currentNode.random != null) {
                currentNode.next.random=currentNode.random.next;
            }
            currentNode=currentNode.next.next;

        }
        //3、拆分链表，将链表拆分为原链表和复制后的链表
        currentNode=pHead;
        RandomListNode pCloneHead=pHead.next;
        while (currentNode != null) {
            RandomListNode cloneNode=currentNode.next;
            currentNode.next=cloneNode.next;
            if (cloneNode.next != null) {
                cloneNode.next=cloneNode.next.next;
            }
            currentNode=currentNode.next;
        }
        return pCloneHead;
    }
}
