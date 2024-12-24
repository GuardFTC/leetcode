package list.algorithm;

import cn.hutool.core.lang.Console;
import list.entity.ListNode;
import org.junit.jupiter.api.Test;

class SplitListToPartsTest {

    @Test
    void splitListToParts() {

        //1.构建链表
        ListNode pre = null;
        for (int i = 10; i >= 1; i--) {
            ListNode listNode = new ListNode(i);
            listNode.next = pre;
            pre = listNode;
        }

        //2.分隔链表
        ListNode[] nodes = SplitListToParts.splitListToParts(pre, 3);

        //3.输出链表
        Console.log(nodes);
    }
}