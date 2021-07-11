// Since strings are immutable so original string cannot be changed. New string will be formed

package com.company;

public class T8_string_methods {
    public static void main(String[] args) {
        String name = "SaksHam";
        String str1 = "     saksham  bindal   ";

        System.out.println(name.length()); // Returns length of string

        System.out.println(name.toLowerCase()); // Returns new string with lower case letters
        System.out.println(name.toUpperCase()); // Returns new string with upper case letters

        System.out.println(str1.trim()); // Remove all leading & trailing white-spaces

        System.out.println(name.substring(3)); // Return string with index 3 to end
        System.out.println(name.substring(3, 5)); // Return string with index 3 to index 4

        System.out.println(name.replace('a', 'b')); // Replace all 'a' to 'b'
        System.out.println(name.replace("aks", "new")); // Replace all "aks" to "new"
        System.out.println(name.replace("a", "new")); // Replace all 'a' to "new"

        System.out.println(name.startsWith("Sak")); // Return true if starts with "Sak"
        System.out.println(name.endsWith("Sak")); // Return true if ends with "Sak"

        String str2 = "Sakshamsham";
        System.out.println(name.charAt(2)); // Returns character at index 2
        System.out.println(str2.indexOf("sHa")); // Returns index of first occurence of "sHa" if present nowhere then returns -1
        System.out.println(str2.indexOf("sha", 4)); // Returns index of first occurence of "sha" starting from index no 4

        String str3 = "Sakshamsham";
        System.out.println(str3.lastIndexOf("sha")); // Returns index of first occurence of "sHa" from last
        System.out.println(str3.lastIndexOf("sha", 4)); // Returns index of first occurence of "sha" starting from index no 4 reverse to index 0

        System.out.println(name.equals("SaksHam")); // Returns true if name is equal to "SaksHam"
        System.out.println(name.equalsIgnoreCase("SakSham")); // Returns true if name is equal to "SakSham" ignoring cases

        // Escape Sequence Characters
        System.out.println("Escape sequence for \"double quotes\"");
        System.out.println("Escape sequence for \\backslash\\");
        System.out.println("Escape sequence for \nnewline\n");
        System.out.println("Escape sequence for \ttab");
    }
}
