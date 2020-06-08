package com.company;

public class Challenge2_2 {
    public static final int SIZE=6;
    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();
    }

    public static void Line() {
        System.out.print("#");

        for (int dash = 0; dash < 4*SIZE; dash++) {
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void Top() {
        for (int line = 1; line < SIZE+1; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= -2 * line +2*SIZE; spaces++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dots = 1; dots <= 4 * line - SIZE + 2; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spaces = 1; spaces <= 2 * line + 2*SIZE; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void Bottom() {
        for (int line = 1; line < SIZE+1; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= 2 * line -SIZE/2; spaces++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dots = -1; dots <= -4 * line + 4*SIZE+1; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spaces = -1; spaces <= 2 * line + SIZE*-2; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");

        }
    }
}




