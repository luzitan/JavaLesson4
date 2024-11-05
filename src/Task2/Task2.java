package Task2;

public class Task2 {
//    Задача 2. Реализация стека
//    Реализуйте MyStack с использованием LinkedList с методами:
//            ● push(String element) - добавляет элемент на вершину стека
//            ● pop() - возвращает элемент с вершины и удаляет его
//            ● peek() - возвращает элемент с вершины, не удаляя
//            ● getElements() - возвращает все элементы стека

    public static void main(String[] args) {
        GBLinkedList stack = new GBLinkedList();
        stack.push(5);
        stack.push(4);
        stack.push(9);
        stack.push(7);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.getElements());
    }
}
