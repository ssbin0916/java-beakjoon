package baekjoon.Q11021;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 1; i <= t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("Case #" + i + ": " + (a + b));
        }
    }
}
