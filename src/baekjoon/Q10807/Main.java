package baekjoon.Q10807;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (v == arr[i])
                count += 1;
        }
        System.out.println(count);
        scanner.close();
    }
}