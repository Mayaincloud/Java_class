package Seminar_4;
// 1. ����� ����������� ������ �� ~, ��������� text � ������� ������ �� ������� num.
// 2. ���� ������� print~num, ������� ������ �� ������� num � ������� ������ � 
// ������� � �� ������.
// </aside>



import java.util.Scanner;
import java.util.LinkedList;

public class Task_2 {
    public static void main (String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("������� ������: ");
        String str = iScanner.nextLine();

        String[] strings = strings(str);
        

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        LinkedList<String> ll = new LinkedList<>();
        
        int ind = Integer.parseInt(strings[1]);
        for (int i = 0; i < ind + 1; i++) {
            ll.add("������ " + i);
        }

        if (strings[0].equals("print")) {
            System.out.println(ll.remove(ind));
        } else {
            ll.add(ind, strings[0]);
        }

        System.out.println(ll);
    }
    public static String[] strings (String str) {
        String[] strings = str.split("~");
        return strings;
        
    }
    
}
