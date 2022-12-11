package HW_3;

// Пусть дан произвольный список целых чисел, удалить из него четные числа


import java.util.ArrayList;
import java.util.Random;

public class Task_2 {
    public static void main (String[] args) {
        Random rnd = new Random();
        int n = rnd.nextInt(4, 20);
        ArrayList <Integer> intList = IntList(n);
        System.out.println(intList);
        RemoveList(intList);
        System.out.println(intList);
    }
       public static ArrayList <Integer> IntList (int n) {
        ArrayList <Integer> intList = new ArrayList<>();
        Random rnd = new Random();
        int i = 0;
        while (i < n) {
            intList.add(rnd.nextInt(100));
            i = i + 1;
        }
        return intList;
    }
     public static void RemoveList (ArrayList <Integer> intList) {
        for (int i = 0; i < intList.size(); i++) {
            if(intList.get(i) % 2 == 0) {
                intList.remove(i);
                i--;
            }
        }
     }
}
