package baekjoon.Q9086;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            String str = scanner.next();
            String[] split = str.split("");
            System.out.println(split[0] + split[split.length - 1]);
        }
        scanner.close();
    }
}
