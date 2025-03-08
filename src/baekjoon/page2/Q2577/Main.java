package baekjoon.page2.Q2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int sum = a * b * c;

        int[] digitCount = new int[10];

        String convertSum = String.valueOf(sum);

        for (int i = 0; i < convertSum.length(); i++) {
            char ch = convertSum.charAt(i);
            digitCount[ch - '0']++;
        }

        for (int count : digitCount) {
            System.out.println(count);
        }
    }
}
