package baekjoon.page2.Q2506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int streak = 0;
        int score = 0;
        for (int i = 0; i < count; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a == 1) {
                streak++;
                score += streak;
            }

            if (a == 0) {
                streak = 0;
            }
        }

        System.out.println(score);
    }
}
