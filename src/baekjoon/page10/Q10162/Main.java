package baekjoon.page10.Q10162;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());

        if (time % 10 != 0) {
            System.out.println(-1);
            return;
        }

        int fiveMinutes = time / 300;
        time %= 300;

        int minutes = time / 60;
        time %= 60;

        int seconds = time / 10;
        time %= 10;

        System.out.println(fiveMinutes + " " + minutes + " " + seconds);
    }
}
