/*
                        (Accessible or Not)
(Modifier)    (Class)   (Package)    (SubClass)    (World)
 Public          Y          Y            Y            Y
 Protected       Y          Y            Y            N
 Private         Y          N            N            N
 Default         Y          Y            N            N
 */

package com.company;

class Modifiers {
    public int a = 4; // Public
    protected int b = 5; // Protected
    private int c = 6; // Private
    int d = 7; // Default
}

public class T39_modifiers_scope {
    public static void main(String[] args) {

    }
}
