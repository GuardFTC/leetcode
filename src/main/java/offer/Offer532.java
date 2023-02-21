package offer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-21 17:58:27
 * @describe: 0～n-1中缺失的数字
 */
public class Offer532 {

    /**
     * 0～n-1中缺失的数字
     *
     * @param nums 目标数组
     * @return 缺失的数字
     */
    public static int missingNumber(int[] nums) {

        //1.定义起止指针
        int start = 0;
        int end = nums.length - 1;
        int result = nums.length;

        //2.开始二分查找
        while (start <= end) {
            int min = (start + end) / 2;
            if (min != nums[min]) {
                result = min;
                end = min - 1;
            } else {
                start = min + 1;
            }
        }

        //3.异常返回
        return result;
    }
}
