package baekjoon.page3.Q3003;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] - scanner.nextInt() + " ");
        }
    }
}

