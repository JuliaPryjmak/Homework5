package com.epam.task2;

public class Task2 {
    public static void main(String[] args) {
        int[] mass = createMassive(7);
        System.out.println("Ваш масив: ");
        printMassive(mass);

        int amount = amountNumber(mass);
        System.out.println("\nКоличество -> " + amount);


        int sum = sumNumber(mass);
        System.out.println("Сума -> " + sum);

    }


    static int[] createMassive(int size) {
        int[] mass = new int[size];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 9);
        }
        return mass;
    }

    static int amountNumber(int[] mass) {
        int count = 0;

        for (int i = 0; i < mass.length; ++i) {
            if (mass[i] % 2 != 0) {
                count++;

            }
        }

        return count;
    }

    static int sumNumber(int[] mass) {
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 != 0) {
                sum += mass[i];
            }
        }
        return sum;
    }

    static void printMassive(int[] mass) {
        for (int element : mass) {
            System.out.print(element);
        }
    }

}
