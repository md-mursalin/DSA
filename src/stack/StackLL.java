package stack;

import java.util.EmptyStackException;

public class StackLL {
    private Listnode top;
    private int length;

    public StackLL() {

        top=null;
        length=0;
    }

    private class Listnode {
        private int value;
        private Listnode next;

        public Listnode(int value) {
            this.value = value;
        }
    }

    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }

    public void push(int value){
        Listnode temp= new Listnode(value);
        temp.next=top;
        top=temp;
        length++;
    }

    public int pop(){
       if(isEmpty()){
           throw new EmptyStackException();
       }
       int result= top.value;
       top=top.next;
       length--;
       return result;

    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.value;
    }


    public static void main(String[] args) {
        StackLL st= new StackLL();
        st.push(55);
        st.push(555);
        st.push(1000);

        System.out.println(st.peek());


    }
}
