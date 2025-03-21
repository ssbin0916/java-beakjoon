package baekjoon.page11.Q11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int number = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            values.add(Integer.parseInt(br.readLine()));
        }

        values.sort(Collections.reverseOrder());

        int count = 0;
        for (Integer value : values) {
            if (money == 0) {
                break;
            }
            count += money / value;
            money %= value;
        }
        System.out.println(count);
    }
}
