package baekjoon.page1.Q1712;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (c <= b) {
            System.out.println("-1");
        } else {
            System.out.println((a / (c - b)) + 1);
        }
    }
}
