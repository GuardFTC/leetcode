package offer;

import cn.hutool.core.lang.Assert;
import org.junit.jupiter.api.Test;

class Offer28Test {

    @Test
    void isSymmetric() {

        //1.创建如下所示二叉树
        //      1
        //     / \
        //    2   2
        //   /     \
        //  4       4
        Offer28.TreeNode root = new Offer28.TreeNode(1);
        Offer28.TreeNode treeNode2 = new Offer28.TreeNode(2);
        Offer28.TreeNode treeNode3 = new Offer28.TreeNode(2);
        Offer28.TreeNode treeNode4 = new Offer28.TreeNode(4);
        Offer28.TreeNode treeNode5 = new Offer28.TreeNode(4);
        treeNode2.left = treeNode4;
        treeNode3.right = treeNode5;
        root.left = treeNode2;
        root.right = treeNode3;

        //2.轴对称判定
        boolean symmetric = Offer28.isSymmetric(root);
        Assert.isTrue(symmetric);

        //3.非轴对称判定
        treeNode2 = new Offer28.TreeNode(3);
        root.left = treeNode2;
        symmetric = Offer28.isSymmetric(root);
        Assert.isFalse(symmetric);
    }
}