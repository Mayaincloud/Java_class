package HW_6;
// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Set <Laptop> note = new HashSet<>();
        Random rnd = new Random();

        Laptop note1 = new Laptop();
        note1.setColor(color(rnd.nextInt(0, 3)));
        note1.setCapacity(capacity(rnd.nextInt(0, 5)));
        note1.setOs(os(rnd.nextInt(0, 3)));
        note1.setRam(ram(rnd.nextInt(0, 5)));
        note.add(note1);

        Laptop note2 = new Laptop();
        note2.setColor(color(rnd.nextInt(0, 3)));
        note2.setCapacity(capacity(rnd.nextInt(0, 5)));
        note2.setOs(os(rnd.nextInt(0, 3)));
        note2.setRam(ram(rnd.nextInt(0, 5)));
        note.add(note2);

        Laptop note3 = new Laptop();
        note3.setColor(color(rnd.nextInt(0, 3)));
        note3.setCapacity(capacity(rnd.nextInt(0, 5)));
        note3.setOs(os(rnd.nextInt(0, 3)));
        note3.setRam(ram(rnd.nextInt(0, 5)));
        note.add(note3);

        Laptop note4 = new Laptop();
        note4.setColor(color(rnd.nextInt(0, 3)));
        note4.setCapacity(capacity(rnd.nextInt(0, 5)));
        note4.setOs(os(rnd.nextInt(0, 3)));
        note4.setRam(ram(rnd.nextInt(0, 5)));
        note.add(note4);

        Laptop note5 = new Laptop();
        note5.setColor(color(rnd.nextInt(0, 3)));
        note5.setCapacity(capacity(rnd.nextInt(0, 5)));
        note5.setOs(os(rnd.nextInt(0, 3)));
        note5.setRam(ram(rnd.nextInt(0, 5)));
        note.add(note5);

        Laptop note6 = new Laptop();
        note6.setColor(color(rnd.nextInt(0, 3)));
        note6.setCapacity(capacity(rnd.nextInt(0, 5)));
        note6.setOs(os(rnd.nextInt(0, 3)));
        note6.setRam(ram(rnd.nextInt(0, 5)));
        note.add(note6);

        Laptop note7 = new Laptop();
        note7.setColor(color(rnd.nextInt(0, 3)));
        note7.setCapacity(capacity(rnd.nextInt(0, 5)));
        note7.setOs(os(rnd.nextInt(0, 3)));
        note7.setRam(ram(rnd.nextInt(0, 5)));
        note.add(note7);

        Laptop note8 = new Laptop();
        note8.setColor(color(rnd.nextInt(0, 3)));
        note8.setCapacity(capacity(rnd.nextInt(0, 5)));
        note8.setOs(os(rnd.nextInt(0, 3)));
        note8.setRam(ram(rnd.nextInt(0, 5)));
        note.add(note8);

        Laptop note9 = new Laptop();
        note9.setColor(color(rnd.nextInt(0, 3)));
        note9.setCapacity(capacity(rnd.nextInt(0, 5)));
        note9.setOs(os(rnd.nextInt(0, 3)));
        note9.setRam(ram(rnd.nextInt(0, 5)));
        note.add(note9);

        Laptop note10 = new Laptop();
        note10.setColor(color(rnd.nextInt(0, 3)));
        note10.setCapacity(capacity(rnd.nextInt(0, 5)));
        note10.setOs(os(rnd.nextInt(0, 3)));
        note10.setRam(ram(rnd.nextInt(0, 5)));
        note.add(note10);

        for (Laptop item : note) {
            System.out.println(item);
        }
        filter(note);
    }

    public static String color (int x) {
        String[] color = new String[] {"Черный", "Серый", "Белый"};
        return color[x];
    }
    public static int ram (int x) {
        int[] ram = new int[] {2, 4, 8, 16, 32};
        return ram[x];
    }
    public static int capacity(int x) {
        int[] memory = new int[] {128, 256, 512, 1024, 2048};
        return memory[x];
    }

    public static String os (int x) {
        String[] os = new String[] {"Linux", "Windows", "MacOs"};
        return os[x];
    }

    public static void filter (Set <Laptop> note) {
        System.out.println("""
                Выбирете критерии фильтрации:
                1 - ОЗУ
                2 - объем ЖД
                3 - Операционная система
                4 - Цвет""");
        Scanner iScanner = new Scanner(System.in);
        String parametr = iScanner.nextLine();
        String[] filter1 = parametr.split(" ");
        ArrayList <String> morePar = new ArrayList<>();
        for (int i = 0; i < filter1.length; i++) {
            if (Integer.parseInt(filter1[i]) == 1) {
                System.out.println("Введите минимальное значение оперативной памяти в Гб: ");
                String ram = iScanner.nextLine();
                morePar.add(ram);
            }
            if (Integer.parseInt(filter1[i]) == 2) {
                System.out.println("Введите минимальное значение объема ЖД в Гб: ");
                String m = iScanner.nextLine();
                morePar.add(m);
            }

            if (Integer.parseInt(filter1[i]) == 3) {
                System.out.println("""
                        Выберите операционную систему:
                        1 - MacOs
                        2 - Linux
                        3 - Windows""");
                String os = iScanner.nextLine();
                morePar.add(os);
            }

            if (Integer.parseInt(filter1[i]) == 4) {
                System.out.println("""
                        Выберите цвет:
                        1 - Черный
                        2 - Серый
                        3 - Белый""");
                String color = iScanner.nextLine();
                morePar.add(color);
            }

        }
        TreeMap <Integer, Integer> par = new TreeMap<>();
        for (int i = 0; i < filter1.length; i++) {
            par.put(Integer.parseInt(filter1[i]), Integer.parseInt(morePar.get(i)));
        }
        System.out.println(par);

        int opSys = 0;
        if (par.get(3) != null) {
            opSys = par.get(3);
        }


        int r = 0;
        if (par.get(1) != null) {
            r = par.get(1);
        }

        int mem = 0;
        if (par.get(2) != null) {
            mem = par.get(2);
        }

        int c = 0;
        if (par.get(4) != null) {
            c = par.get(4);
        }

        Set <Laptop> newNote = new HashSet<>();
        for (Laptop item : note) {
            if (item.getRam() >= r && item.getCapacity() >= mem
                    && item.getColor() == c && (item.getOs() == opSys || opSys == 0)) {
                newNote.add(item);
            }
        }
        for (Laptop item : newNote) {
            System.out.println(item);
        }
    }
}