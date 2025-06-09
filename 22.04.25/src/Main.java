import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа работы с Queue");
        while (true) {
            System.out.println();
            System.out.println("Доступные команды:");
            System.out.println("1: enqueue X — добавить X в очередь");
            System.out.println("2: dequeue — удалить и вернуть первый элемент");
            System.out.println("3: peek — посмотреть первый элемент");
            System.out.println("4: isEmpty — проверить, пуста ли очередь");
            System.out.println("5: size — размер очереди");
            System.out.println("6: clear — очистить очередь");
            System.out.println("7: print — вывести содержимое очереди");
            System.out.println("0: exit — выход");
            System.out.print("Введите команду: ");
            int cmd = sc.nextInt();
            switch (cmd) {
                case 0:
                    System.out.println("Выход из программы.");
                    sc.close();
                    return;
                case 1:
                    System.out.print("Введите число для enqueue: ");
                    int enqVal = sc.nextInt();
                    queue.enqueue(enqVal);
                    System.out.println("Добавлено: " + enqVal);
                    break;
                case 2:
                    try {
                        int deq = queue.dequeue();
                        System.out.println("Удалено: " + deq);
                    } catch (RuntimeException e) {
                        System.out.println("Очередь пуста");
                    }
                    break;
                case 3:
                    try {
                        int first = queue.peek();
                        System.out.println("Первый элемент: " + first);
                    } catch (RuntimeException e) {
                        System.out.println("Очередь пуста");
                    }
                    break;
                case 4:
                    System.out.println(queue.isEmpty() ? "Очередь пуста" : "Очередь не пуста");
                    break;
                case 5:
                    System.out.println("Размер очереди: " + queue.size());
                    break;
                case 6:
                    queue.clear();
                    System.out.println("Очередь очищена");
                    break;
                case 7:
                    System.out.println("Содержимое очереди: " + queue);
                    break;
                default:
                    System.out.println("Неверная команда");
            }
        }
    }
}
