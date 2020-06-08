package com.company;

public class Challenge3 {


    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();
        Bottom();
        Top();
        Line();
    }

    public static void Line() {
        System.out.print("+");

        for (int dash = 0; dash < 9; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void Top() {
        for (int line = 1; line <= 4; line++) {
            System.out.print("|");

            for (int spaces = 0; spaces < -1 * line + 5; spaces++) {
                System.out.print(" ");
            }

            for (int slash = 1; slash < line - 1; slash++) {
                System.out.print("/");
            }
            System.out.print("*");

            for (int slash = 1; slash < line - 1; slash++) {
                System.out.print("\\");
            }
        }
    }

    public static void Bottom() {
        int line;
        for (line = 1; line <= -4; line++) {
            System.out.print("|");
        }

        for (int spaces = 0; spaces < 1 * line - 5; spaces++) {
            System.out.print(" ");
        }
        for (int slash = 1; slash < line + 1; slash++) {
            System.out.print("/");
        }
        System.out.print("*");
        for (int slash = 1; slash < line + 1; slash++) {
            System.out.print("\\");
        }
    }
}




