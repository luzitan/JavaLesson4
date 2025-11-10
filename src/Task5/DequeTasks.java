package Task5;

import java.util.Deque;

public class DequeTasks {
    public static Deque removeAllOccurrences(Deque<String> deque, String value) {
        deque.removeIf(el -> el.equals(value));
        return deque;
    }
}
