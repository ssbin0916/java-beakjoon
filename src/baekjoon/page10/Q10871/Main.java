package baekjoon.page10.Q10871;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];


        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            if (a[i] < x) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
