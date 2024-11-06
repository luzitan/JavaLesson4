package Task4;

import java.security.PublicKey;
import java.util.Deque;
import java.util.LinkedList;

public class Task4 {
//    Задача 4. Сдвиг очереди
//    Реализуйте метод rotateDeque в классе DequeTasks, который принимает
//    Deque<Integer> и число n. Метод должен повернуть очередь вправо на n
//    позиций. Если n отрицательное, повернуть влево.
public static void main(String[] args) {
    Deque<Integer> deque = new LinkedList<>();
    deque.add(1);
    deque.add(2);
    deque.add(3);
    deque.add(4);
    deque.add(5);
    deque.add(6);
    deque.add(7);
    int n = 11;
    System.out.println(rotateDeque(deque, n));
}
public static Deque rotateDeque(Deque deque, int n) {
    if (deque.isEmpty()) return deque;
    if (n > deque.size()) n %= deque.size();
    if (n == 0) return deque;
    if (n > 0) {
        for (int i = 0; i < n; i++) {
            deque.addLast(deque.getFirst());
            deque.removeFirst();
        }
        return deque;
    }
    for (int i = 0; i < -n; i++) {
        deque.addFirst(deque.getLast());
        deque.removeLast();
    }
    return deque;



}

}
