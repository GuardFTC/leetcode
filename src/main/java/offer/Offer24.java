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

        //2.创建起止节点
        ListNode pre = head;
        ListNode end = head;

        //3.遍历链表,让头结点指向链表最末节点
        ListNode node = head;
        while (null != node.next) {
            node = node.next;
        }

        //4.头结点指向链表最末节点
        ListNode rHead = node;

        //5.递归，开始反转链表
        reverseList(head, pre, end);

        //6.返回
        return rHead;
    }

    public static void reverseList(ListNode node, ListNode pre, ListNode end) {

        //1.递归结束逻辑
        if (null == node.next) {
            return;
        }

        //2.递归逻辑
        pre = node;
        end = node.next;
        reverseList(node.next, pre, end);

        //3.回溯逻辑
        end.next = pre;
        pre.next = null;
    }
}
