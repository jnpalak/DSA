class MyStack 
{
    Queue<Integer> que;
    public MyStack() 
    {
        que = new LinkedList<>();
    }
    public void push(int x) {
        que.offer(x);  
        int size = que.size();
        for (int i = 0; i < size - 1; i++) 
        {
            que.offer(que.poll());
        }
    }
    public int pop() 
    {
        return que.poll();
    }
    public int top() 
    {
        return que.peek();
    }
    public boolean empty() 
    {
        return que.isEmpty();
    }
}
