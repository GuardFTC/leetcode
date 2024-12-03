package list.algorithm;

import list.entity.ListNode;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-12-03 15:13:14
 * @describe: 链表相交
 */
public class GetIntersectionNode {

    /**
     * 判定链表是否相交，返回相交节点
     *
     * @param headA 链表A头节点
     * @param headB 链表B头节点
     * @return 相交节点
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //1.头节点判空
        if (headA == null || headB == null) {
            return null;
        }

        //2.定义两个节点分别指向AB头节点
        ListNode nodeA = headA;
        ListNode nodeB = headB;

        //3.循环
        while (nodeA != nodeB) {

            //4.节点后移，如果为空移动到另一个头节点
            nodeA = null == nodeA ? headB : nodeA.next;
            nodeB = null == nodeB ? headA : nodeB.next;
        }

        //5.返回
        return nodeA;
    }
}

