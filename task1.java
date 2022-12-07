import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.

public class task1 {
    public static void main(String[] args) {
        int[] listArray = { 9, 2, 1, 6, 3, 7, 0, 1 };
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (Integer temp : listArray) {
            linkedList.add(temp);
        }

        int temp = 0;
        while (temp != linkedList.size() - 1) {
            linkedList.add(linkedList.size() - temp, linkedList.getFirst());
            linkedList.removeFirst();
            temp++;
        }

        System.out.println("LinkedList = " + linkedList);
    }
}
