package baekjoon.page14.Q14916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int exchange = Integer.parseInt(br.readLine());

        int count = 0;

        if (exchange == 1 || exchange == 3) {
            System.out.println(-1);
            return;
        }

        while (exchange > 0) {
            if (exchange % 5 == 0) {
                count += exchange / 5;
                exchange %= 5;
            } else {
                exchange -= 2;
                count++;
            }
        }

        System.out.println(count);
    }
}
