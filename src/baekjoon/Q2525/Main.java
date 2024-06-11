package baekjoon.Q2525;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = scanner.nextInt();

        int min = 60 * a + b;
        min += c;

        int h = (min / 60) % 24;
        int m = min % 60;

        System.out.println(h + " " + m);
    }
}
