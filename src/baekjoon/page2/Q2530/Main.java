package baekjoon.page2.Q2530;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();

        int time = scanner.nextInt();

        s += time;

        if (s > 59) {
            m += s / 60;
            s = s % 60;
        }

        if (m > 59) {
            h += m / 60;
            m = m % 60;
        }

        if (h > 23) {
            h = h % 24;
        }

        System.out.println(h + " " + m + " " + s);
    }
}