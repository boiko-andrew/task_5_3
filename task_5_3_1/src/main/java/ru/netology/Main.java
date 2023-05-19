package ru.netology;

import ru.netology.randoms.Randoms;

public class Main {
    private static final int MIN_VALUE = 20;
    private static final int MAX_VALUE = 80;

    public static void main(String[] args) {
        for (int r : new Randoms(MIN_VALUE, MAX_VALUE)) {
            System.out.println("Current random number is: " + r);
            if (r == MIN_VALUE) {
                System.out.println("Current random number is equal to minimal boundary " +
                        MIN_VALUE + ".\n" + "Let's finish the process.");
                break;
            }
            if (r == MAX_VALUE) {
                System.out.println("Current random number is equal to maximal boundary " +
                        MAX_VALUE + ".\n" + "Let's finish the process.");
                break;
            }
        }
    }
}