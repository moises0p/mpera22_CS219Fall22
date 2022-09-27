package Exam1;

import java.util.Scanner;

public class Exam1 {


    public static int counter (int x){
        int tracker=0;
        int checker=x%10;
        while (x>0){
           if( checker>2 && checker<7){
               tracker++;
           }
           x=x/10;
           checker=x%10;
        }


        return tracker;
    }




    public static void main (String[]args){

        Scanner kbd = new Scanner(System.in);
        int n=0;
        boolean valid=false;


        while (!valid) {
            System.out.print("Enter positive integer: ");

            if (kbd.hasNextInt()) {
                n = kbd.nextInt();
                if (n <= 0) {
                    System.out.println("Error: integer cannot be less than zero. You entered " + n);
                } else {
                    valid = true;
                }

            } else {
                System.out.printf("Error:please enter an integer. You entered \"%s\"", kbd.next());
                System.out.println("");
            }
        }

System.out.println(counter(n));

    }




}
