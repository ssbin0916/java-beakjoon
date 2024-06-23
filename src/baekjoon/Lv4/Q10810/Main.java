package baekjoon.Lv4.Q10810;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr = new int[N];

        for (int x = 0; x < M; x++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            for (int y = i - 1; y < j; y++) {
                arr[y] = k;
            }
        }
        for (int a = 0; a < N; a++) {
            System.out.print(arr[a] + " ");
        }
    }
}
