package baekjoon.Q2476;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int maxPrice = 0;

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int price = 0;
            int maxNum = 0;

            if (a == b && b == c) {
                price = 10000 + a * 1000;
            } else if (a == b && b != c || a == c && a != b) {
                price = 1000 + a * 100;
            } else if (b == c && b != a) {
                price = 1000 + b * 100;
            } else {
                maxNum = Math.max(a, b);
                maxNum = Math.max(maxNum, c);
                price = maxNum * 100;
            }
            maxPrice = Math.max(maxPrice, price);
        }
        System.out.println(maxPrice);
        scanner.close();
    }
}
