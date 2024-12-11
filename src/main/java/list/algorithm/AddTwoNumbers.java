package list.algorithm;

import list.entity.ListNode;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-12-09 16:39:24
 * @describe: 链表求和
 * 给定两个用链表表示的整数，每个节点包含一个数位。
 * 这些数位是反向存放的，也就是个位排在链表首部。
 * 编写函数对这两个整数求和，并用链表形式返回结果。
 */
public class AddTwoNumbers {

    /**
     * 链表求和
     *
     * @param l1 链表1头节点
     * @param l2 链表2头节点
     * @return 计算结果链表的头节点
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //1.定义前置节点，以及结果节点
        ListNode pre = new ListNode(0);
        ListNode res = pre;

        //2.定义余数
        int remainder = 0;

        //3.循环计算
        while (l1 != null || l2 != null) {

            //4.取值
            int l1Val = l1 == null ? 0 : l1.val;
            int l2Val = l2 == null ? 0 : l2.val;

            //5.计算当前节点值,计算余数值
            int curVal = (l1Val + l2Val + remainder) % 10;
            remainder = (l1Val + l2Val + remainder) / 10;

            //6.创建当前节点
            ListNode cur = new ListNode(curVal);

            //7.前置节点与当前节点连接
            pre.next = cur;

            //8.pre指针后移
            pre = cur;

            //9.l1,l2指针后移
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        //10.如果余数溢出，额外创建一个节点
        if (remainder != 0) {
            pre.next = new ListNode(remainder);
        }

        //11.返回结果节点
        return res.next;
    }
}
