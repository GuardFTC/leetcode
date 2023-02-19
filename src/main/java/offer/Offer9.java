package offer;

import java.util.Stack;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-19 13:24:19
 * @describe: 用两个栈实现队列
 */
public class Offer9 {

    static class CQueue {

        private Stack<Integer> inStack;
        private Stack<Integer> outStack;

        public CQueue() {
            inStack = new Stack<>();
            outStack = new Stack<>();
        }

        public void appendTail(int value) {
            inStack.push(value);
        }

        public int deleteHead() {
            if (!outStack.isEmpty()) {
                return outStack.pop();
            }
            if (inStack.isEmpty()) {
                return -1;
            }
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
            return outStack.pop();
        }
    }
}
