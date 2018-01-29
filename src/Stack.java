class Stack {
    private int[] stack;
    private int index;

    Stack(int n) {
        stack = new int[n];
        index = 0;
    }

    void push(int n) {
        if (index < stack.length) {
            stack[index++] = n;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    int pop() {
        if (index > 0) {
            return stack[index--];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    int top() {
        if (index > 0) {
            return stack[index - 1];
        } else {
            return -1;
        }
    }

    boolean isEmpty() {
        return index == 0;
    }
}
