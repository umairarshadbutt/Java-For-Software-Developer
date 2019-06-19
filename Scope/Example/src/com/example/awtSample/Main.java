package com.example.awtSample;

public class Main {

    public static void main(String[] args) {
        String var4 = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
        System.out.println(var4);

       // scopeInstance.timesTwo();
        System.out.println("***********************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
