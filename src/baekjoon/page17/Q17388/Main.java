package baekjoon.page17.Q17388;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int soongsil = Integer.parseInt(st.nextToken());
        int korea = Integer.parseInt(st.nextToken());
        int hanyang = Integer.parseInt(st.nextToken());

        int total = soongsil + korea + hanyang;

        int[] arr = {soongsil, korea, hanyang};

        int min = arr[0];

        if (total >= 100) {
            System.out.println("OK");
            return;
        } else {
            if (arr[1] < min) {
                min = arr[1];
            }
            if (arr[2] < min) {
                min = arr[2];
            }
        }

        if (min == arr[0]) {
            System.out.println("Soongsil");
        } else if (min == arr[1]) {
            System.out.println("Korea");
        } else if (min == arr[2]) {
            System.out.println("Hanyang");
        }

    }
}
