package baekjoon.page4.Q4153;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) break;

            boolean isRight = false;

            if ((a * a) + (b * b) == (c * c)) {
                bw.write("right\n");
                isRight = true;
            }

            if (a * a == (b * b + c * c)) {
                bw.write("right\n");
                isRight = true;
            }

            if (b * b == (c * c + a * a)) {
                bw.write("right\n");
                isRight = true;
            }

            if (!isRight) {
                bw.write("wrong\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
