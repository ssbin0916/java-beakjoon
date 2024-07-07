package baekjoon.page3.Q3046;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int R1 = scanner.nextInt();
        int S = scanner.nextInt();
        scanner.close();

        int R2 = S * 2 - R1;

        System.out.println(R2);
    }
}
