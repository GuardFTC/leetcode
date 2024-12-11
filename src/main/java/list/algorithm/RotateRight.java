package list.algorithm;

import list.entity.ListNode;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-12-09 15:55:15
 * @describe: 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置
 */
public class RotateRight {

    /**
     * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置
     *
     * @param head 链表的头节点
     * @param k    链表每个节点向右移动 k 个位置
     * @return 旋转后链表的头节点
     */
    public ListNode rotateRight(ListNode head, int k) {

        //1.判空处理
        if (head == null || head.next == null) {
            return head;
        }

        //2.循环获取总长度
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }

        //3.与k取模
        int rotate = k % length;
        if (rotate == 0) {
            return head;
        }

        //4.遍历尾节点next指向头节点
        cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = head;

        //5.再次遍历在第length-rotate个节点处断开连接
        cur = head;
        for (int i = 1; i < length - rotate; i++) {
            cur = cur.next;
        }
        ListNode res = cur.next;
        cur.next = null;

        //6.返回
        return res;
    }
}
