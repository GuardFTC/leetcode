package offer;

import cn.hutool.core.lang.Assert;
import org.junit.jupiter.api.Test;

class Offer26Test {

    @Test
    void isSubStructure() {

        //1.创建如下所示A树
        //      1
        //     / \
        //    2   3
        //   / \
        //  4   5
        Offer26.TreeNode treeNodeA = new Offer26.TreeNode(1);
        Offer26.TreeNode treeNode2 = new Offer26.TreeNode(2);
        Offer26.TreeNode treeNode3 = new Offer26.TreeNode(3);
        Offer26.TreeNode treeNode4 = new Offer26.TreeNode(4);
        Offer26.TreeNode treeNode5 = new Offer26.TreeNode(5);
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNodeA.left = treeNode2;
        treeNodeA.right = treeNode3;

        //2.创建如下所示B树
        //      2
        //     / \
        //    4   5
        Offer26.TreeNode treeNodeB = new Offer26.TreeNode(2);
        Offer26.TreeNode treeNode4Copy = new Offer26.TreeNode(4);
        Offer26.TreeNode treeNode5Copy = new Offer26.TreeNode(5);
        treeNodeB.left = treeNode4Copy;
        treeNodeB.right = treeNode5Copy;

        //3.判定存在
        boolean aExistB = Offer26.isSubStructure(treeNodeA, treeNodeB);
        Assert.isTrue(aExistB);

        //3.判定不存在
        aExistB = Offer26.isSubStructure(treeNodeB, treeNodeA);
        Assert.isFalse(aExistB);
    }
}