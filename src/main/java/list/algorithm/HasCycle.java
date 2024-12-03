package list.algorithm;

import list.entity.ListNode;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-12-02 16:40:16
 * @describe: 环形链表, 判定链表中是否有环
 */
public class HasCycle {

    /**
     * 判定链表中是否有环
     *
     * @param head 链表头节点
     * @return 链表中是否有环
     */
    public boolean hasCycle(ListNode head) {

        //1.头节点判空
        if (head == null || head.next == null) {
            return false;
        }

        //2.定义快慢指针
        ListNode fast = head;
        ListNode slow = head;

        //3.循环链表
        while (fast != null) {

            //4.快指针后移
            fast = fast.next;

            //5.如果快慢指针一致，代表出现环，返回
            if (fast == slow) {
                return true;
            }

            //6.快慢指针同时后移
            if (null != fast) {
                fast = fast.next;
            }
            slow = slow.next;
        }

        //7.返回false
        return false;
    }
}
