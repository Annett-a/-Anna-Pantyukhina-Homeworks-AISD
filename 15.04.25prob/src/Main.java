import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа работы с LinkedList");
        while (true) {
            System.out.println();
            System.out.println("Доступные команды:");
            System.out.println("1: addFirst X — добавить X в начало");
            System.out.println("2: addLast X — добавить X в конец");
            System.out.println("3: removeFirst — удалить первый элемент");
            System.out.println("4: remove X — удалить первое вхождение X");
            System.out.println("5: contains X — проверить наличие X");
            System.out.println("6: size — размер списка");
            System.out.println("7: clear — очистить список");
            System.out.println("8: print — вывести список");
            System.out.println("0: exit — выйти из программы");
            System.out.print("Введите команду: ");
            int cmd = sc.nextInt();
            switch (cmd) {
                case 0:
                    System.out.println("Выход");
                    sc.close();
                    return;
                case 1:
                    System.out.print("Введите число для addFirst: ");
                    list.addFirst(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Введите число для addLast: ");
                    list.addLast(sc.nextInt());
                    break;
                case 3:
                    try {
                        int removed = list.removeFirst();
                        System.out.println("Удалён первый элемент: " + removed);
                    } catch (RuntimeException e) {
                        System.out.println("Список пуст");
                    }
                    break;
                case 4:
                    System.out.print("Введите число для remove: ");
                    boolean removed = list.remove(sc.nextInt());
                    System.out.println(removed ? "Элемент удалён" : "Элемент не найден");
                    break;
                case 5:
                    System.out.print("Введите число для contains: ");
                    boolean found = list.contains(sc.nextInt());
                    System.out.println(found ? "Список содержит элемент" : "Список не содержит элемент");
                    break;
                case 6:
                    System.out.println("Размер списка: " + list.size());
                    break;
                case 7:
                    list.clear();
                    System.out.println("Список очищен");
                    break;
                case 8:
                    System.out.println("Содержимое списка: " + list);
                    break;
                default:
                    System.out.println("Неверная команда");
            }
        }
    }
}
