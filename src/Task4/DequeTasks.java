package Task4;

import java.util.Deque;

public class DequeTasks {

    public static Deque rotateDeque(Deque deque, int n) {
        if (deque.isEmpty() || n == 0) return deque;
        if (n > deque.size()) n %= deque.size();
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
