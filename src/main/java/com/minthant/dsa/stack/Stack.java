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
        this.arr[++top] = value;
    }

    public int peek () {
        return this.arr[top];
    }

    public int pop () {
        return top == -1 ? 0 : this.arr[top--];
    }

    public boolean isEmpty () {
        return top == -1;
    }
}
