package Task3;

import java.util.Arrays;
import java.util.LinkedList;

import static Task3.ListUtils.countOccurrences;

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

}
