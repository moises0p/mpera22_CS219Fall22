package HW2;

import java.util.Scanner;

public class DayOfWeek {

    public static int dayofweek (int m, int d, int y){
        int y0 =  y - (14 - m)/12;

        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        int m0 = m + 12 *((14 - m) / 12) - 2;

        return (d + x + 31*m0 / 12) % 7;

    }


        public static void main(String[]args) {
Scanner kbd= new Scanner(System.in);
System.out.println("enter month");
int m=kbd.nextInt();
            System.out.println("enter day");
            int d=kbd.nextInt();
            System.out.println("enter year");
            int y=kbd.nextInt();
            System.out.print(dayofweek(m, d, y));

        }
        }