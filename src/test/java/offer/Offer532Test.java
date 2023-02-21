package offer;

import cn.hutool.core.lang.Assert;
import org.junit.jupiter.api.Test;

class Offer532Test {

    @Test
    void missingNumber() {

        //1.调用
        int[] nums = {0, 1, 3};
        int missingNumber = Offer532.missingNumber(nums);

        //2.验证
        Assert.isTrue(2 == missingNumber);
    }
}