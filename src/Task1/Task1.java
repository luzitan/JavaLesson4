package Task1;

import java.util.Arrays;
import java.util.LinkedList;

public class Task1 {
//    Задание 1. Удаление нечетных строк
//    Дан LinkedList с несколькими элементами. В методе
//    removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
//    которых нечетная. Используйте LinkedList и стандартные методы.
public static void main(String[] args) {
    LinkedList link = new LinkedList(Arrays.asList("лис", "койот", "ёж", "енот", "змея", "пёс"));
    LLTasks.removeOddLengthStrings(link);
    System.out.println(link);

}
}
