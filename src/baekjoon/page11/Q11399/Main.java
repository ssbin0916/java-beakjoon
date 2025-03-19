package baekjoon.page11.Q11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> minutes = new ArrayList<>();
        while (st.hasMoreTokens()) {
            minutes.add(Integer.parseInt(st.nextToken()));
        }

        minutes.sort(Integer::compareTo);

        int sum = 0;
        int total = 0;

        for (int i = 0; i < people; i++) {
            sum += minutes.get(i);
            total += sum;
        }

        System.out.println(total);
    }
}
