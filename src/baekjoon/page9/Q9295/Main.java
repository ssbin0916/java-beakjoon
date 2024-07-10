package baekjoon.page9.Q9295;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[i] = a + b;
        }
        scanner.close();

        for (int i = 1; i <= T; i++) {
            System.out.println("Case " + i + ": " + arr[i - 1]);
        }
    }
}
