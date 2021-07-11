package com.company;

class Employee {
    int id, salary;
    String name;

    public void printDet() {
        System.out.println("My id is " + id);
        System.out.println("My salary is " + salary);
        System.out.println("My name is " + name);
    }
}

public class T24_custom_class {
    public static void main(String[] args) {

        // Making an object
        Employee saksham = new Employee();
        Employee harry = new Employee();

        // Setting Attributes
        saksham.id = 101;
        saksham.salary = 10000;
        saksham.name = "Saksham Bindal";

        harry.id = 102;
        harry.salary = 15000;
        harry.name = "Harry";

        /*
         Printing Attributes
         System.out.println(saksham.id);
         System.out.println(saksham.name);
        */
        saksham.printDet();
        harry.printDet();
    }
}
