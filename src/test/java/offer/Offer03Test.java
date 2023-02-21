package offer;

import cn.hutool.core.lang.Assert;
import org.junit.jupiter.api.Test;

class Offer03Test {

    @Test
    void findRepeatNumber() {

        //1.调用
        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        int repeatNumber = Offer03.findRepeatNumber(nums);

        //2.调用
        Assert.isTrue(2 == repeatNumber);
    }
}