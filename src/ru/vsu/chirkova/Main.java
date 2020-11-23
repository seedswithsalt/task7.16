package ru.vsu.chirkova;

import java.util.Scanner;

public class Main {

    public static int[] solution(int[] arr) {
        int longest = 1;
        int length = 1;
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                length++;
                if (length >= longest) {
                    longest = length;
                    index = i + 1 - length;
                }
            } else {
                length = 1;
            }
        }
        return new int[]{index, longest};
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void printResult(int[] result) {
        if (result[1] == 1) {
            System.out.println(" Возрастания нет");
        } else {
            System.out.println(" Индекс " + result[0] + " " + "Макс Длина " + result[1]);
        }
    }

    public static void test(int[] arr) {
        System.out.print("Исходный массив : ");
        printArray(arr);
        int result[] = solution(arr);
        printResult(result);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        test(arr1);
        int[] arr2 = {0, 0, 0};
        test(arr2);
        int[] arr3 = {1, 2, 0};
        test(arr3);
        int[] arr4 = {0, 2, 3, 2, 5, 7};
        test(arr4);
        int[] arr5 = {1, 7, 4, 5, 6, 1, 3};
        test(arr5);
        int[] arr6 = {0, -10, -5, -3, 5, 7};
        test(arr6);
        int[] arr7 = {1, 2, 3, 1, 2, 3};
        test(arr7);
        int[] arr8 = {1};
        test(arr8);
        int[] arr9 = {};
        test(arr9);
        int[] arr10 = {6, 6, 6, 7, 7, 7, 6, 6, 6, 7, 7, 7};
        test(arr10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        test(arr);
    }
}

