package list.algorithm;

import list.entity.ListNode;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-12-06 09:20:20
 * @describe: 移除重复节点
 */
public class RemoveDuplicateNodes {

    /**
     * 移除重复节点
     *
     * @param head 头节点
     * @return 移除重复节点后的链表
     */
    public ListNode removeDuplicateNodes(ListNode head) {

        //1.头结点判空
        if (head == null || head.next == null) {
            return head;
        }

        //2.定义boolean数组表示节点是否重复出现
        boolean[] set = new boolean[20000];

        //3.循环清除重复节点
        ListNode node = head;
        ListNode preNode = head;
        while (node != null) {

            //4.判定节点值是否出现过
            if (set[node.val]) {
                node = node.next;
                preNode.next = node;
            } else {
                set[node.val] = true;
                preNode = node;
                node = node.next;
            }
        }

        //5.返回头节点
        return head;
    }
}
