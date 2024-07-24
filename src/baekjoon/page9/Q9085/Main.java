package baekjoon.page9.Q9085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        int total = 0;
        for (int i = 0; i < t; i++) {
            int a = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[a];
            for (int j = 0; j < a; j++) {
                arr[i] = Integer.parseInt(st.nextToken());
                total += arr[i];
            }
            System.out.println(total);
            total = 0;
        }
    }
}