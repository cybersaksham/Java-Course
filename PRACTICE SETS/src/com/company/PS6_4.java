/*
WAP to add 2 matrices of size 2 * 3
 */

package com.company;

public class PS6_4 {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},
                {4, 5, 6}};
        int[][] B = {{4, 5, 6},
                {1, 2, 3}};
        int[][] res = {{0, 0, 0},
                {0, 0, 0}};

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                res[i][j] = (A[i][j] + B[i][j]);
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
