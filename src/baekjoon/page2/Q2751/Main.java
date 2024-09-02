package baekjoon.page2.Q2751;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        int[] numbers = new int[number];

        for (int i = 0; i < number; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        for (int i = 0; i < number; i++) {
            bw.write(numbers[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
