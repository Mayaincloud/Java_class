package Lesson_4;

// import java.util.LinkedList;
// import java.util.Queue;

// public class program {
//     public static void main (String[] args) {
//         LinkedList <Integer> ll = new LinkedList <Integer> ();
//         ll.add(1);
//         ll.add(2);
//         ll.add(3);
//         Queue <Integer> queue = new LinkedList <Integer> ();
//         queue.add(1);
//         queue.add(2);
//         int item = queue.remove(); // добавление и удаление строго по очереди
//     }
// }

// import java.util.PriorityQueue;

// public class program {
//     public static void main (String[] args) {
//         PriorityQueue <Integer> pq = new PriorityQueue <Integer> ();
//         pq.add(123);
//         pq.add(3);
//         pq.add(13);
//         pq.add(1);
//         System.out.println(pq);
//         System.out.println(pq.poll()); // 1
//         System.out.println(pq.poll()); // 3
//         System.out.println(pq.poll()); // 13
//         System.out.println(pq.poll()); // 123
//         System.out.println(pq.poll()); // null удаление по возрастанию
//     }
// }

// import java.util.*;

// public class program {
//     public static void main(String[] args) {
//         Deque <Integer> deque = new ArrayDeque<>();
//         deque.addFirst(1);
//         deque.addLast(2);
//         // deque.removeLast();
//         // deque.removeLast();
//         deque.offerFirst(1);
//         deque.offerLast(2);
//         deque.pollFirst();
//         deque.pollLast();
//         deque.getFirst();
//         deque.getLast();
//         deque.peekFirst();
//         deque.peekLast();
//     }
// }

import java.util.Stack;

public class program {
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main (String[] args) {
        // (1+2*3*4)*(10/5) - 20
        // 1 2 3 * 4 * + 10 5 / * 20 -
        
        //var exp = "20 30 - 10 *".split(" "); // (20-30)*10
        var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3
        
        //var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;
        System.out.println(exp);

        Stack <Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                    res = st.pop() / st.pop();
                    st.push(res);
                    break;
                default:
                    break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}