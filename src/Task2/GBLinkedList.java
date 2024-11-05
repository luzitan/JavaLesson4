package Task2;

import java.util.LinkedList;

//            ● push(String element) - добавляет элемент на вершину стека
//            ● pop() - возвращает элемент с вершины и удаляет его
//            ● peek() - возвращает элемент с вершины, не удаляя
//            ● getElements() - возвращает все элементы стека
public class GBLinkedList {
    private LinkedList stack = new LinkedList();

    public void push(Integer element) {
        stack.addFirst(element);
    }

    public int pop() {
        return (Integer) stack.pop();
    }
    public int peek() {
        return (Integer) stack.peek();
    }
    public LinkedList getElements() {
        return stack;
    }
    @Override
    public String toString() {
        if (stack.isEmpty()) return "[]";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            builder.append(stack.get(i)).append(", ");
        }

        builder.delete(builder.length() - 2, builder.length());
        return String.format("[%s]", builder); //return builder.toString()
}

}