package Seminar_3;
// ??????? ????????????? ???????? ?? ?????????? ?????? 


import java.util.ArrayList;
//import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task_3 {
    public static void main (String[] args) {
        String[] planets = new String[] {"????????", "??????", "?????", "????", "??????", "??????", "????", "??????"};
        Random rnd = new Random();
        ArrayList <String> str = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            str.add(planets[rnd.nextInt(8)]);
        }
        // System.out.println(str);
        Set <String> mySet = new HashSet<String>(str);
        // for (String string : mySet) {
        //     System.out.println(string + " " + Collections.frequency(str, string));
        // } 

        // Collections.sort(str);
        // System.out.println(str);
        // for (int i = 0; i < str.size() - 1; i++) {
        //     if(str.get(i) == str.get(i + 1))
        //     {
        //         str.remove(str.get(i));
        //         i--;
        //     }
        // }
        // System.out.println(str);
        System.out.println(mySet);
    }
}
