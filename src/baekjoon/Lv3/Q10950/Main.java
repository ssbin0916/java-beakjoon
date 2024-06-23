package baekjoon.Lv3.Q10950;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int[] arr = new int[T];

        for (int i = 0; i < arr.length; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            arr[i] = A + B;
        }
        for (int i : arr) {
            System.out.println(i);
            scanner.close();
        }
    }
}
