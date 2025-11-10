package Task3;

import java.util.LinkedList;

public class ListUtils {

    public static int countOccurrences(LinkedList<String> link, String word) {
        int count = 0;
        for (String l: link) {
            if (l.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
