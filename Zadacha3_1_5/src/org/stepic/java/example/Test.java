package org.stepic.java.example;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] tracer;
        tracer = new Throwable().getStackTrace();
        if (tracer.length>2 ) {return tracer[2].getClassName()+"#"+tracer[2].getMethodName();}
        else return null;
    }
}
