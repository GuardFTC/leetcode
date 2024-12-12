package list.algorithm;

import list.entity.Node;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-12-11 16:08:20
 * @describe: 扁平化多级双向链表
 */
public class Flatten {

    /**
     * 扁平化多级双向链表
     *
     * @param head 链表头节点
     * @return 转换后的链表头节点
     */
    public static Node flatten(Node head) {

        //1.递归结束条件
        if (head == null) {
            return null;
        }

        //2.循环链表
        Node node = head;
        while (node != null) {

            //3.判定节点是否包含子链表
            if (node.child != null) {

                //3.子链表递归
                Node childNode = flatten(node.child);

                //4.获取子链表尾节点tail
                Node tail = childNode;
                while (tail.next != null) {
                    tail = tail.next;
                }

                //5.当前节点的后置节点重置指针
                if (node.next != null) {
                    node.next.prev = tail;
                    tail.next = node.next;
                }

                //6.当前节点重置指针
                node.next = childNode;
                childNode.prev = node;
                node.child = null;

                //7.返回当前节点的后置节点
                node = tail.next;
            } else {
                node = node.next;
            }
        }

        //8.返回头节点
        return head;
    }
}
