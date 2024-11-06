package Task5;

import java.util.Deque;
import java.util.LinkedList;

public class Task5 {
//    Задача 5*. Удаление слова из очереди
//    Реализуйте метод removeAllOccurrences в классе DequeTasks, который
//    принимает Deque<String> и строку value. Метод должен удалить все
//    вхождения строки value из очереди.
public static void main(String[] args) {
    Deque<String> deque = new LinkedList<>();
    deque.add("ёж");
    deque.add("енот");
    deque.add("лис");
    deque.add("заяц");
    deque.add("заяц");
    deque.add("лис");
    deque.add("лис");
    String value = "лис";
    System.out.println(removeAllOccurrences(deque, value));
}
public static Deque removeAllOccurrences(Deque<String> deque, String value) {
    deque.removeIf(el -> el.equals(value));
    return deque;
}
}
