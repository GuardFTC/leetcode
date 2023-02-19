package offer;


import cn.hutool.core.lang.Assert;
import org.junit.jupiter.api.Test;

class Offer30Test {

    @Test
    void doTest() {
        Offer30.MinStack minStack = new Offer30.MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assert.isTrue(-3 == minStack.min());
        minStack.pop();
        Assert.isTrue(0 == minStack.top());
        Assert.isTrue(-2 == minStack.min());
    }
}