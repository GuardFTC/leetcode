package list.entity;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-12-11 16:22:32
 * @describe: 多级双向链表节点
 */
public class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getChild() {
        return child;
    }

    public void setChild(Node child) {
        this.child = child;
    }

    public Node(int val) {
        this.val = val;
    }
}
