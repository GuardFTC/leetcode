package list.algorithm;

import list.entity.ListNode;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-12-04 17:27:55
 * @describe: 链表的中间节点
 */
public class MiddleNode {

    /**
     * 获取链表的中间节点
     *
     * @param head 头节点
     * @return 链表的中间节点
     */
    public ListNode middleNode(ListNode head) {

        //1.如果只有头节点，直接返回
        if (head.next == null) {
            return head;
        }

        //2.定义快慢指针
        ListNode slow = head;
        ListNode fast = head;

        //3.循环
        while (fast != null && fast.next != null) {

            //4.指针后移
            slow = slow.next;
            fast = fast.next.next;
        }

        //5.返回
        return slow;
    }
}
