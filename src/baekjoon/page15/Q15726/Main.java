package baekjoon.page15.Q15726;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextInt();
        double B = scanner.nextInt();
        double C = scanner.nextInt();

        double resultA = A * B / C;
        double resultB = A / B * C;

        int max = (int) Math.max(resultA, resultB);

        System.out.println(max);
    }
}
