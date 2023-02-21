package offer;

import cn.hutool.core.lang.Assert;
import org.junit.jupiter.api.Test;

class Offer58Test {

    @Test
    void reverseLeftWords() {

        //1.调用
        String s = "lrloseumgh";
        int n = 6;
        s = Offer58.reverseLeftWords(s, n);

        //2.校验
        String result = "umghlrlose";
        Assert.isTrue(result.equals(s));
    }
}