package baekjoon.Lv3.Q8393;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        int total = 0;
        int sum = 1;
        for (int i = 0; i < n; i++) {
            total += sum;
            sum++;
        }
        System.out.println(total);
    }
}
