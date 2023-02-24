package offer;

import cn.hutool.core.lang.Assert;
import org.junit.jupiter.api.Test;

class Offer50Test {

    @Test
    void firstUniqChar() {
        String s = "cssdccperg";
        Assert.isTrue('d' == Offer50.firstUniqChar(s));
    }
}