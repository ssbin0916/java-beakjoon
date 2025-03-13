package baekjoon.page2.Q2490;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = 3;

        for (int i = 0; i < number; i++) {
            List<Integer> list = new ArrayList<>();
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int count = 0;

            for (int j = 0; j < 4; j++) {
                if (Integer.parseInt(stringTokenizer.nextToken()) == 1) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("D");
            }

            if (count == 1) {
                System.out.println("C");
            }

            if (count == 2) {
                System.out.println("B");
            }

            if (count == 3) {
                System.out.println("A");
            }

            if (count == 4) {
                System.out.println("E");
            }
        }
    }
}
