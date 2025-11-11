package com.minthant.dsa.string;
import java.util.Stack;

public class ReverseString {
    Stack<Character> stack = new Stack<>();

    public String reverseString ( String str) {

        for (int i = 0; i < str.length(); i++ ){
            stack.push(str.charAt(i));
        }

        String result = "";

        while ( !stack.isEmpty() ){
            result += stack.pop();
        }

        return result;
    }

}
