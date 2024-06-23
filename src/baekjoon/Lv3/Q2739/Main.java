package baekjoon.Lv3.Q2739;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (i * n));
        }
    }
}
