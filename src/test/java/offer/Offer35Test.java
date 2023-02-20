package offer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Offer35Test {

    private Offer35.Node head;

    @BeforeEach
    void initList() {
        Offer35.Node listNode1 = new Offer35.Node(7);
        Offer35.Node listNode2 = new Offer35.Node(13);
        Offer35.Node listNode3 = new Offer35.Node(11);
        Offer35.Node listNode4 = new Offer35.Node(10);
        Offer35.Node listNode5 = new Offer35.Node(1);

        listNode1.next = listNode2;
        listNode1.random = null;
        listNode2.next = listNode3;
        listNode2.random = listNode1;
        listNode3.next = listNode4;
        listNode3.random = listNode5;
        listNode4.next = listNode5;
        listNode4.random = listNode3;
        listNode5.next = null;
        listNode5.random = listNode1;

        head = listNode1;
    }

    @Test
    void copyRandomList() {
        Offer35.Node node = Offer35.copyRandomList(head);
        while (node.next != null) {
            System.out.println("node-val:" + node.val + " | node-random-val:" + (node.random == null ? null : node.random.val));
            node = node.next;
        }
        System.out.println("node-val:" + node.val + " | node-random-val:" + (node.random == null ? null : node.random.val));
    }
}