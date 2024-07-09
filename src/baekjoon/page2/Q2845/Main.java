package baekjoon.page2.Q2845;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int L = scanner.nextInt();
        int P = scanner.nextInt();
        int people = L * P;

        int N = 5;

        int[] newspaper = new int[N];

        for (int i = 0; i < N; i++) {
            newspaper[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            System.out.print(newspaper[i] - people + " ");
        }
    }
}
