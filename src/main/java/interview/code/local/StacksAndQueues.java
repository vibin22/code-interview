package local.challenge.code;

import java.util.EmptyStackException;

/**
 * Created by vibinramakrishnan on 6/28/17.
 */
public class StacksAndQueues {
    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push("vibin");
        stack.push("nived");

        System.out.println(stack.pop());

    }
}


class MyStack<T> {

    private StackNode<T> top;
    private T data;

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        StackNode<T> t = new StackNode<T>(item);
        t.next = top;
        top = t;
    }

    public boolean isEmpty() {
        return top == null;
    }


    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }


    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

}
