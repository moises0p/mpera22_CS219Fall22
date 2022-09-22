package HW4;

import Utility.Investment_calculator;

import java.util.Scanner;

public class investment {


    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        double c = 0;
        double r = 0;
        int t = 0;
        int n = 0;


        boolean valid1 = false;
        boolean valid2 = false;
        boolean valid3 = false;
        boolean valid4 = false;


        while (!valid1) {
            System.out.print("Enter initial deposit: ");

            if (kbd.hasNextDouble()) {
                c = kbd.nextDouble();
                if (c <= 0) {
                    System.out.println("Error: initial deposit cannot be less than zero. You entered " + c);
                } else {
                    valid1 = true;
                }

            } else {
                System.out.printf("Error:please enter a decimal number. You entered \"%s\"", kbd.next());
                System.out.println("");
            }
        }


        while (!valid2) {
            System.out.print("Enter interest rate: ");

            if (kbd.hasNextDouble()) {
                r = kbd.nextDouble();
                if (r >= 1 || r <= 0) {
                    System.out.println("Error: interest rate should be expressed as a decimal between 0 and 1. For example 8% should be entered as .08. You entered " + r);
                } else {
                    valid2 = true;
                }

            } else {
                System.out.printf("Error:please enter a decimal number. You entered \"%s\"", kbd.next());
                System.out.println("");

            }
        }


        while (!valid3) {
            System.out.print("Enter number of years: ");

            if (kbd.hasNextInt()) {
                t = kbd.nextInt();
                if (t <= 0) {
                    System.out.println("Error: please enter an integer larger than 0. You entered " + t);
                } else {
                    valid3 = true;
                }

            } else {
                System.out.printf("Error:please enter an integer. You entered \"%s\"", kbd.next());
                System.out.println("");

            }
        }


        while (!valid4) {
            System.out.print("Enter number of times to compounder per year: ");

            if (kbd.hasNextInt()) {
                n = kbd.nextInt();
                if (n <= 0) {
                    System.out.println("Error: please enter an integer larger than 0. You entered " + n);
                } else {
                    valid4 = true;
                }

            } else {
                System.out.printf("Error:please enter an integer. You entered \"%s\"", kbd.next());
                System.out.println("");

            }
        }
        //prompt the user fo c,r,t,n
        //and call the function with the inputted values


        System.out.printf("Your investment is worth %.2f", Investment_calculator.investment(c, r, t, n));


    }


}


