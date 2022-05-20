package stack;

public class StackClass {
    private int arr[];
    private int capacity;
    private int top;

    public StackClass(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public boolean isFull(){
       return top==capacity-1;     // it means pointer is at last index

    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void push(int value){
        if (isFull()){
           throw new RuntimeException("Stack is full");
        }
        arr[++top]=value;
    }

    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return arr[top--];
    }

    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("Stack underflow, no item to return");
        }
        return arr[top];
    }


    public static void main(String[] args) {
        StackClass stack = new StackClass(100);
        stack.push(10);
        stack.push(99);
        stack.push(30);
        stack.push(1001);
        System.out.println(stack.capacity);
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

      /* Output :
            100
            false
            1001
            30      */


    }


    }
