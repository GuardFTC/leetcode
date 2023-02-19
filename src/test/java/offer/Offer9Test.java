package offer;

import cn.hutool.core.lang.Assert;
import org.junit.jupiter.api.Test;

class Offer9Test {

    @Test
    void doTest() {
        Offer9.CQueue cQueue = new Offer9.CQueue();
        Assert.isTrue(-1 == cQueue.deleteHead());
        cQueue.appendTail(5);
        cQueue.appendTail(2);
        Assert.isTrue(5 == cQueue.deleteHead());
        Assert.isTrue(2 == cQueue.deleteHead());
    }
}