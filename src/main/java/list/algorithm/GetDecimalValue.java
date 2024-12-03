package list.algorithm;

import list.entity.ListNode;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-12-03 16:10:10
 * @describe: 链表2进制转10进制
 */
public class GetDecimalValue {

    /**
     * 链表2进制转10进制
     *
     * @param head 头节点
     * @return 10进制数
     */
    public static int getDecimalValue(ListNode head) {

        //1.定义返回结果
        int res = 0;

        //2.循环遍历
        while (head != null) {

            //3.计算结果
            res = res * 2 + head.val;

            //4.指针后移
            head = head.next;
        }

        //5.返回
        return res;
    }
}