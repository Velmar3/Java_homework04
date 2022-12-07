import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class task2 {
    public static void main(String[] args) {
        int[] listArray = { 9, 2, 1, 6, 3, 7, };

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer temp : listArray) {
            linkedList.add(temp);
        }

        System.out.println(linkedList);

        enqueue(linkedList, 0);
        System.out.println(linkedList);

        System.out.println(dequeue(linkedList));
        System.out.println(linkedList);

        System.out.println(first(linkedList));
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}
