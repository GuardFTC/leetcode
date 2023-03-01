package offer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-28 14:45:59
 * @describe: 菲波那切数列
 */
public class Offer101 {

    public static void main(String[] args) {
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
    }

    /**
     * 菲波那切数列
     *
     * @param n 数字n
     * @return f(n)
     */
    public static int fib(int n) {

        //1.判0
        if(n == 0){
            return 0;
        }

        //2.创建数组
        int[] dp = new int[n + 1];

        //3.设置初始状态
        dp[0] = 0;
        dp[1] = 1;

        //4.开始循环
        for (int i = 2; i <= n; i++) {

            //5.设置转移方程
            dp[i] = dp[i - 1] + dp[i - 2];

            //6.取模
            dp[i] = dp[i] % 1000000007;
        }

        //7.返回
        return dp[n];
    }
}
