package offer;

import cn.hutool.core.lang.Assert;
import org.junit.jupiter.api.Test;

class Offer11Test {

    @Test
    void minArray() {
        int[] numbers = new int[]{3, 3, 1, 3};
        Assert.isTrue(1 == Offer11.minArray(numbers));
        numbers = new int[]{2, 2, 2, 0, 1};
        Assert.isTrue(0 == Offer11.minArray(numbers));
        numbers = new int[]{1, 1};
        Assert.isTrue(1 == Offer11.minArray(numbers));
        numbers = new int[]{1};
        Assert.isTrue(1 == Offer11.minArray(numbers));
        numbers = new int[]{3, 1, 1};
        Assert.isTrue(1 == Offer11.minArray(numbers));
        numbers = new int[]{3, 1, 3};
        Assert.isTrue(1 == Offer11.minArray(numbers));
        numbers = new int[]{2, 3, 0, 2};
        Assert.isTrue(0 == Offer11.minArray(numbers));
    }
}