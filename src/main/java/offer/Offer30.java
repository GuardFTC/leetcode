package offer;

import java.util.Stack;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-19 13:24:19
 * @describe: 包含min函数的栈
 */
public class Offer30 {

    static class MinStack {

        private Stack<Integer> outStack;
        private Stack<Integer> minStack;

        public MinStack() {
            outStack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int x) {
            outStack.push(x);
            if (minStack.isEmpty() || x <= minStack.peek()) {
                minStack.push(x);
            }
        }

        public void pop() {
            Integer pop = outStack.pop();
            if (pop.equals(minStack.peek())) {
                minStack.pop();
            }
        }

        public int top() {
            return outStack.peek();
        }

        public int min() {
            return minStack.peek();
        }
    }
}
