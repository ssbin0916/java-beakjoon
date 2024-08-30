package baekjoon.page1.Q1978;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int primeCount = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(st.nextToken());
            if (isPrime(number)) {
                primeCount++;
            }
        }

        bw.write(primeCount + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
