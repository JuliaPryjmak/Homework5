package com.epam.task1;


public class Task1 {
    public static void main(String[] args) {
        int[] mass = createMassive(5);
        System.out.println("Ваш масив: ");
        printMassive(mass);

        int[] mad = sort(mass);
        System.out.println("\nОбернутий масив: ");
        printMassive(mad);

    }

    public static int[] createMassive(int size) {
        int[] mass = new int[size];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 9);
        }
        return mass;
    }

    static int[] sort(int[] massive) {
        int[] arraySort = new int[massive.length];
        for (int i = massive.length - 1; i >= 0; i--) {
            arraySort[massive.length - 1 - i] = massive[i];


        }

        return arraySort;
    }

    static void printMassive(int[] mass) {
        for (int element : mass) {
            System.out.print(element);
        }
    }
}

