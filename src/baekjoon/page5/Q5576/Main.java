package baekjoon.page5.Q5576;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int people = 10;

        int[] w = new int[people];
        int[] k = new int[people];

        for (int i = 0; i < people; i++) {
            w[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < people; i++) {
            k[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(w);
        Arrays.sort(k);

        int wTotal = w[9] + w[8] + w[7];
        int kTotal = k[9] + k[8] + k[7];

        bw.write(wTotal + " " + kTotal);
        bw.flush();
        bw.close();
        br.close();
    }
}
