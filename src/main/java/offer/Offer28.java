package offer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-27 12:11:31
 * @describe: 对称的二叉树
 */
public class Offer28 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 判定二叉树是否轴对称
     *
     * @param root 二叉树根节点
     * @return 二叉树是否轴对称
     */
    public static boolean isSymmetric(TreeNode root) {

        //1.判空处理
        if (null == root) {
            return true;
        }

        //2.左右节点进行递归对称比较并返回
        return recurse(root.left, root.right);
    }

    /**
     * 递归进行二叉树轴对称判定
     *
     * @param left  左节点
     * @param right 右节点
     * @return 二叉树是否轴对称
     */
    private static boolean recurse(TreeNode left, TreeNode right) {

        //1.获取是否为空
        boolean leftNull = left == null;
        boolean rightNull = right == null;

        //2.如果不等直接返回false
        if (leftNull != rightNull) {
            return false;
        }

        //3.如果都为空，返回true
        if (leftNull) {
            return true;
        }

        //4.如果不为空，进行值比较
        if (left.val != right.val) {
            return false;
        }

        //5.左右子树进行比对
        boolean same = recurse(left.left, right.right);
        if (!same) {
            return false;
        }

        //6.右左子树进行比对
        same = recurse(left.right, right.left);
        if (!same) {
            return false;
        }

        //7.默认返回
        return true;
    }
}
