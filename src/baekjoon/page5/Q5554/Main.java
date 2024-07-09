package baekjoon.page5.Q5554;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        int total = a + b + c + d;

        int s = 0;
        int m = 0;

        if (total > 59) {
            m += total / 60;
            s = total % 60;
        }

        System.out.println(m);
        System.out.println(s);
    }
}
