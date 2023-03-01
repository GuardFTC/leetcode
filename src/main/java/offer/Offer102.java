package offer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-28 15:12:19
 * @describe: 青蛙跳台阶问题
 */
public class Offer102 {

//    public static void main(String[] args) {
//        System.out.println(numWays(0));
//        System.out.println(numWays(1));
//        System.out.println(numWays(2));
//        System.out.println(numWays(3));
//        System.out.println(numWays(4));
//    }

    /**
     * 共有多少种跳法
     *
     * @param n 台阶数
     * @return 多少种跳法
     */
    public static int numWays(int n) {

        //1.异常值返回
        if (n == 0 || n == 1) {
            return 1;
        }

        //2.创建状态数组
        int[] dp = new int[n + 1];

        //3.设置初始状态
        dp[0] = 1;
        dp[1] = 1;

        //4.开始循环
        for (int i = 2; i <= n; i++) {

            //5.状态转移方程
            dp[i] = dp[i - 1] + dp[i - 2];

            //6.取模
            dp[i] = dp[i] % 1000000007;
        }

        //7.返回
        return dp[n];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, -2, -3, -4, -5, -6, 7};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int dp = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            dp = Math.max(dp + nums[i], nums[i]);
            max = Math.max(max, dp);
        }
        return max;
    }
}
