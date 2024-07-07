package baekjoon.page2.Q2752;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = 3;

        int[] arr = new int[3];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
