package HW_3;

// Реализовать алгоритм сортировки слиянием (НЕОБЯЗАТЕЛЬНОЕ)


import java.util.Arrays;
import java.util.Random;

public class Task_1 {
    public static void main (String[] args) {
        Random rnd = new Random();
        int n = rnd.nextInt(10, 20);
        int[] intArray = GetArray(n);
        System.out.println("Начальный массив: ");
        PrintArray(intArray);
        System.out.println();
        System.out.println("Отсортированный массив: ");
        int[] sortArray = SortArray(intArray);
        PrintArray(sortArray);

    }
    public static int[] GetArray (int n) {
        Random rnd = new Random();
        int[] intArray = new int [n];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rnd.nextInt(20);
        }
        return intArray;
    }

    public static void PrintArray (int[] intArray) {
        for (int j : intArray) {
            System.out.printf("%d ", j);
        }
    }

    public static int[] SortArray (int[] intArray) {
        int[] buffer1 = Arrays.copyOf(intArray, intArray.length);
        int[] buffer2 = new int[intArray.length];
        return SortInner(buffer1, buffer2, 0, intArray.length);
    }

    public static int[] SortInner(int[] buffer1, int[] buffer2, int start, int end) {
            if (start >= end - 1) {
            return buffer1;
        }
        int middle = start + (end - start) / 2;
        int[] firstSorted = SortInner(buffer1, buffer2, start, middle);
        int[] secondSorted = SortInner(buffer1, buffer2, middle, end);

        int firstIndex = start;
        int secondIndex = middle;
        int destIndex = start;


        int[] result = firstSorted == buffer1 ? buffer2 : buffer1;

        while (firstIndex < middle && secondIndex < end) {
            result[destIndex++] = firstSorted[firstIndex] < secondSorted[secondIndex] ? firstSorted[firstIndex++] : secondSorted[secondIndex++];
                    }
        while (firstIndex < middle) {
            result[destIndex++] = firstSorted[firstIndex++];
        }
        while (secondIndex < end) {
            result[destIndex++] = secondSorted[secondIndex++];
        }
        return result;
    }
}
