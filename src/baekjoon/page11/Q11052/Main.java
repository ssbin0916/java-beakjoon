package baekjoon.page11.Q11052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] p = new int[count + 1];
        int[] dp = new int[count + 1];

        String[] input = br.readLine().split(" ");
        for (int i = 1; i <= count; i++) {
            p[i] = Integer.parseInt(input[i - 1]);
        }

        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], dp[i - j] + p[j]);
            }
        }

        System.out.println(dp[count]);
    }
}
