package baekjoon.page10.Q10886;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int oneCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                oneCount++;
            } else if (arr[i] == 0) {
                zeroCount++;
            }
        }

        if (oneCount > zeroCount) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");
        }
    }
}
