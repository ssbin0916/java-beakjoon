package baekjoon.page10.Q10156;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();

        if ((K * N) > M) {
            System.out.println((K * N) - M);
        } else {
            System.out.println(0);
        }
    }
}
