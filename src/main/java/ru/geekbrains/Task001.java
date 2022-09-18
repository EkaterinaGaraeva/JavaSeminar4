package ru.geekbrains;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task001 {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        long s = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
//            listInt.add(i);
            listInt.add(listInt.size() / 2, i);
        }
        System.out.println("ArrayList");
        System.out.println(System.currentTimeMillis() - s);

        LinkedList<Integer> linkInt = new LinkedList<>();
        long ss = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
//            linkInt.add(i);
            linkInt.add(linkInt.size() / 2, i);
        }
        System.out.println("LinkedList");
        System.out.println(System.currentTimeMillis() - ss);
    }
}
