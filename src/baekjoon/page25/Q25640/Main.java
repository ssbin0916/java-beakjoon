package baekjoon.page25.Q25640;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String jinho = scanner.next();

        int N = scanner.nextInt();
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.next();
        }

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (jinho.equals(arr[i])) {
                result++;
            }
        }
        System.out.println(result);
    }
}
