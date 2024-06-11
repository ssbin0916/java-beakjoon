package baekjoon;

import java.util.Scanner;

public class Remain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a % b);
        scanner.close();
    }
}
