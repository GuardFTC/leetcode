package list.algorithm;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.ObjectUtil;
import list.entity.Node;
import org.junit.jupiter.api.Test;

class FlattenTest {

    @Test
    void flatten() {

        //1.创建3个节点
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        //2.构建链表
        node1.next = node2;
        node2.prev = node1;
        node1.child = node3;

        //3.扁平化多级双向链表
        Node flattenNode = Flatten.flatten(node1);

        //4.校验
        Assert.isTrue(ObjectUtil.isNotNull(flattenNode));
        Assert.isTrue(ObjectUtil.isNotNull(flattenNode.next));
        Assert.isTrue(ObjectUtil.isNotNull(flattenNode.next.next));
        Assert.isTrue(1 == flattenNode.val);
        Assert.isTrue(2 == flattenNode.next.val);
        Assert.isTrue(3 == flattenNode.next.next.val);
    }
}