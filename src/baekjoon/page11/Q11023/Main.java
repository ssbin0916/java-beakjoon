package baekjoon.page11.Q11023;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;

        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(sum));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
