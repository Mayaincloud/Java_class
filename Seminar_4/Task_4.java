package Seminar_4;


import java.util.*;

public class Task_4 {
   public static void main (String[] args) {
      String[] base = {"one", "two", "tree", "four", "five"};
      Queue<String> queueArray = new LinkedList<>(Arrays.asList(base));
      Deque<String> dequeArray = new LinkedList<>(Arrays.asList(base));
      System.out.println("�������: ");
      while (!queueArray.isEmpty()) {
         System.out.print(queueArray.poll() + " ");
      }
      System.out.println("\n����: ");
      while (!dequeArray.isEmpty()) {
         System.out.print(dequeArray.pollLast() + " ");
      }
   } 
}