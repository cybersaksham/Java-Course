package com.company;

import java.util.ArrayList;

class myGeneric<T1, T2> {
    private T1 a;
    private T2 b;

    public myGeneric(T1 a, T2 b) {
        this.a = a;
        this.b = b;
    }

    public T1 getA() {
        return a;
    }

    public void setA(T1 a) {
        this.a = a;
    }

    public T2 getB() {
        return b;
    }

    public void setB(T2 b) {
        this.b = b;
    }
}

public class T68_generics {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("str1");
        arrayList.add(5);
        arrayList.add(true);

        // int a = arrayList.get(1); -- will give error because it is object type
        int a = (int) arrayList.get(1);
        System.out.println(a);

        // Generic
        myGeneric<Integer, String> b = new myGeneric<>(4, "hello");
        System.out.println(b.getA());
        System.out.println(b.getB());
    }
}
