package list.algorithm;

import cn.hutool.core.lang.Assert;
import list.entity.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetDecimalValueTest {

    private ListNode head;
    private ListNode tail;

    @BeforeEach
    void initList() {
        for (int i = 1; i <= 8; i++) {
            ListNode listNode = new ListNode(i);
            if (i == 1) {
                head = listNode;
            } else {
                tail.next = listNode;
            }
            tail = listNode;

            listNode.val = i % 2;
        }
    }

    @Test
    void getDecimalValue() {

        //1.获取10机制数
        int decimalValue = GetDecimalValue.getDecimalValue(head);

        //2.校验
        Assert.isTrue(170 == decimalValue);
    }
}