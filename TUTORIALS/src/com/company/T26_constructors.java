package com.company;

class Employee_26 {
    private int id;
    private String name;

    // We can overload constructors like other methods in java.
    // Constructors must have same name as of class.
    // Constructor automatically run when objects is created.

    public Employee_26() {
        this.id = 1;
        this.name = "Saksham";
    }

    public Employee_26(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee_26(String name) {
        this.id = 1;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class T26_constructors {
    public static void main(String[] args) {

        // For first constructor
        Employee_26 obj1 = new Employee_26();
        System.out.println("The id is " + obj1.getId());
        System.out.println("The name is " + obj1.getName());

        // For second constructor
        Employee_26 saksham = new Employee_26(101, "Saksham Bindal");
        System.out.println("The id is " + saksham.getId());
        System.out.println("The name is " + saksham.getName());

        // For third constructor
        Employee_26 obj3 = new Employee_26("Harry");
        System.out.println("The id is " + obj3.getId());
        System.out.println("The name is " + obj3.getName());
    }
}
