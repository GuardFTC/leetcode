package offer;

import java.util.HashMap;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-20 13:27:40
 * @describe: 复杂链表的复制
 */
public class Offer35 {

    public static class Node {
        int val;
        Node next;
        Node k, random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static Node copyRandomList(Node head) {

        //1.判空
        if (head == null) {
            return null;
        }

        //2.创建Map
        HashMap<Node, Node> nodeMap = new HashMap<>();

        //3.递归并返回结果
        return copyRandomList(head, nodeMap);
    }

    public static Node copyRandomList(Node node, HashMap<Node, Node> nodeMap) {

        //1.复制节点并存入Map
        Node copyNode = new Node(node.val);
        nodeMap.put(node, copyNode);

        //2.递归结束条件
        if (node.next == null) {
            copyNode.random = nodeMap.get(node.random);
            return copyNode;
        }

        //3.递归逻辑
        Node copyNextNode = copyRandomList(node.next, nodeMap);

        //4.回溯逻辑
        copyNode.next = copyNextNode;
        copyNode.random = nodeMap.get(node.random);

        //5.返回
        return copyNode;
    }
}
