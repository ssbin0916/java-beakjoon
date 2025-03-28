package baekjoon.page8.Q8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        List<String> oxList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String ox = br.readLine().trim();
            oxList.add(ox);
            result.add(solve(ox));
        }

        br.close();

        for (Integer integer : result) {
            System.out.println(integer);
        }
    }

    private static int solve(String ox) {
        int total = 0;
        int score = 0;

        for (char ch : ox.toCharArray()) {
            if (ch == 'O') {
                score++;
                total += score;
            }

            if (ch == 'X') {
                score = 0;
            }
        }

        return total;
    }
}
