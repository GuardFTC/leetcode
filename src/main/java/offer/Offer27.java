package offer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-27 11:38:10
 * @describe: 二叉树的镜像
 */
public class Offer27 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 对二叉树进行镜像反转
     *
     * @param root 二叉树根节点
     * @return 镜像反转后的二叉树根节点
     */
    public static TreeNode mirrorTree(TreeNode root) {

        //1.判空处理
        if (root == null) {
            return null;
        }

        //2.镜像反转左右节点
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        //3.左右节点分别进行镜像反转
        mirrorTree(root.left);
        mirrorTree(root.right);

        //4.返回当前节点
        return root;
    }
}
