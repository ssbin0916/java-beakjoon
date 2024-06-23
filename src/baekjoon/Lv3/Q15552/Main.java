package baekjoon.Lv3.Q15552;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int T = Integer.parseInt(br.readLine());

            for (int i = 0; i < T; i++) {
                String[] input = br.readLine().split(" ");
                int A = Integer.parseInt(input[0]);
                int B = Integer.parseInt(input[1]);

                bw.write((A + B) + "\n");
            }

            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
