package baekjoon.page10.Q10808;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] alphabet = new int[26];
        char[] S = scanner.next().toCharArray();

        for (int i = 0; i < S.length; i++) {
            alphabet[S[i] - 97]++;
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
