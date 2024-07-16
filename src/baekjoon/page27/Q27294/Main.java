package baekjoon.page27.Q27294;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int time = Integer.parseInt(st.nextToken());
        int alcohol = Integer.parseInt(st.nextToken());

        if (time >= 12 && time <= 16 && alcohol == 0) {
            System.out.println(320);
        } else {
            System.out.println(280);
        }
    }
}
