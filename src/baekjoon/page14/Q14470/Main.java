package baekjoon.page14.Q14470;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        int temperature = 0;
        int result = 0;

        if (a < 0) {
            while (a != 0) {
                temperature++;
                a++;
            }
            int iceMeet = temperature * c;
            int meet = d;
            int hotMeet = b * e;

            result = iceMeet + meet + hotMeet;
            System.out.println(result);
        } else if (a == 0) {
            while (a != b) {
                temperature++;
                a++;
            }
            result = d + (temperature * e);
            System.out.println(result);
        } else if (a > 0) {
            while (a != b) {
                temperature++;
                a++;
            }
            result = temperature * e;
            System.out.println(result);
        }
    }
}
