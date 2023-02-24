package offer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-22 21:05:09
 * @describe: 旋转数组的最小数字
 */
public class Offer11 {

    public static int minArray(int[] numbers) {

        //1.判定数组是否未发生旋转
        int length = numbers.length;
        if (numbers[length - 1] > numbers[0]) {
            return numbers[0];
        }

        //2.以数组头节点为target，进行二分查找
        int left = 0;
        int right = length - 1;
        int result = numbers[right];
        while (left <= right) {

            //3.计算中位指针并比较
            int med = (left + right) / 2;
            if (numbers[med] > numbers[0]) {
                left = med + 1;
            } else if (numbers[med] < numbers[0]) {
                result = numbers[med];
                right = med - 1;
            } else {
                int min = numbers[0];
                for (int i = 0; i < length; i++) {
                    if (numbers[i] < min) {
                        min = numbers[i];
                    }
                }
                return min;
            }
        }

        //4.返回
        return result;
    }
}
