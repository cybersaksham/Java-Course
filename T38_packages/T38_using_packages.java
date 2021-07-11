
// Importing a class from manual package

import saksham.notes.T38_to_be_used;

public class T38_using_packages {
    public static void main(String[] args) {
        int a = 4, b = 5;
        int sum = new T38_to_be_used().add(a, b); // This is how to call function of a custom class stored in a package
        System.out.println(sum);
    }
}
