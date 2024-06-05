package com.example.sumativa;

public class HelloApplication {

    public static void main(String[] args) {

        int number = 4;

        if (number > 0) {

            for (int index = 1; index <= number; index++) {
                for (int second = 1; second < index; second++) {
                    System.out.print(" ");
                }
                System.out.println("|_");
            }
        } else if (number < 0) {

            number = -number;
            for (int index = number; index >= 1; index--) {
                for (int second = 1; second < index; second++) {
                    System.out.print(" ");
                }
                System.out.println("_|");
            }
        } else {

            System.out.println("__");
        }
    }
}
