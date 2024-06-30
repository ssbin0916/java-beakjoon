package baekjoon.Q2475;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int square = 0;
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int N = scanner.nextInt();
            square = N * N;
            sum += square;
        }

        System.out.println(sum % 10);
    }
}
