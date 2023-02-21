package offer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-21 16:36:51
 * @describe: 在排序数组中查找数字(I)
 */
public class Offer531 {

    /**
     * 在排序数组中查找数字
     *
     * @param nums   目标数组
     * @param target 目标数
     * @return 目标数在目标数组中出现的次数
     */
    public static int search(int[] nums, int target) {

        //1.二分查找获取目标数下标
        int index = searchIndex(nums, target);
        if (-1 == index) {
            return 0;
        }

        //2.定义左右指针，以及出现次数
        int left = index - 1;
        int right = index + 1;
        int count = 1;

        //3.向左边查找
        while (left >= 0) {
            if (nums[left] == target) {
                count++;
                left--;
            } else {
                break;
            }
        }

        //4.向右边查找
        while (right <= nums.length - 1) {
            if (nums[right] == target) {
                count++;
                right++;
            } else {
                break;
            }
        }

        //5.返回
        return count;
    }

    /**
     * 二分查找
     *
     * @param nums   目标数组
     * @param target 目标数
     * @return 目标数下标，未找到返回-1
     */
    public static int searchIndex(int[] nums, int target) {

        //1.定义起止指针
        int start = 0;
        int end = nums.length - 1;

        //2.二分查找
        while (start <= end) {
            int min = (start + end) / 2;
            if (nums[min] == target) {
                return min;
            } else if (nums[min] < target) {
                start = min + 1;
            } else {
                end = min - 1;
            }
        }

        //3.异常返回
        return -1;
    }
}
