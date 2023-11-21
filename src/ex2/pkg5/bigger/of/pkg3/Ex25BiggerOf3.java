/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.pkg5.bigger.of.pkg3;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ex25BiggerOf3 {

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        // TODO code application logic here
        int big;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number: ");
        int variable_1 = scanner.nextInt();

        System.out.println("Write a second number: ");
        int variable_2 = scanner.nextInt();
        

        System.out.println("Write the thrid number: ");
        int variable_3 = scanner.nextInt();

        
        if (variable_1 > variable_2 && variable_1 > variable_3) {
            big = variable_1;

            System.out.println("The biggest number is: " + big);
        }

        if (variable_2 > variable_1 && variable_2 > variable_3) {
            big = variable_2;
            if (variable_1 > variable_3) {

            }
            System.out.println("The biggest number is: " + big);

        }

        if (variable_3 > variable_2 && variable_3 > variable_2) {
            big = variable_3;
            if (variable_2 > variable_1) {

            }

            System.out.println("The biggest number is: " + big);

        }
    }
}

/*

The changes made to the code so it can work are the following ones:

I changed some "==" to ">", to be exact, i changed those lines: Line 37, Line 43 and Line 52.

After changing those symbols, i changed in Line 52 from "variable_3 > variable_2 && variable_1 ==  variable_2" to "variable_3 > variable_2 && variable_3 > variable_2".

Finally, i moved the Line 56 "System.out.println("The biggest number is: " + big);" to the Line 58, so its outside the "if".

 */