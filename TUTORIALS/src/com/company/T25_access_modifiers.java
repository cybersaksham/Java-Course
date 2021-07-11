package com.company;

class Employee_25 {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id; // this is a pointer which points to this class
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class T25_access_modifiers {
    public static void main(String[] args) {
        Employee_25 saksham = new Employee_25();
        saksham.setId(101);
        saksham.setName("Saksham Bindal");
        System.out.println("The id is " + saksham.getId());
        System.out.println("The name is " + saksham.getName());
    }
}
