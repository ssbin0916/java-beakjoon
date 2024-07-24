package baekjoon.page10.Q10768;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        int sMonth = 2;
        int sDay = 18;

        if (sMonth == month && sDay == day) {
            System.out.println("Special");
        } else if (sMonth < month || (sMonth == month && sDay < day)) {
            System.out.println("After");
        } else {
            System.out.println("Before");
        }

    }
}
