package offer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-22 11:31:53
 * @describe: 二维数组中的查找
 */
public class Offer04 {

    /**
     * 二维数组中的查找目标数字是否存在
     *
     * @param matrix 二维数组
     * @param target 目标数字
     * @return 目标数字是否存在
     */
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {

        //1.数组判空
        if (matrix.length == 0) {
            return false;
        }

        //2.定义列、行起止指针、最终返回结果
        int xStart = 0;
        int xEnd = matrix[0].length - 1;
        int yStart = 0;
        int yEnd = matrix.length - 1;
        boolean exist = false;

        //3.循环查找数
        while (xStart <= xEnd && yStart <= yEnd) {

            //4.行查找确定列范围
            int col = searchCol(matrix, target, xStart, xEnd, yStart);
            if (-1 == col) {
                exist = true;
                break;
            } else {
                xEnd = col;
                yStart++;
            }

            //5.列查找确定行范围
            int row = searchRow(matrix, target, yStart, yEnd, xStart);
            if (-1 == row) {
                exist = true;
                break;
            } else {
                yEnd = row;
                xStart++;
            }
        }

        //6.返回
        return exist;
    }

    /**
     * 行二分查找，确定列的范围
     *
     * @param matrix 二维数组
     * @param target 目标数字
     * @param start  左指针
     * @param end    右指针
     * @param yStart 固定行数
     * @return 列下标
     */
    private static int searchCol(int[][] matrix, int target, int start, int end, int yStart) {

        //1.定义结果
        int result = 0;

        //2.二分查找
        while (start <= end) {
            int min = (start + end) / 2;
            if (matrix[yStart][min] == target) {
                return -1;
            } else if (matrix[yStart][min] < target) {
                result = min;
                start = min + 1;
            } else {
                end = min - 1;
            }
        }

        //3.返回
        return result;
    }

    /**
     * 列二分查找，确定行范围
     *
     * @param matrix 二维数组
     * @param target 目标数字
     * @param start  左指针
     * @param end    右指针
     * @param xStart 固定列数
     * @return 行下标
     */
    private static int searchRow(int[][] matrix, int target, int start, int end, int xStart) {

        //1.定义结果
        int result = 0;

        //2.二分查找
        while (start <= end) {
            int min = (start + end) / 2;
            if (matrix[min][xStart] == target) {
                return -1;
            } else if (matrix[min][xStart] < target) {
                result = min;
                start = min + 1;
            } else {
                end = min - 1;
            }
        }

        //3.返回
        return result;
    }
}
