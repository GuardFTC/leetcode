package list.algorithm;

import list.entity.ListNode;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-12-02 16:11:17
 * @describe: 删除链表的节点
 */
public class DeleteNode {

    /**
     * 删除链表的节点
     *
     * @param head 参数链表的头节点
     * @param val  待删除节点值
     * @return 删除后链表的头节点
     */
    public ListNode deleteNode(ListNode head, int val) {

        //1.递归结束条件，找到目标节点，返回其后置节点
        if (head.val == val) {
            return head.next;
        }

        //2.递归删除节点
        head.next = deleteNode(head.next, val);
        return head;
    }
}
