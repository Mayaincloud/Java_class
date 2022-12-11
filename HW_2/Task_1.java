// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
package HW_2;

import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
public class Task_1 {
    public static void main (String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Введите количеcтво элементов массива: ");
    String n_ex = iScanner.nextLine();
    int n = 0;
        while (n == 0) {
        try {
            n = Integer.parseInt(n_ex);
        } catch (Exception ex) {
            System.out.println("Ошибка ввода. Введите количеcтво элементов массива: ");
            n_ex = iScanner.nextLine();
        }
    }

    int[] my_array = getArray(n);
    printArray(my_array);
    System.out.println();
    int[] new_array = sortArray(my_array);
    printArray(new_array);
}
      public static int[] getArray (int n) {
        int[] my_array = new int[n];
        Random r = new Random();
        for (int i = 0; i < my_array.length; i++) {
            my_array[i] = r.nextInt(1, 99);
        }
        return my_array;
    }
     public static void printArray (int[] my_array) {
         for (int j : my_array) {
             System.out.printf("%d ", j);
         }
    }
       public static int[] sortArray (int[] new_array) {
        for (int i = 0; i < new_array.length; i++) {
            for (int j = 0; j < new_array.length - 1; j++) {
                if (new_array[j] > new_array[j + 1])
                {
                    int temp = new_array[j];
                    new_array[j] = new_array[j + 1];
                    new_array[j + 1] = temp;
                }
                logger(new_array);
            }
        }
        return new_array;
    }
    public static void logger (int[] my_array) {
        StringBuilder arr = new StringBuilder();
        for (int j : my_array) {
            arr.append(j);
            arr.append(" ");
        }
        try (FileWriter log = new FileWriter("HW_2/log_1.txt", true)) {
            log.write(LocalDateTime.now() + " " + arr + "\n");
            log.flush();
        } catch (Exception ex) {
            System.out.println("ex");
        }

    }
}
