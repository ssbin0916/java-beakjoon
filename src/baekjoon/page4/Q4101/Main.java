package baekjoon.page4.Q4101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            if (A == 0 && B == 0) {
                break;
            }

            if (A > B) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
