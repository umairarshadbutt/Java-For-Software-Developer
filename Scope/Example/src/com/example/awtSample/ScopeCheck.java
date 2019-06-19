package com.example.awtSample;

public class ScopeCheck {
    public int publicVar=0;
    private int privateVar=1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = "+publicVar+", privateVar = "+privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo(){
        int privateVar = 2;
        for (int i=0; i<10; i++){
            System.out.println(i+" times two is "+ i*privateVar);
        }
    }


    public class InnerClass {
        private int var3 = 3;

        public InnerClass() {
            System.out.println("InnerClass created, varOne is " + privateVar + " and varThree is " + var3);
        }

        public void timesTwo() {
            System.out.println("varOne is still available here " + privateVar);
            for (int i=0; i<10; i++) {
                System.out.println(i + " times two is " + i * var3);
            }
        }

    }
}
