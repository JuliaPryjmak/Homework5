package com.epam.task4;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int[] mass = createMassive(5);
        System.out.println("Your mass : ");
        printMassive(mass);
        int[] noPaired = getNotPaired(mass);
        System.out.println("\nNot paired elements of the array ->"
                + Arrays.toString(noPaired));
        int[] paired = getPaired(mass);
        System.out.println("Paired elements of the array ->"
                +Arrays.toString(paired));
    }
    private static int[] createMassive(int size) {
        int[] mass = new int[size];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 9);
        }
        return mass;
    }
    private static void printMassive(int[] mass) {
        for (int element : mass) {
            System.out.print(element);
        }
    }
    private static int[] getNotPaired(int[] test) {
        return getMass(test, 1);

    }
    private static int[] getPaired(int[] test) {
        return getMass(test, 0);

    }
    private static int[] getMass(int[] test, int num) {
        int length = 0;
        for (int i : test) {
            if (i != 0 && i % 2 == num)
                length++;
        }
        int[] intResult = new int[length];
        for (int i = 0, j = 0; i < test.length; i++) {
            if (test[i] != 0 && test[i] % 2 == num) {
                intResult[j] = test[i];
                j++;
            }
        }
        return intResult;
    }
}