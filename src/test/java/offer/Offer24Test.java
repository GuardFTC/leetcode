package offer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Offer24Test {

    private Offer24.ListNode head;
    private Offer24.ListNode tail;

    @BeforeEach
    void initList() {
        for (int i = 1; i <= 8; i++) {
            Offer24.ListNode listNode = new Offer24.ListNode(i);
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
        Offer24.ListNode listNode = Offer24.reverseList(head);
        while (listNode.next != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
        System.out.println(listNode.val);
    }
}