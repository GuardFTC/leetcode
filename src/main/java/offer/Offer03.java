package offer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-21 10:45:56
 * @describe: 数组中重复的数字
 */
public class Offer03 {

    public static int findRepeatNumber(int[] nums) {

        //1.循环置换
        int i = 0;
        while (i < nums.length) {

            //2.判定当前下标与对应数字是否一致
            if (nums[i] == i) {
                i++;
                continue;
            }

            //3.置换过程中发现相等的元素，直接返回
            if (nums[i] == nums[nums[i]]) {
                return nums[i];
            }

            //4.开始置换
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }

        //5.异常返回
        return 0;
    }
}
