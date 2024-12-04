package list.algorithm;

import list.entity.ListNode;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-12-04 14:23:31
 * @describe: 移除链表元素
 */
public class RemoveElements {

    /**
     * 移除链表元素
     *
     * @param head 链表头节点
     * @param val  链表值
     * @return 移除后的链表头节点
     */
    public ListNode removeElements(ListNode head, int val) {

        //1.循环找到头节点
        while (head != null) {
            if (head.val == val) {
                head = head.next;
            } else {
                break;
            }
        }

        //2.链表判空处理
        if (null == head) {
            return null;
        }

        //3.定义快慢节点
        ListNode preNode = head;
        ListNode node = head.next;

        //4.循环移除元素
        while (node != null) {

            //4.判定值是否与目标值一致
            if (node.val == val) {
                node = node.next;
                preNode.next = node;
            } else {
                preNode = node;
                node = node.next;
            }
        }

        //6.返回
        return head;
    }
}
