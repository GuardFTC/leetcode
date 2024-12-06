package list.algorithm;

import list.entity.ListNode;


/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-12-06 10:20:48
 * @describe: 删除链表中的重复元素
 * 给定一个已排序的链表的头 head
 * 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 */
public class DeleteDuplicates {

    /**
     * 删除已升序排序的链表中的重复元素
     *
     * @param head 链表头节点
     * @return 删除重复节点后的链表头节点
     */
    public ListNode deleteDuplicates(ListNode head) {

        //1.递归结束条件，遍历到尾节点
        if (head == null) {
            return head;
        }

        //2.递归
        ListNode nextNode = deleteDuplicates(head.next);

        //3.移除重复元素
        if (nextNode != null && head.val == nextNode.val) {
            head.next = nextNode.next;
        }

        //4.返回
        return head;
    }
}
