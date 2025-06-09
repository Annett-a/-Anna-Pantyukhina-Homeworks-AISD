public class NewStack {
    private Stack stack1;
    private Stack stack2;

    public NewStack(int capacity) {
        stack1 = new Stack(capacity);
        stack2 = new Stack(capacity);
    }

    public boolean push(int x) {
        if (!stack1.push(x)) {
            return false;
        }
        if (stack2.isEmpty() || x <= stack2.peek()) {
            stack2.push(x);
        } else {
            stack2.push(stack2.peek());
        }
        return true;
    }

    public int pop() {
        if (stack1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        stack2.pop();
        return stack1.pop();
    }

    public int peek() {
        return stack1.peek();
    }

    public int getMin() {
        if (stack2.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}
