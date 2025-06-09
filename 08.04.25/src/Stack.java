public class Stack {
    private int[] data;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        top = -1;
    }

    public boolean push(int x) {
        if (isFull()) return false;
        data[++top] = x;
        return true;
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return data[top--];
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}
