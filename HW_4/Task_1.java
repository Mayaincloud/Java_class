package HW_4;
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
// “перевернутый” список.



import java.util.*;

public class Task_1 {
    public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<>();
        states.add("Germany");
        states.add("France");
        states.addLast("Great Britain");
        states.addFirst("Spain");
        states.add(1, "Italy");
        System.out.println("list: ");
        System.out.println(states);
        System.out.println("reverse: ");
        states = ReversList(states);
        System.out.println(states);
    }

    public static LinkedList <String> ReversList (LinkedList <String> states) {
        LinkedList <String> reversLinkedList = new LinkedList<>();
        for (int i = 0; i < states.size(); i++) {
            reversLinkedList.add(states.get(states.size()- 1 - i));
        }
        return reversLinkedList;
  }
}
