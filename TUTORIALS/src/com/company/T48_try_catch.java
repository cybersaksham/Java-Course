package com.company;

import java.util.Scanner;

public class T48_try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an number : ");
        int a = sc.nextInt();

        try {
            int b = 100 / a;
            System.out.println("The res is " + b);
        } catch (Exception e) {
            /*
             If user input 0 then program stops after throwing error
             But if we put try & catch block then it catches error & program does not stops.
             First it go to try block, if successfully executes then move ahead in code.
             If try block give some error then it comes in catch block
            */
            System.out.println("We failed to divide because of error");
            System.out.println(e);
        }

        System.out.println("End of Program!!!");
    }
}
