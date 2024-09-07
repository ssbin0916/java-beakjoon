package baekjoon.page9.Q9655;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        if (number % 2 == 1) {
            bw.write("SK");
        }

        if (number % 2 == 0) {
            bw.write("CY");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
