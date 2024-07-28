package baekjoon.page14.Q14909;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        while (st.hasMoreTokens()) {
            if (Integer.parseInt(st.nextToken()) > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
