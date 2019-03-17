package com.epam.task3;



public class Task3 {
    public static void main(String[] args) {
        int[] mass = createMassive(3);
        System.out.println("масив 1: ");
        printMassive(mass);

        int[] mass2 = createMassive(3);
        System.out.println("\n масив 2: ");
        printMassive(mass2);

        int[] massive = createNewMassive(mass, mass2);
        System.out.println("\n Новий масив -> ");
        printMassive(massive);
    }

    static int[] createMassive(int size) {
        int[] mass = new int[size];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 9);
        }
        return mass;
    }

    static int[] createNewMassive(int[] mass, int[] mass2) {
        int[] massive = new int[mass.length];
        for (int i = 0; i < mass.length; i++) {
            massive[i] = mass[i] + mass2[i];
        }
        return massive;
    }

    static void printMassive(int[] mass) {
        for (int element : mass) {
            System.out.print(element);
        }
    }
}
