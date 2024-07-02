package baekjoon.page5.Q5522;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total = 0;

        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            total += n;
        }

        System.out.println(total);
    }
}
