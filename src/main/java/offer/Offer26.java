package offer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-27 10:09:01
 * @describe: 树的子结构
 */
public class Offer26 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 判定B是否为A的子树
     *
     * @param A A树根节点
     * @param B B树根节点
     * @return B是否为A的子树
     */
    public static boolean isSubStructure(TreeNode A, TreeNode B) {

        //1.判空处理
        if (A == null || B == null) {
            return false;
        }

        //2.递归
        return recurse(A, B);
    }

    /**
     * 递归判定B是否为A的子树
     *
     * @param nodeA A树根节点
     * @param nodeB B树根节点
     * @return B是否为A的子树
     */
    private static boolean recurse(TreeNode nodeA, TreeNode nodeB) {

        //1.判定A、B节点值是否相等
        if (nodeA.val == nodeB.val) {
            boolean exist = recurseEqual(nodeB, nodeA);
            if (exist) {
                return true;
            }
        }

        //2.左子树与B进行比较
        if (nodeA.left != null) {
            boolean exist = recurse(nodeA.left, nodeB);
            if (exist) {
                return true;
            }
        }

        //3.右子树与B进行比较
        if (nodeA.right != null) {
            boolean exist = recurse(nodeA.right, nodeB);
            if (exist) {
                return true;
            }
        }

        //4.返回默认值
        return false;
    }

    /**
     * 递归判定A与B是否完全一致
     *
     * @param nodeA A树根节点
     * @param nodeB B树根节点
     * @return A与B是否完全一致
     */
    private static boolean recurseEqual(TreeNode nodeA, TreeNode nodeB) {

        //1.判空处理
        if (nodeB == null) {
            return false;
        }

        //2.判定A、B节点值是否相等
        if (nodeA.val != nodeB.val) {
            return false;
        }

        //3.A、B节点左子树进行比较
        if (nodeA.left != null) {
            boolean equal = recurseEqual(nodeA.left, nodeB.left);
            if (!equal) {
                return false;
            }
        }

        //4.A、B节点右子树进行比较
        if (nodeA.right != null) {
            boolean equal = recurseEqual(nodeA.right, nodeB.right);
            if (!equal) {
                return false;
            }
        }

        //5.返回默认值
        return true;
    }
}
