package Task1;

import java.util.LinkedList;

public class LLTasks {
    public static void removeOddLengthStrings(LinkedList link) {
        for (int i = 0; i < link.size(); i++) {
            if (link.get(i).toString().length() % 2 != 0){
                link.remove(i);
                i--;
            }
        }
    }
}
