package com.minthant.dsa.stack;

public class Stack {

    int arr [];
    int top = -1;
    public Stack(int size) {
        this.arr = new int[size];
    }

    public int size () {
        return  top+1;
    }

    public void push (int value) {
        if(this.arr.length-1 == top){
            throw new IndexOutOfBoundsException("Stack is full can't add!");
        }else {
            this.arr[++top] = value;
        }
    }

    public int peek () {
        return this.arr[top];
    }

    public int pop () {
       if(top == -1 ){
           throw new IndexOutOfBoundsException("stack is empty, can't pop !");
       }else {
           return this.arr[top--];
       }
    }

    public boolean isEmpty () {
        return top == -1;
    }
}
