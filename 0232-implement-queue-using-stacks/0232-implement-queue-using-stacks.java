class MyQueue {
    private Stack<Integer> input;
    private Stack<Integer> output;
    private int peekEl;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
        peekEl = -1;
    }
    public void push(int x) {
        if (input.empty()) {
            peekEl = x;
        }
        input.push(x);
    }

    public int pop() {
        if (output.empty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }
        }
        int val = output.pop();
        return val;
    }
    public int peek()
     {
        if (output.empty()) 
        {
            return peekEl;
        }
        return output.peek();
    }
    public boolean empty()
     {
        return input.empty() && output.empty();
     }
}