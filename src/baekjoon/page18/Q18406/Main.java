package baekjoon.page18.Q18406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(String.valueOf(s.charAt(i)));
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = Integer.parseInt(list.get(i));
        }

        int a = arr.length / 2;

        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < a; i++) {
            sumA += arr[i];
        }

        for (int i = a; i < arr.length; i++) {
            sumB += arr[i];
        }

        if (sumA == sumB) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}
