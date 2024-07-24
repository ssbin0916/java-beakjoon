package baekjoon.page3.Q3058;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[7];
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                if (arr[j] % 2 == 0) {
                    list.add(arr[j]);
                }
            }

            int sum = 0;
            int min = Integer.MAX_VALUE;

            for (int num : list) {
                sum += num;
                if (num < min) {
                    min = num;
                }
            }
            System.out.println(sum + " " + min);
        }
    }
}