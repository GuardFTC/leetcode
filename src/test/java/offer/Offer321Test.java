package offer;

import cn.hutool.core.lang.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Offer321Test {

    @Test
    void levelOrder() {

        //1.创建如下二叉树
        //    3
        //   / \
        //  9  20
        //     / \
        //    15 17
        Offer321.TreeNode root = new Offer321.TreeNode(3);
        Offer321.TreeNode root1 = new Offer321.TreeNode(9);
        Offer321.TreeNode root2 = new Offer321.TreeNode(20);
        Offer321.TreeNode root3 = new Offer321.TreeNode(15);
        Offer321.TreeNode root4 = new Offer321.TreeNode(17);

        //2.封装二叉树
        root2.left = root3;
        root2.right = root4;
        root.left = root1;
        root.right = root2;

        //3.进行层序遍历
        int[] ints = Offer321.levelOrder(root);

        //4.校验
        String result = "[3, 9, 20, 15, 17]";
        Assert.isTrue(result.equals(Arrays.toString(ints)));
    }
}