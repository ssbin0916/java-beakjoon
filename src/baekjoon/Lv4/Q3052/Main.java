package baekjoon.Lv4.Q3052;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        boolean value;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt() % 42;
        }

        for (int i = 0; i < arr.length; i++) {
            value = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    value = true;
                    break;
                }
            }
            if (!value) {
                count++;
            }
        }
        System.out.println(count);
    }
}
