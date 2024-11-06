package Task3;

import java.util.Arrays;
import java.util.LinkedList;

public class Task3 {
//    Задача 3. Количество вхождений слова
//    Реализуйте метод countOccurrences в классе ListUtils, который
//    принимает LinkedList<String> и строку, и возвращает количество
//    вхождений строки в список
public static void main(String[] args) {
    LinkedList<String> link = new LinkedList(Arrays.asList("лис", "змея", "койот", "ёж", "енот", "змея", "пёс", "койот", "ёж", "змея", "койот", "койот"));
    String word = "койот";
    System.out.println(countOccurrences(link, word));
}
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
