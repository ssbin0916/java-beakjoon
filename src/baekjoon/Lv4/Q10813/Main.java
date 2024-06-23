package baekjoon.Lv4.Q10813;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        for (int x = 0; x < M; x++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int a = 1; a <= N; a++) {
            System.out.print(arr[a] + " ");
        }
    }
}
