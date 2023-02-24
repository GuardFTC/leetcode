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
public class Offer323 {

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
        if (null == root) {
            return new ArrayList<>();
        }

        //2.创建结果集、队列
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        //3.开始遍历
        while (!queue.isEmpty()) {

            //4.获取该层级节点数，创建临时结果集
            List<Integer> values = new ArrayList<>();
            int levelNodeNum = queue.size();

            //5.循环
            for (int i = 0; i < levelNodeNum; i++) {

                //6.获取队列头节点
                TreeNode node = queue.poll();

                //6.赋值
                if (result.size() % 2 == 0) {
                    values.add(node.val);
                } else {
                    values.add(0, node.val);
                }

                //7.左节点推入队列
                if (null != node.left) {
                    queue.offer(node.left);
                }
                if (null != node.right) {
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
     * 层序遍历二叉树-栈存储法
     *
     * @param root 二叉树根节点
     * @return 层数[节点值集合]
     */
/*    public static List<List<Integer>> levelOrder(TreeNode root) {

        //1.判空
        if (root == null) {
            return new ArrayList<>();
        }

        //2.创建队列，最终返回数组
        List<List<Integer>> result = new ArrayList<>();
        Stack<TreeNode> treeNodeStack = new Stack<>();
        treeNodeStack.push(root);
        int level = 1;

        //3.开始循环
        while (!treeNodeStack.isEmpty()) {

            //4.获取本次循环节点数
            List<Integer> values = new ArrayList<>();
            int levelNodeCount = treeNodeStack.size();
            Stack<TreeNode> tempStack = new Stack<>();

            //5.开始循环
            for (int i = 0; i < levelNodeCount; i++) {

                //6/存储当前节点值
                TreeNode node = treeNodeStack.pop();
                values.add(node.val);

                //7.判定哪个节点先入栈
                if (level % 2 == 1) {
                    if (node.left != null) {
                        tempStack.push(node.left);
                    }
                    if (node.right != null) {
                        tempStack.push(node.right);
                    }
                } else {
                    if (node.right != null) {
                        tempStack.push(node.right);
                    }
                    if (node.left != null) {
                        tempStack.push(node.left);
                    }
                }
            }

            //9.轮次++,存入结果集
            level++;
            treeNodeStack = tempStack;
            result.add(values);
        }

        //10.返回
        return result;
    }*/

    /**
     * 层序遍历二叉树-递归法
     *
     * @param root 二叉树根节点
     * @return 层数[节点值集合]
     */
    /*public static List<List<Integer>> levelOrder(TreeNode root) {

        //1.判空
        if (null == root) {
            return new ArrayList<>();
        }

        //2.创建结果集，递归
        List<List<Integer>> result = new ArrayList<>();
        recurse(root, result, 1);

        //3.返回
        return result;
    }*/

    /**
     * 递归方法
     *
     * @param node   二叉树节点
     * @param result 结果集
     * @param level  二叉树层级
     */
    /*public static void recurse(TreeNode node, List<List<Integer>> result, int level) {

        //1.获取对应层级集合，并存入集合
        List<Integer> values;
        if (result.size() >= level) {
            values = result.get(level - 1);
            if (level % 2 == 1) {
                values.add(node.val);
            } else {
                values.add(0, node.val);
            }
        } else {
            values = new ArrayList<>();
            if (level % 2 == 1) {
                values.add(node.val);
            } else {
                values.add(0, node.val);
            }
            result.add(values);
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