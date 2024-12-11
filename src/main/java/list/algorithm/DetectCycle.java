package list.algorithm;

import list.entity.ListNode;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-12-09 14:11:31
 * @describe: 判定链表是否有环，如果有，返回起始相交节点。如果没有，返回null
 */
public class DetectCycle {

    /**
     * 判定链表是否有环，如果有，返回起始相交节点。如果没有，返回null
     *
     * @param head 链表头节点
     * @return 起始相交节点/null
     */
    public ListNode detectCycle(ListNode head) {

        //1.链表判空
        if (head == null || head.next == null) {
            return null;
        }

        //2.定义快慢指针
        ListNode slow = head;
        ListNode fast = head;

        //3.循环获取起始节点
        while (fast != null) {

            //4.慢指针后移
            slow = slow.next;

            //5.快指针后移
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }

            //6.如果快慢指针相遇
            if (fast == slow) {

                //7.定义结果节点指向头节点
                ListNode res = head;

                //8.循环直至结果节点与慢指针相遇
                while (res != slow) {
                    res = res.next;
                    slow = slow.next;
                }

                //9.返回结果节点
                return res;
            }
        }

        //10.返回
        return null;
    }
}
