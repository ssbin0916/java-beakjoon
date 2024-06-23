package baekjoon.Lv4.Q1546;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        int M = arr[0];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > M) {
                M = arr[i];
            }
        }

        scanner.close();

        double total = 0;
        for (int i = 0; i < N; i++) {
            total += (double) arr[i] / M * 100;
        }

        double avg = total / N;
        System.out.println(avg);
    }
}
