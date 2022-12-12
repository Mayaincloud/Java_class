package Seminar_4;
// <aside>
// ?? ����������� ���������� ����������, �������:

// 1. ��������� �� ������������ � ����������� ������.
// 2. ���� ������� print, ������� ������ ���, ����� ��������� ��������� ���� ������ � ������, � ������ - ���������.
// 3. ���� ������� revert, ������� ���������� ��������� ������ �� ������.
// </aside>




// import java.util.*;

// public class Task2 {
//     public static void main (String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.println("������� ������: ");
//         String str = iScanner.nextLine();
//         Deque <String> deque = new ArrayDeque<>();

//         while (!str.equals("print") || !str.equals("revert")) {
//             if (str.equals("print")) {
//                 System.out.println(deque);
//             } else if (str.equals("revert")) {
//                 deque.removeFirst();
//             } else if (str.equals("breake")) {
//                 break;
//             } else {
//                 deque.addFirst(str);
//             }
//             str = iScanner.nextLine();
//         }   
//         System.out.println(deque);     
//     }
// }

import java.util.*;

public class Task_3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque <String> array = new ArrayDeque<>();
        while (true) {
            System.out.println("������� ������\n");
            String lineL = sc.nextLine();
            if (lineL.equals("")) {
                break;
            } else if (lineL.equals("print")) {
                while (!array.isEmpty()) {
                    System.out.print(array.removeLast() + " ");
                }
            } else if (lineL.equals("revert")) {
                array.removeLast();
            } else {
                array.add(lineL);
            }
        }
        System.out.print(array);
    }
}
