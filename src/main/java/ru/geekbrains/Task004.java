// 1) Написать метод, который принимает массив элементов,
// помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов,
// помещает их в очередь и выводит на консоль содержимое очереди.

package ru.geekbrains;

import java.util.LinkedList;

public class Task004 {
    public static void main(String[] args) {
        Object[] arr = {1, 5, "qwerty", 18, "uiop"};
        AddToStack(arr);
        AddToQueue(arr);
    }

    public static void AddToStack(Object[] obj) {
        LinkedList<Object> stack = new LinkedList<>();
        for (Object object: obj) {
            stack.push(object);
        }
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }

    public static void AddToQueue(Object[] obj) {
        LinkedList<Object> queue = new LinkedList<>();
        for (Object object: obj) {
            queue.offer(object);
        }
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}
