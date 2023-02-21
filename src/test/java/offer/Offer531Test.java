package offer;

import cn.hutool.core.lang.Assert;
import org.junit.jupiter.api.Test;

class Offer531Test {

    @Test
    void search() {

        //1.调用
        int[] nums = new int[]{1, 2, 4, 5, 6, 7, 8, 8, 8, 8, 8, 8, 8};
        int target = 8;
        int search = Offer531.search(nums, target);

        //2.验证
        Assert.isTrue(7 == search);
    }
}