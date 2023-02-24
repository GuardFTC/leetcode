package offer;

import cn.hutool.core.lang.Assert;
import org.junit.jupiter.api.Test;

class Offer04Test {

    @Test
    void findNumberIn2DArray() {

        //1.存在校验
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {6, 6, 9, 16, 12},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 30;
        boolean exist = Offer04.findNumberIn2DArray(matrix, target);
        Assert.isTrue(exist);

        //2.不存在校验
        target = 100;
        exist = Offer04.findNumberIn2DArray(matrix, target);
        Assert.isFalse(exist);

        //3.空数组校验
        matrix = new int[][]{};
        exist = Offer04.findNumberIn2DArray(matrix, target);
        Assert.isFalse(exist);
    }
}