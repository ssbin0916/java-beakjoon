package baekjoon.page1.Q1547;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        int[] cups = {0, 1, 2, 3};

        for (int i = 0; i < number; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            int temp = cups[x];
            cups[x] = cups[y];
            cups[y] = temp;
        }

        boolean found = false;

        for (int i = 1; i <= 3; i++) {
            if (cups[i] == 1) {
                bw.write(i + " ");
                found = true;
                break;
            }
        }

        if (!found) {
            bw.write("-1");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
