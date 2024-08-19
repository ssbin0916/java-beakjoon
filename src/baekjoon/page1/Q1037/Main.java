package baekjoon.page1.Q1037;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] divisors = new int[number];

        for (int i = 0; i < number; i++) {
            divisors[i] = Integer.parseInt(st.nextToken());
        }

        int n = calculate(divisors);
        bw.write(n + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    static int calculate(int[] divisors) {

        int minDivisor = Arrays.stream(divisors).min().getAsInt();
        int maxDivisor = Arrays.stream(divisors).max().getAsInt();

        return minDivisor * maxDivisor;
    }
}
