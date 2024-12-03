package list.algorithm;

import list.entity.ListNode;

import java.util.Stack;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-11-29 16:09:03
 * @describe: 回文链表
 */
public class IsPalindrome {

    /**
     * 判定链表是否为回文链表
     *
     * @param head 头节点
     * @return 链表是否为回文链表
     */
    public static boolean isPalindrome(ListNode head) {

        //1.判空处理
        if (head == null || head.next == null) {
            return true;
        }

        //2.定义一个栈
        Stack<Integer> stack = new Stack<>();

        //3.遍历链表，将值压入栈
        ListNode node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }

        //4.遍历链表，与栈值比较是否一致，不一致直接返回false
        while (!stack.isEmpty()) {
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }

        //5.返回true
        return true;
    }
}

