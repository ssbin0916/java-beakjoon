package baekjoon.page9.Q9656;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        if (number % 2 == 1) {
            bw.write("CY");
        }

        if (number % 2 == 0) {
            bw.write("SK");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
