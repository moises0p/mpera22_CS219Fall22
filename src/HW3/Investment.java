package HW3;

import Utility.Investment_calculator;

import java.util.Scanner;

public class Investment {

    public static void main(String[]args){
        Scanner kbd = new Scanner(System.in);
double c;
double r;
int t;
int n;

        System.out.println("Enter initial deposit:");

        if (kbd.hasNextDouble()) {
             c = kbd.nextDouble();
            if (c<=0) {
                System.out.println("Error: initial deposit should be greater than zero. You entered "+c);
                return;
            }
        }
         else {
            System.out.printf("Error: decimal number expected. You entered \"%s\"", kbd.next());
            return;
        }
        System.out.println("Enter interest rate:");

        if (kbd.hasNextDouble()) {
          r = kbd.nextDouble();
          if ( r>=1|| r<=0) {
                System.out.println("Error: interest rate should be expressed as a decimal between 0 and 1. For example 8% should be entered as .08. You entered "+r);
                return;
            }
        }
          else {
            System.out.printf("Error: decimal number expected. You entered \"%s\"", kbd.next());
            return;
        }
        System.out.println("Enter number of years:");

        if (kbd.hasNextInt()) {
            t = kbd.nextInt();
            if( t<=0) {
                System.out.println("Error:please enter an integer larger than 0. You entered "+t);
                return;
            }
        }
         else{
            System.out.printf("Error: integer number expected. You entered \"%s\"", kbd.next());
            return;
        }
        System.out.println("Enter number of times to compound per year:");

        if (kbd.hasNextInt()) {
            n= kbd.nextInt();
            if( n<=0) {
                System.out.println("Error:please enter an integer larger than 0. You entered "+n);
                return;
            }
        }

        else  {
            System.out.printf("Error:please enter an integer number. You entered \"%s\"", kbd.next());
            return;
        }
        //prompt the user fo c,r,t,n
        //and call the function with the inputted values


        System.out.printf("Your investment is worth %.2f", Investment_calculator.investment(c,r,t,n));
        

    }





}
