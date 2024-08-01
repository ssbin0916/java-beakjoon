package baekjoon.page1.Q1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = 4;
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = arr[0];
        int y = arr[1];
        int w = arr[2];
        int h = arr[3];

        int wx = w - x;
        int hy = h - y;

        int min = Math.min(Math.min(x, y), Math.min(wx, hy));

        System.out.println(min);
    }
}
