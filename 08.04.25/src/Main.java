import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] coins = {10, 5, 2, 1};

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму сдачи: ");
        int amount = sc.nextInt();
        sc.close();

        System.out.println("Сдача минимальным числом монет:");
        for (int coin : coins) {
            if (amount >= coin) {
                int count = amount / coin;
                System.out.println(count + " монет(ы) по " + coin);
                amount %= coin;
            }
        }
    }
}
