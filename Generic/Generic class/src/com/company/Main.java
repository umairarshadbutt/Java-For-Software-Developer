package com.company;

import java.util.EmptyStackException;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Double[] doubleElements={1.1,2.2,3.3,4.4,5.5,6.6};
        Integer[] integerElements= {1,2,3,4,5,6,7,8,9,10};

        Stack <Double> doubleStack_= new Stack<Double>();
        Stack <Integer> integerStack= new Stack<Integer>();


        testPush("DoubleStack", doubleStack_, doubleElements);
        testPop("DoubleStack",doubleStack_);


        testPush("IntegerStack", integerStack, integerElements);
        testPop("IntegerStack",integerStack);

    }

    public static <T> void testPush(String name, Stack<T> stack, T[] elements){
        System.out.printf( "\nPushing elements onto %s\n", name );
        for (T element: elements){
            System.out.printf("%s ", element);
            stack.push(element);
        }
    }

    public static <T> void testPop(String name, Stack<T> stack){
        // pop elements from stack
        try
        {
            System.out.printf( "\nPopping elements from %s\n", name );
            T popValue; // store element removed from stack
// remove all elements from Stack
            while ( true )
            {
                popValue = stack.pop();
                System.out.printf( "%s ", popValue );
            } // end while
        } // end try
        catch( EmptyStackException emptyStackException )
        {
            System.out.println();
            emptyStackException.printStackTrace();
        } // end catch EmptyStackException
    } // end method testPop

}
