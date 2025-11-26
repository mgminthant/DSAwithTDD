package com.minthant.dsa.stack;

import java.util.ArrayList;
import java.util.Stack;

public class Delimiter {
    ArrayList<Character> startTags = new ArrayList<>();
    ArrayList<Character> endTags = new ArrayList<>();

    public Delimiter(){
        startTags.add('(');
        endTags.add(')');

        startTags.add('{');
        endTags.add('}');

        startTags.add('[');
        endTags.add(']');
    }

    public boolean isValid(String input){
        Stack<Character> stack = new Stack<>();

        for ( int i = 0; i < input.length(); i++){

            char ch = input.charAt(i);

            if(startTags.contains(ch)){
                stack.push(ch);
            }else if (endTags.contains(ch)){

                if(stack.isEmpty()){
                    return false;
                }

               int startTagIndex = startTags.indexOf(stack.pop());
                int endTagIndex = endTags.indexOf(ch);

                if(startTagIndex!=endTagIndex){
                    return false;
                }
            }

        }
            return stack.isEmpty();
    }
}
