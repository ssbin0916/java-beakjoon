package baekjoon.page5.Q5524;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.next().toLowerCase();
        }

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
