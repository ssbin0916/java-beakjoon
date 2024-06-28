package baekjoon.Q11720;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String str = scanner.next();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += str.charAt(i) - '0';
        }
        scanner.close();

        System.out.println(sum);
    }
}
