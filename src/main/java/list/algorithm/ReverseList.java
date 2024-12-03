package list.algorithm;

import list.entity.ListNode;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-11-29 15:23:38
 * @describe: 翻转链表
 */
public class ReverseList {

    /**
     * 翻转链表
     *
     * @param head 头节点
     * @return 翻转后的头节点
     */
    public static ListNode reverseList(ListNode head) {

        //1.判空处理
        if (null == head || head.next == null) {
            return head;
        }

        //2.定义结果节点指向头结点
        ListNode result = head;

        //3.循环让结果节点指向尾节点
        while (result.next != null) {
            result = result.next;
        }

        //4.递归
        reverseList1(head);

        //5.返回
        return result;
    }

    /**
     * 递归进行链表的翻转
     *
     * @param node 链表节点
     * @return 翻转节点
     */
    public static ListNode reverseList1(ListNode node) {

        //1.递归结束条件，到达尾节点
        if (node.next == null) {
            return node;
        }

        //2.递归
        ListNode nextNode = reverseList1(node.next);

        //3.翻转
        nextNode.next = node;
        node.next = null;
        return node;
    }
}
