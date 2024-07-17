package baekjoon.page1.Q1267;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ysTotalFee = 0;
        int msTotalFee = 0;

        while (st.hasMoreTokens()) {
            int callDuration = Integer.parseInt(st.nextToken());

            ysTotalFee += ((callDuration / 30) + 1) * 10;
            msTotalFee += ((callDuration / 60) + 1) * 15;
        }

        if (ysTotalFee < msTotalFee) {
            System.out.println("Y " + ysTotalFee);
        } else if (msTotalFee < ysTotalFee) {
            System.out.println("M " + msTotalFee);
        } else {
            System.out.println("Y M " + ysTotalFee);
        }
    }
}