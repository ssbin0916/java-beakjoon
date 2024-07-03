package baekjoon.page10.Q10039;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int N = scanner.nextInt();
            sum += Math.max(N, 40);
        }

        int avg = sum / 5;

        System.out.println(avg);
    }
}
