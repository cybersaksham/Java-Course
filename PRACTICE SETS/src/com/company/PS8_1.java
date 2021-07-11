/*
Create a class Employee with following properties
1. salary - int
2. getSalary() - returning salary
3. name - String
4. getName() - returning name
5. setName() - setting name
 */

package com.company;

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String str) {
        name = str;
    }
}

public class PS8_1 {
    public static void main(String[] args) {
        Employee saksham = new Employee();
        saksham.salary = 10000;
        saksham.setName("Saksham Bindal");
        System.out.println(saksham.getSalary());
        System.out.println(saksham.getName());
    }
}
