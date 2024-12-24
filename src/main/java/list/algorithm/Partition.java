package list.algorithm;

import list.entity.ListNode;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-12-24 10:05:27
 * @describe: 分割链表
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 */
public class Partition {

    /**
     * 分割链表
     *
     * @param head 链表头节点
     * @param x    分割阈值
     * @return 分割拼接后，链表的头节点
     */
    public static ListNode partition(ListNode head, int x) {

        //1.链表判空
        if (head == null || head.next == null) {
            return head;
        }

        //2.定义小于阈值的链表头节点，大于等于阈值的链表头节点
        ListNode lqHead = null;
        ListNode lqNode = null;
        ListNode geHead = null;
        ListNode geNode = null;

        //3.循环遍历链表
        while (head != null) {

            //4.判定值
            if (head.val < x) {
                if (lqNode == null) {
                    lqNode = head;
                    lqHead = head;
                } else {
                    lqNode.next = head;
                    lqNode = head;
                }
            } else {
                if (geNode == null) {
                    geNode = head;
                    geHead = head;
                } else {
                    geNode.next = head;
                    geNode = head;
                }
            }

            //5.指针后移
            head = head.next;
        }

        //6.拼接链表
        if (geNode != null) {
            geNode.next = null;
        }
        if (lqNode != null) {
            lqNode.next = geHead;
        }

        //7.返回
        return null == lqHead ? geHead : lqHead;
    }
}
