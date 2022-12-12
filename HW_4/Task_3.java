package HW_4;
// Написать программу, определяющую правильность расстановки скобок в выражении.

// a+(d*3) - истина
// [a+(1*3) - ложь
// [6+(3*3)] - истина
// {a}[+]{(d*3)} - истина
// <{a}+{(d*3)}> - истина
// {a+]}{(d*3)} - ложь


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String str = sc.nextLine();
        String[] s = str.split(sc.nextLine());
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(s));
        RemoveBrackets(arrayList, "(", ")");
        RemoveBrackets(arrayList, "[", "]");
        RemoveBrackets(arrayList, "{", "}");
        RemoveBrackets(arrayList, "<", ">");
        System.out.println(Checking(arrayList));

    }

        public static void RemoveBrackets (ArrayList <String> arrayList, String fBracket, String sBracket) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).equals(fBracket)) {
                    for (int j = 0; j < arrayList.size(); j++) {
                        if (arrayList.get(j).equals(sBracket)) {
                            arrayList.remove(j);
                            arrayList.remove(i);
                            break; // скидываем цикл, если произошло удаление, чтобы не удалить лишние скобки
                        }
                    }
                }
            }
        }

    public static boolean Checking (ArrayList <String> arrayList) {
        boolean result = true;
        for (String s : arrayList) {
            if (s.equals("(") || s.equals(")") || s.equals("[") || s.equals("]") || s.equals("{") || s.equals("}") || s.equals("<") || s.equals(">")) {
                result = false;
                break;
            }
        }
        return result;
    }
}
