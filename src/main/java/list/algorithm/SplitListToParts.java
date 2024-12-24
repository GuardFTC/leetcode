package list.algorithm;

import list.entity.ListNode;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-12-24 14:06:32
 * @describe: 分隔链表
 * 给你一个头结点为 head 的单链表和一个整数 k ，请你设计一个算法将链表分隔为 k 个连续的部分。
 * 每部分的长度应该尽可能的相等：任意两部分的长度差距不能超过 1 。这可能会导致有些部分为 null 。
 * 这 k 个部分应该按照在链表中出现的顺序排列，并且排在前面的部分的长度应该大于或等于排在后面的长度。
 * 返回一个由上述 k 部分组成的数组。
 * <p>
 * 解题思路：
 * 1.xn+y(n+1) = length
 * x+y = k
 * 2.xn+yn+y = length
 * y = k-x
 * 3.xn+(k-x)n+k-x = length
 * 4.xn+kn-xn+k-x = length
 * 5.kn+k-x = length
 * 6.x = kn+k-length
 * 7.y = k-x
 */
public class SplitListToParts {

    /**
     * 分隔链表
     *
     * @param head 链表头节点
     * @param k    分割段数
     * @return 分割后的链表数组
     */
    public static ListNode[] splitListToParts(ListNode head, int k) {

        //1.创建结果数组
        ListNode[] nodes = new ListNode[k];

        //2.获取链表长度
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }

        //3.计算每段链表最小个数
        int minIndex = length == 0 ? 0 : length / k;

        //4.计算小段链表个数，大段链表个数
        int littleListNum = k * minIndex + k - length;
        int largeListNum = k - littleListNum;

        //5.循环k
        for (int i = 1; i <= k; i++) {

            //6.定义起止节点
            ListNode start = head;
            ListNode end = head;

            //7.定义步长
            int step = i > largeListNum ? minIndex : minIndex + 1;

            //8.循环链表
            for (int j = 0; j < step - 1; j++) {
                head = head.next;
                end = end.next;
            }

            //9.存入数组
            nodes[i - 1] = start;
            if (head != null) {
                head = head.next;
            }
            if (end != null) {
                end.next = null;
            }
        }

        //10.返回
        return nodes;
    }
}
