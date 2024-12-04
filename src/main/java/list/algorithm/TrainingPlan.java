package list.algorithm;

import list.entity.ListNode;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-12-04 16:53:29
 * @describe: 140.训练计划 II
 * 给定一个头节点为 head 的链表用于记录一系列核心肌群训练项目编号，请查找并返回倒数第 cnt 个训练项目编号。
 * 示例 1：
 * 输入：head = [2,4,7,8], cnt = 1
 * 输出：8
 */
public class TrainingPlan {

    public ListNode trainingPlan(ListNode head, int cnt) {

        //1.定义链表长度
        int length = 0;

        //2.遍历链表获取长度
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }

        //3.再次遍历，找到length-cnt+1数据代表查找成功
        int i = 1;
        while (head != null) {
            if (i == length - cnt + 1) {
                return head;
            }
            i++;
            head = head.next;
        }

        //4.返回
        return null;
    }
}
