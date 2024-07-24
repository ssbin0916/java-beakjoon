package baekjoon.page10.Q10824;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input = 4;

        String[] arr = new String[input];

        for (int i = 0; i < input; i++) {
            arr[i] = st.nextToken();
        }

        String a = arr[0] + arr[1];
        String b = arr[2] + arr[3];

        long x = Long.parseLong(a);
        long y = Long.parseLong(b);

        long result = x + y;

        System.out.println(result);
    }
}