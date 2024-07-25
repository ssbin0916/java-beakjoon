package baekjoon.page2.Q2576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = 7;
        int[] arr = new int[input];

        for (int i = 0; i < input; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                list.add(arr[i]);
            }
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (Integer integer : list) {
            sum += integer;
            if (integer < min) {
                min = integer;
            }
        }

        if (list.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
