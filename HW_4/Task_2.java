package HW_4;
// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() -
// помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди
// и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.


import java.util.LinkedList;
import java.util.Scanner;

public class Task_2 {
    public static void main (String[] args) {
        LinkedList <String> states = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            Enqueue(states);
        }
        System.out.println(states);
        Dequeue(states);
        System.out.println(states);
        First(states);
        System.out.println(states);
    }

    public static void Enqueue (LinkedList <String> states) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название государства: ");
        String str = sc.nextLine();
        states.add(str);
    }

    public static void Dequeue (LinkedList <String> states) {
        String first = states.get(0);
        System.out.println(first);
        states.remove(0);
    }

    public static void First (LinkedList <String> states) {
        String first = states.get(0);
        System.out.println(first);
    }
}