package baekjoon.page2.Q2693;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());
        int count = 10;
        int[] array = new int[count];

        for (int i = 0; i < test; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            calculate(count, array, st, bw);
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void calculate(int count, int[] array, StringTokenizer st, BufferedWriter bw) throws IOException {
        for (int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);
        bw.write(array[7] + "\n");
    }
}