package offer;

import cn.hutool.core.lang.Assert;
import org.junit.jupiter.api.Test;

class Offer05Test {

    @Test
    void replaceSpace() {

        //1.调用
        String s = "i am you fuck friend";
        s = Offer05.replaceSpace(s);

        //2.校验
        String result = "i%20am%20you%20fuck%20friend";
        Assert.isTrue(result.equals(s));
    }
}