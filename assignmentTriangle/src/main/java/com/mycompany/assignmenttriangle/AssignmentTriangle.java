/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignmenttriangle;

/**
 *
 * @author dell
 */
public class AssignmentTriangle {

    public static void main(String[] args) {
         int number = Printkei(9);
        System.out.println(number);

        int check = ClassifyingTriangle(5, 4, 6);
        System.out.println(check);
    }

    static int Printkei(int number) {
        int res = 1;

        if (number % 2 == 0) {
            
        } else {
            res = 0;
        }

        return res;
    }

    // let side be equal to S1 for 1st side, S2 for 2nd slide & S3 for 3rd slide
    static int ClassifyingTriangle(int S1, int S2, int S3) {

        if (S1 <= 0 || S2 <= 0 || S3 <= 0) {
            return 0;
        }

        if (S1 + S2 <= S3 || S1 + S3 <= S2 || S2 + S3 <= S1) {
            return 0;
        }

        // For equilateral
        if (S1 == S2 && S2 == S3) {
            return 1;
        }

        // For isosceles
        if (S1 == S2 || S1 == S3 || S2 == S3) {
            return 2;
        }

        // For scalene
        return 3;
    }
}