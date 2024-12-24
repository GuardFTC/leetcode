package list.algorithm;

import list.entity.ListNode;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-12-23 16:28:49
 * @describe: 反转链表 II
 * 给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right
 * 请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 */
public class ReverseBetween {

    /**
     * 翻转链表2
     *
     * @param head  链表头节点
     * @param left  最左界限
     * @param right 最右界限
     * @return 反转后链表的头节点
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {

        //1.定义最左节点以及最右节点
        ListNode beforeLeft = null;
        ListNode afterRight = null;

        //2.定义起始左侧节点，以及结束右侧节点
        ListNode startLeft = head;
        ListNode endRight = head;

        //3.循环链表设置最左以及最右节点
        int i = 1;
        ListNode node = head;
        while (node != null) {

            //4.设置最左节点,起始左侧节点
            if (i + 1 == left) {
                beforeLeft = node;
                startLeft = node.next;
            }

            //5.设置最右节点,以及结束右侧节点
            if (i == right) {
                afterRight = node.next;
                endRight = node;
            }

            //6.指针后移
            i++;
            node = node.next;
        }

        //7.翻转链表
        reverse(startLeft, endRight);

        //8.拼接链表
        if (beforeLeft != null) {
            beforeLeft.next = endRight;
        }
        startLeft.next = afterRight;

        //9.返回
        return beforeLeft == null ? endRight : head;
    }

    /**
     * 翻转链表
     *
     * @param head 头节点
     * @return 翻转后链表的头节点
     */
    public ListNode reverse(ListNode head, ListNode endRight) {

        //1.递归结束条件
        if (head == endRight) {
            return head;
        }

        //2.递归
        ListNode nextNode = reverse(head.next, endRight);

        //3.翻转
        nextNode.next = head;
        head.next = null;
        return head;
    }
}
