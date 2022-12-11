package HW_3;
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и
// среднее из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task_3 {
    public static void main (String[] args) {
        Random rnd = new Random();
        int n = rnd.nextInt(5, 10);
        ArrayList <Integer> intList = IntList(n);
        System.out.println(intList);
        int[] numbers = Numbers(intList);
        float m = 0;
        for (Integer integer : intList) {
            m += integer;
        }
        m = m / intList.size();
        System.out.printf("max: %d, min: %d, middle: %d, arithmetical mean: %.2f", numbers[0], numbers[1], numbers[2], m);

    }
     public static ArrayList <Integer> IntList (int n) {
        ArrayList <Integer> intList = new ArrayList<>();
        Random rnd = new Random();
        int i = 0;
        while (i < n) {
            intList.add(rnd.nextInt(-20, 20));
            i = i + 1;
        }
        return intList;
    }
       public static int[] Numbers (ArrayList <Integer> intList) {
        int[] numbers = new int [4];
        Collections.sort(intList);
        numbers[1] = intList.get(0);
        numbers[0] = intList.get(intList.size()-1);
        int middle = (numbers[0] + numbers[1]) / 2;
        int[] count = new int [intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > middle) {
                while (intList.get(i) != middle) {
                    middle++;
                    count[i]++;
                }
            }
            else {
                while (intList.get(i) != middle) {
                    middle--;
                    count[i]++;
                }
            }
            middle = (numbers[0] + numbers[1]) / 2;
        }
        int indexMin = 0;
        for (int i = 1; i < count.length; i++) {

            if (count[i] < count[indexMin]) {
                indexMin = i;
            }
        }
        numbers[2] = intList.get(indexMin);
        return numbers;
    }
}