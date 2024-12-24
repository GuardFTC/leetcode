package list.algorithm;

import cn.hutool.core.lang.Assert;
import list.entity.ListNode;
import org.junit.jupiter.api.Test;

class PartitionTest {

    @Test
    void partition() {

        //1.封装链表
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        //2.分割链表
        ListNode partition = Partition.partition(node1, 3);

        //3.校验
        Assert.isTrue(1 == partition.val);
        Assert.isTrue(2 == partition.next.val);
    }
}