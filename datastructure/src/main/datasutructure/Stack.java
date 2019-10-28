package main.datasutructure;

public class Stack {
    private int[] stack = new int[10];
    private int pointer = 0;

    public boolean isEmpty() {
        return pointer < 0;
    }

    public int push(int obj){
        stack[pointer] =obj;
        pointer++;
        return obj;
    }

    public int pop() {
        if(isEmpty())
            throw new NullPointerException("the stack is empty");
        int temp = stack[pointer];
        pointer--;
        return temp;
    }


}
