package offer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-19 18:12:24
 * @describe: 反转链表
 */
public class Offer24 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode reverseList(ListNode head) {

        //1.判空处理
        if (null == head) {
            return null;
        }

        //2.遍历链表,让反转后的链表头结点指向链表最末节点
        ListNode node = head;
        while (null != node.next) {
            node = node.next;
        }
        ListNode rHead = node;

        //3.递归，开始反转链表
        reverseListRecursion(head);

        //4.返回
        return rHead;
    }

    public static ListNode reverseListRecursion(ListNode node) {

        //1.递归结束逻辑
        if (null == node.next) {
            return node;
        }

        //2.递归逻辑
        ListNode reverseNode = reverseListRecursion(node.next);

        //3.回溯逻辑
        reverseNode.next = node;
        node.next = null;
        return node;
    }
}
