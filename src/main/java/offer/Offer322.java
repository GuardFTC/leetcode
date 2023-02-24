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
public class Offer322 {

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
     * @return 层数[节点值集合]
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {

        //1.判空
        if (root == null) {
            return new ArrayList<>();
        }

        //2.创建队列，最终返回数组
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        //3.开始循环，进行层序遍历
        while (!queue.isEmpty()) {

            //4.获取当前层节点数
            int levelRootNum = queue.size();
            List<Integer> values = new ArrayList<>();

            //5.循环当前层的节点
            for (int i = 0; i < levelRootNum; i++) {

                //6.获取节点，存值
                TreeNode node = queue.poll();
                values.add(node.val);

                //7.将左右子树存入队列
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            //8.存入结果集
            result.add(values);
        }

        //9.返回
        return result;
    }

    /**
     * 层数遍历二叉树-递归法
     *
     * @param root 二叉树根节点
     * @return 层数[节点值集合]
     */
    /*public static List<List<Integer>> levelOrder(TreeNode root) {

        //1.判空
        if (root == null) {
            return new ArrayList<>();
        }

        //2.创建最终返回数组
        List<List<Integer>> result = new ArrayList<>();

        //3.递归
        recurse(root, result, 1);

        //4.返回
        return result;
    }*/

    /**
     * 递归遍历二叉树
     *
     * @param node   二叉树节点
     * @param result 结果集
     * @param level  二叉树层级
     */
    /*public static void recurse(TreeNode node, List<List<Integer>> result, int level) {

        //1.根据level获取list，存入当前值
        if (result.size() < level) {
            List<Integer> values = new ArrayList<>();
            values.add(node.val);
            result.add(values);
        } else {
            List<Integer> values = result.get(level - 1);
            values.add(node.val);
        }

        //2.左右子树递归
        level++;
        if (node.left != null) {
            recurse(node.left, result, level);
        }
        if (node.right != null) {
            recurse(node.right, result, level);
        }
    }*/
}
