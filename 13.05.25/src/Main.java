import java.util.Scanner;

public class Main {
    public static int findPeak(int[] a) {
        int low = 0;
        int high = a.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (a[mid] < a[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        int peakIndex = findPeak(a);
        System.out.println("Индекс вершины: " + peakIndex);
        System.out.println("Значение в вершине: " + a[peakIndex]);
    }
}
