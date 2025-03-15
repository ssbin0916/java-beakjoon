package baekjoon.page5.Q5585;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int yen = 1000;
        int change = yen - input;

        int count = 0;
        int[] coins = {500, 100, 50, 10, 5, 1};
        for (int coin : coins) {
            count += change / coin;
            change %= coin;
        }
        System.out.println(count);
    }
}
