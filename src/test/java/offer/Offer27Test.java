package offer;

import cn.hutool.core.lang.Assert;
import org.junit.jupiter.api.Test;

class Offer27Test {

    @Test
    void mirrorTree() {

        //1.创建如下所示二叉树
        //      1
        //     / \
        //    2   3
        //   / \
        //  4   5
        Offer27.TreeNode root = new Offer27.TreeNode(1);
        Offer27.TreeNode treeNode2 = new Offer27.TreeNode(2);
        Offer27.TreeNode treeNode3 = new Offer27.TreeNode(3);
        Offer27.TreeNode treeNode4 = new Offer27.TreeNode(4);
        Offer27.TreeNode treeNode5 = new Offer27.TreeNode(5);
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        root.left = treeNode2;
        root.right = treeNode3;

        //2.翻转
        Offer27.TreeNode treeNode = Offer27.mirrorTree(root);

        //3.验证
        Assert.isTrue(1 == treeNode.val);
        Assert.isTrue(3 == treeNode.left.val);
        Assert.isTrue(2 == treeNode.right.val);
        Assert.isTrue(5 == treeNode.right.left.val);
        Assert.isTrue(4 == treeNode.right.right.val);
    }
}