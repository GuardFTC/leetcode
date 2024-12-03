package list.entity;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-11-29 15:24:04
 * @describe: 链表节点
 */
public class ListNode {

    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
