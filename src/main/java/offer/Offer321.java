package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-24 09:24:06
 * @describe: 从上到下打印二叉树
 */
public class Offer321 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 层序遍历二叉树
     *
     * @param root 二叉树根节点
     * @return 节点值集合
     */
    public static int[] levelOrder(TreeNode root) {

        //1.判空
        if (root == null) {
            return new int[0];
        }

        //2.创建队列，最终返回数组
        List<Integer> values = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        //3.开始循环
        while (!queue.isEmpty()) {

            //4.弹出队列头部节点
            TreeNode node = queue.poll();
            values.add(node.val);

            //5.判定
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        //6.封装为数组返回
        int[] result = new int[values.size()];
        for (int i = 0; i < values.size(); i++) {
            result[i] = values.get(i);
        }
        return result;
    }
}
