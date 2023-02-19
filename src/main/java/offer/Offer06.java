package offer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-19 14:50:49
 * @describe: 从尾到头打印链表
 */
public class Offer06 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static int[] reversePrint(ListNode head) {

        //1.空值判定
        if (null == head) {
            return new int[]{};
        }

        //2.获取链表长度
        int length = 1;
        ListNode node = head;
        while (head.next != null) {
            length++;
            head = head.next;
        }

        //3.创建结果集
        int[] result = new int[length];

        //4.递归
        reversePrint(node, result, 1);

        //5.返回
        return result;
    }

    private static void reversePrint(ListNode node, int[] result, int round) {

        //1.递归结束的条件
        if (node.next == null) {
            result[result.length - round] = node.val;
            return;
        }

        //2.递归逻辑
        reversePrint(node.next, result, round + 1);

        //3.回溯逻辑
        result[result.length - round] = node.val;
    }
}
