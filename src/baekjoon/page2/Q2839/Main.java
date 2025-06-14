package baekjoon.page2.Q2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sugar = Integer.parseInt(br.readLine());

        int count = 0;

        while (sugar >= 0) {
            if (sugar % 5 == 0) {
                count += sugar / 5;
                System.out.println(count);
                return;
            }
            sugar -= 3;
            count++;
        }

        System.out.println(-1);
    }
}
