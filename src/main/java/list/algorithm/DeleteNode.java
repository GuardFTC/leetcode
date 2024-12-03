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

        //1.头节点为空，直接返回
        if (head == null) {
            return null;
        }

        //2.如果只有头节点，且与待删除节点值一致
        if (head.val == val && head.next == null) {
            return null;
        } else if (head.val == val) {
            return head.next;
        } else if (head.next == null) {
            return head;
        }

        //3.递归寻找目标节点
        recursion(head, val);

        //4.返回头节点
        return head;
    }

    /**
     * 递归查找目标节点并删除
     *
     * @param node 链表节点
     * @param val  待删除节点值
     * @return 后置节点
     */
    public ListNode recursion(ListNode node, int val) {

        //1.递归结束条件，找到目标节点，返回其后置节点
        if (node.val == val) {
            return node.next;
        }

        //2.递归
        ListNode nextNode = recursion(node.next, val);

        //3.删除节点
        node.next = nextNode;
        return node;
    }
}
