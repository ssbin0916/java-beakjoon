package baekjoon.page10.Q10102;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int judgeCount = Integer.parseInt(br.readLine());
        String judgeVotes = br.readLine();
        int selectA = 0;
        int selectB = 0;

        for (int i = 0; i < judgeCount; i++) {
            char vote = judgeVotes.charAt(i);

            if (vote == 'A') {
                selectA++;
            }

            if (vote == 'B') {
                selectB++;
            }
        }

        if (selectA == selectB) {
            bw.write("Tie");
        }

        if (selectA > selectB) {
            bw.write("A");
        }

        if (selectA < selectB) {
            bw.write("B");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
