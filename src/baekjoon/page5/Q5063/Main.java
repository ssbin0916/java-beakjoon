package baekjoon.page5.Q5063;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        for (int i = 0; i < number; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            bw.write(calculate(r, e, c));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static String calculate(int r, int e, int c) {

        String result = "";

        if (r == e - c) {
            result = "does not matter";
            return result;
        }

        if (r < e - c) {
            result = "advertise";
            return result;

        }

        if (r > e - c) {
            result = "do not advertise";
            return result;
        }

        return result;
    }
}
