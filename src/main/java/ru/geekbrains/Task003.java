// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

package ru.geekbrains;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {
        LinkedList<String> stk = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.equalsIgnoreCase("print")) {
                Iterator<String> itr = stk.iterator();
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
            } else if (str.equalsIgnoreCase("revert")) {
//                stk.removeFirst();
                stk.pop();
            } else {
//                stk.addFirst(str);
                stk.push(str);
            }
        }
    }
}
