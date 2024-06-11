package baekjoon;

import java.util.Scanner;

public class Gugudan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (i * n));
        }
    }
}
