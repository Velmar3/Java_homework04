import java.util.Scanner;
import java.util.Stack;

// Напишите постфиксный калькулятор.
// Пользователь вводит данные и операции в обратной польской записи.
// Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
// Например:
// 5 4 3 - + => 5 1 + => 6

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные операции в обратной польской записи: ");
        String[] operation = scanner.nextLine().split(" ");
        scanner.close();

        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < operation.length; i++) {

            if (isDigit(operation[i])) {
                stack.push(Integer.parseInt(operation[i]));
            } else {
                switch (operation[i]) {
                    case "+":
                        result = stack.pop() + stack.pop();
                        stack.push(result);
                        break;
                    case "-":
                        result = stack.pop() - stack.pop();
                        stack.push(result);
                        break;
                    case "*":
                        result = stack.pop() * stack.pop();
                        stack.push(result);
                        break;
                    case "/":
                        result = stack.pop() / stack.pop();
                        stack.push(result);
                        break;
                }
            }
        }
        System.out.printf("Result = %d\n", stack.pop());
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
