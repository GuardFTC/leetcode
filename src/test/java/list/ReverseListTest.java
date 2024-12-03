package list;

import list.algorithm.ReverseList;
import list.entity.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseListTest {

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
        }
    }

    @Test
    void reverseList() {
        ListNode listNode = ReverseList.reverseList(head);

    }
}