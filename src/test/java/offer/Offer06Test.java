package offer;

import cn.hutool.core.lang.Console;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Offer06Test {

    private Offer06.ListNode head;
    private Offer06.ListNode tail;

    @BeforeEach
    void initList() {
        for (int i = 1; i <= 8; i++) {
            Offer06.ListNode listNode = new Offer06.ListNode(i);
            if (i == 1) {
                head = listNode;
            } else {
                tail.next = listNode;
            }
            tail = listNode;
        }
    }

    @Test
    void reversePrint() {
        int[] ints = Offer06.reversePrint(head);
        Console.print(ints);
    }
}