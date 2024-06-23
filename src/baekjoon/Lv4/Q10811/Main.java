package baekjoon.Lv4.Q10811;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int x = 0; x < M; x++) {
            int i = scanner.nextInt() - 1;
            int j = scanner.nextInt() - 1;
            int temp = 0;

            while (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

        }

        scanner.close();

        for (int y = 0; y < N; y++) {
            System.out.print(arr[y] + " ");
        }
    }
}
