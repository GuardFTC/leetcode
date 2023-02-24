package offer;

import cn.hutool.core.lang.Assert;
import cn.hutool.json.JSONUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

class Offer322Test {

    @Test
    void levelOrder() {

        //1.创建如下二叉树
        //        3
        //       / \
        //      9   20
        //     / \  / \
        //    24 3015 17
        Offer322.TreeNode root = new Offer322.TreeNode(3);
        Offer322.TreeNode root1 = new Offer322.TreeNode(9);
        Offer322.TreeNode root5 = new Offer322.TreeNode(24);
        Offer322.TreeNode root6 = new Offer322.TreeNode(30);
        Offer322.TreeNode root2 = new Offer322.TreeNode(20);
        Offer322.TreeNode root3 = new Offer322.TreeNode(15);
        Offer322.TreeNode root4 = new Offer322.TreeNode(17);

        //2.封装二叉树
        root2.left = root3;
        root2.right = root4;
        root1.left = root5;
        root1.right = root6;
        root.left = root1;
        root.right = root2;

        //3.层序遍历二叉树
        List<List<Integer>> result = Offer322.levelOrder(root);

        //4.校验
        String rightStr = "[[3],[9,20],[24,30,15,17]]";
        Assert.isTrue(rightStr.equals(JSONUtil.toJsonStr(result)));
    }
}