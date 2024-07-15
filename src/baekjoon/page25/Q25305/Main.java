package baekjoon.page25.Q25305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] array = br.readLine().split(" ");
        int n = Integer.parseInt(array[0]);
        int k = Integer.parseInt(array[1]);

        String[] score = br.readLine().split(" ");
        int[] students = new int[n];

        for (int i = 0; i < n; i++) {
            students[i] = Integer.parseInt(score[i]);
        }

        Arrays.sort(students);

        int result = students[n - k];
        System.out.println(result);
    }
}
